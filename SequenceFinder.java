import java.util.regex.*;
import java.util.Scanner;

class RandomString { 
    static String getAlphaNumericString(int n) { 
        String AlphaNumericString = "ATGCATGCATGCATGC"; 
        StringBuilder sb = new StringBuilder(n); 
        for (int i = 0; i < n; i++) { 
            int index = (int)(AlphaNumericString.length() * Math.random()); 
            sb.append(AlphaNumericString.charAt(index)); 
        } 
        return sb.toString(); 
    } 
    
    public static void main(String[] args) { 
        int n = 20; 
        System.out.println("Random sequence generated: " + RandomString.getAlphaNumericString(n));
    }
}

public class SequenceFinder {

    public static void main(String[] args) {
        
        String Seq, targetString;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Do you want to provide a target string? (yes/no): ");
        String choice = input.nextLine().trim().toLowerCase();

        if (choice.equals("no")) {
            targetString = RandomString.getAlphaNumericString(50);
            System.out.println("Generated random target string: " + targetString);
        } else {
            System.out.println("Enter the target string:");
            targetString = input.nextLine();
        }

        System.out.println("Enter the sequence to search for:");
        Seq = input.nextLine();

        String escapedSeq = Pattern.quote(Seq);
        
        Pattern p = Pattern.compile(escapedSeq);
        Matcher m = p.matcher(targetString);

        int count = 0;
        System.out.println("Positions where the sequence is found:");

        while (m.find()) {
            count++;
            System.out.println("Found at position: " + m.start());
        }

        if (count > 0) {
            System.out.println("The sequence was found " + count + " times.");
        } else {
            System.out.println("The sequence was not found.");
        }
    }
}