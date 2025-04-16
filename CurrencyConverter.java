import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Currency cost = new Currency();
        cost.in(); 
    }
}

class Currency {
    double dollar = 86.54;
    double euro = 90.13;
    double pound = 107.61;
    double INRrupee = 0;

    public double calc(String currency, double amount) {
        double rupee = 0;
        
        switch(currency.toLowerCase()) {
            case "dollar":
                rupee = dollar * amount;
                break;
            case "euro":
                rupee = euro * amount;
                break;
            case "pound":
                rupee = pound * amount;
                break;
            default:
                System.out.println("Invalid currency type");
                return 0;
        }

        INRrupee += rupee;
        System.out.println("The total money required is = " + INRrupee);
        return INRrupee;
    }

    public void in() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the currency type (dollar/euro/pound): ");
        String currency = sc.nextLine();

        System.out.print("Enter the amount: ");
        double amount = sc.nextDouble();

        calc(currency, amount);
    }
}
