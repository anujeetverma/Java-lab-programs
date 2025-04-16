import java.util.Scanner;


interface Player {
    void setName(String name);
    String getName();
    void setStatistics(Statistics stats);
    void getStatistics();
}

interface Game {
    void playGame();
}


class Statistics {
    int matchesPlayed;
    int totalGoals;
    int totalWickets;
    int winsRegional;
    int winsNational;
    int winsInternational;
    String sport;

    
    public Statistics(int matches, int points, int regional, int national, int international, String sport) {
        this.matchesPlayed = matches;
        this.totalGoals = points;  //  points = goals
        this.winsRegional = regional;
        this.winsNational = national;
        this.winsInternational = international;
        this.sport = sport;
    }

    
    public Statistics(int matches, int wickets, int regional, int national, String sport,int international) {
        this.matchesPlayed = matches;
        this.totalWickets = wickets;
        this.winsRegional = regional;
        this.winsNational = national;
        this.winsInternational = international;
        this.sport = sport;
    }


    public double getAverage() {
        return sport.equals("cricket") ? (double) totalWickets / matchesPlayed : (double) totalGoals / matchesPlayed;
    }


    public void displayStatistics() {
        System.out.println("Matches Played: " + matchesPlayed);
        System.out.println("Total Goals/Wickets/Points: " + (sport.equals("cricket") ? totalWickets : totalGoals));
        System.out.println("Regional Wins: " + winsRegional);
        System.out.println("National Wins: " + winsNational);
        System.out.println("International Wins: " + winsInternational);
        System.out.println("Average Goals/Wickets/Points per Match: " + getAverage());
    }
}


class Football implements Player, Game {
    private String playerName;
    private Statistics playerStats;

    @Override
    public void setName(String name) {
        this.playerName = name;
    }

    @Override
    public String getName() {
        return playerName;
    }

    @Override
    public void setStatistics(Statistics stats) {
        this.playerStats = stats;
    }

    @Override
    public void getStatistics() {
        System.out.println("Football Player: " + playerName);
        playerStats.displayStatistics();
    }

    @Override
    public void playGame() {

        System.out.println(playerName + " is playing football!");
    }
}

class Cricket implements Player, Game {
    private String playerName;
    private Statistics playerStats;

    @Override
    public void setName(String name) {
        this.playerName = name;
    }

    @Override
    public String getName() {
        return playerName;
    }

    @Override
    public void setStatistics(Statistics stats) {
        this.playerStats = stats;
    }

    @Override
    public void getStatistics() {
        System.out.println("Cricket Player: " + playerName);
        playerStats.displayStatistics();
    }

    @Override
    public void playGame() {

        System.out.println(playerName + " is playing cricket!");
    }
}


class Basketball implements Player, Game {
    private String playerName;
    private Statistics playerStats;

    @Override
    public void setName(String name) {
        this.playerName = name;
    }

    @Override
    public String getName() {
        return playerName;
    }

    @Override
    public void setStatistics(Statistics stats) {
        this.playerStats = stats;
    }

    @Override
    public void getStatistics() {
        System.out.println("Basketball Player: " + playerName);
        playerStats.displayStatistics();
    }

    @Override
    public void playGame() {
        
        System.out.println(playerName + " is playing basketball!");
    }
}


public class Player_stat {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take player name input
        System.out.print("Enter player's full name: ");
        String playerName = input.nextLine().trim();

        // Choose sport
        System.out.print("Choose sport (football, cricket, basketball): ");
        String sport = input.nextLine().toLowerCase().trim();

        Player player = null;
        Game gamePlayer = null;  

       
        switch (sport) {
            case "football":
                player = new Football();
                gamePlayer = (Football) player; 
                break;
            case "cricket":
                player = new Cricket();
                gamePlayer = (Cricket) player;  
                break;
            case "basketball":
                player = new Basketball();
                gamePlayer = (Basketball) player;  
                break;
            default:
                System.out.println("Invalid sport! Please enter a valid sport (football, cricket, or basketball).");
                input.close();
                return;
        }

        
        player.setName(playerName);

        
        System.out.print("Enter number of matches played: ");
        int matchesPlayed = getValidPositiveInt(input);

        System.out.print(sport.equals("cricket") ? "Enter total wickets: " : "Enter total goals (football/basketball): ");
        int goalsOrWickets = getValidPositiveInt(input);

        System.out.print("Enter number of regional wins: ");
        int regionalWins = getValidPositiveInt(input);

        System.out.print("Enter number of national wins: ");
        int nationalWins = getValidPositiveInt(input);

        System.out.print("Enter number of international wins: ");
        int internationalWins = getValidPositiveInt(input);

        
        Statistics stats = null;
        if (sport.equals("football") || sport.equals("basketball")) {
            stats = new Statistics(matchesPlayed, goalsOrWickets, regionalWins, nationalWins, internationalWins, sport);
        } else if (sport.equals("cricket")) {
            stats = new Statistics(matchesPlayed, goalsOrWickets, regionalWins, nationalWins, internationalWins, sport);
        }

      
        player.setStatistics(stats);

      
        player.getStatistics();

       
        if (gamePlayer != null) {
            gamePlayer.playGame(); 
        }

        input.close();
    }

   
    private static int getValidPositiveInt(Scanner input) {
        while (!input.hasNextInt()) {
            System.out.print("Invalid input! Please enter a valid positive integer: ");
            input.next();
        }
        int value = input.nextInt();
        while (value < 0) {
            System.out.print("Please enter a positive integer: ");
            value = input.nextInt();
        }
        return value;
    }
}