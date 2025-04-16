import java.util.Scanner;

class Subscriber {
    private String name;
    private long phno;
    private int unitConsumed;
    private int hireCharge;
    private double billAmount;

    public Subscriber(long phno, String name, int unitConsumed) {
        this.phno = phno;
        this.name = name;
        this.unitConsumed = unitConsumed;
        calculateBill();
    }

    private void calculateBill() {
        if (unitConsumed <= 150) {
            hireCharge = 300;
        } else {
            hireCharge = 500;
        }

        double unitCharge = 0.0;

        if (unitConsumed > 200) {
            unitCharge += (unitConsumed - 200) * 2;
            unitConsumed = 200;
        }
        if (unitConsumed > 100) {
            unitCharge += (unitConsumed - 100) * 1.5;
            unitConsumed = 100;
        }
        unitCharge += unitConsumed * 1.0;

        billAmount = hireCharge + unitCharge;
    }

    public void display() {
        System.out.println("telephone Bill");
        System.out.println("Subscriber Name " + name);

         System.out.println("phone number    " + phno);
        System.out.println("units Consumed  " + unitConsumed);
        System.out.println("hire Charge Rs " + hireCharge);
        System.out.println("total bill Rs " + billAmount);
    }
}

public class bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter Ph Num: ");
        long phno = sc.nextLong();
        sc.nextLine(); 
        System.out.print("enter Subscriber Name: ");
        String name = sc.nextLine();

        System.out.print("enter Unit consumed    ");
        int unitConsumed = sc.nextInt();
        Subscriber subscriber = new Subscriber(phno, name, unitConsumed);
        subscriber.display();

        sc.close();
    }
}