import java.util.Scanner;

class Shapes {
    public static double calArea(double  r) 
    {
        return Math.PI * r * r;
    }
    public static double calPeri(double r) 
    {
        return 2 * Math.PI * r;
    }
    public static double calArea(double l, double b) 
    {
        return l * b;
    }

    public static double calPeri(double l, double b) 
    {
        return 2 * (l + b);
    }
    public static double calArea(int a)
     {
        return a * a;
    }
    public static double calPeri(int a)
     {
        return 4 * a;
    }
    public static double calArea(float b, float h)
     {
        return 0.5 * b * h;
    }

    public static double calPeri(double side1, double side2, double side3) 
    {
        return side1 + side2 + side3;
    }
}

public class squareCircleTriProb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the shape type (circle, rectangle, square, triangle):");
        String shape = scanner.nextLine().toLowerCase();

        switch (shape) {
            case "circle":
                System.out.println("enter the radius:");
                double r = scanner.nextDouble();
                double circleArea = Shapes.calArea(r);
                double circlePeri = Shapes.calPeri(r);
                System.out.println("ratio: " + (circleArea / circlePeri));
                break;
            
            case "square":
                System.out.println("enter the side length:");
                int a = scanner.nextInt();
                double squareArea = Shapes.calArea(a);
                double squarePeri = Shapes.calPeri(a);
                System.out.println("ratio: " + (squareArea / squarePeri));
                break;

                
            case "rectangle":
                System.out.println("enter the length and breadth:");
                double l = scanner.nextDouble();
                double b = scanner.nextDouble();
                double rectangleArea = Shapes.calArea(l, b);
                double rectanglePeri = Shapes.calPeri(l, b);
                System.out.println("ratio: " + (rectangleArea / rectanglePeri));
                break;

            case "triangle":
                System.out.println("enter the base, height, and three sides:");
                double base = scanner.nextDouble();
                double height = scanner.nextDouble();
                double s1 = scanner.nextDouble();
                double s2 = scanner.nextDouble();
                double s3 = scanner.nextDouble();
                double triangleArea = Shapes.calArea(base, height);
                double trianglePeri = Shapes.calPeri(s1, s2, s3);
                System.out.println("ratio: " + (triangleArea / trianglePeri));
                break;

            default:
                System.out.println("error 404!! ");
        }
        // if(shape=="circle"){
        //     System.out.println("Enter the radius:");
        //          double r = scanner.nextDouble();
        //          double circleArea = Shapes.calArea(r);
        //          double circlePerimeter = Shapes.calPeri(r);
        //          System.out.println("ratio: " + (circleArea / circlePerimeter));
                 

        // }
        // else if(shape=="square"){
        //     System.out.println("Enter the side length:");
        //              int side = scanner.nextInt();
        //          double squareArea = Shapes.calArea(side);
        //          double squarePerimeter = Shapes.calPeri(side);
        //        System.out.println("ratio: " + (squareArea / squarePerimeter));

        // }
        // else if(shape=="triangle"){
        //     System.out.println("Enter the base, height, and three sides:");
        //         double base = scanner.nextDouble();
        //         double height = scanner.nextDouble();
        //         double s1 = scanner.nextDouble();
        //         double s2 = scanner.nextDouble();
        //         double s3 = scanner.nextDouble();
        //        double triangleArea = Shapes.calArea(base, height);
        //        double trianglePerimeter = Shapes.calPeri(s1, s2, s3);
        //         System.out.println("ratio: " + (triangleArea / trianglePerimeter));
        

        // }
        // else if(shape=="rectangle"){
            
        //        System.out.println("Enter the base, height, and three sides:");
        //          double base = scanner.nextDouble();
        //          double height = scanner.nextDouble();
        //          double s1 = scanner.nextDouble();
        //          double s2 = scanner.nextDouble();
        //          double s3 = scanner.nextDouble();
        //          double triangleArea = Shapes.calArea(base, height);
        //          double trianglePerimeter = Shapes.calPeri(s1, s2, s3);
        //          System.out.println("ratio: " + (triangleArea / trianglePerimeter));

        // }

        scanner.close();
    }
}