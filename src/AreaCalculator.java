// Jared Olson
// 10/26/2026
// 10/26/2026
// Computer Science 1

import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        
        // asking person to chose a shape
        Scanner whichshape = new Scanner(System.in);
        System.out.print("Choose a shape (circle, rectangle, or triangle): ");
        String chooseShape = whichshape.nextLine();
        
        // what the progam does based on the shape
        calculateArea(chooseShape);
        runAgain(); // asks if they want to run the program again
        
    }
    public static void runAgain() {
        System.out.println("Do you want to calculate the area of another shape? (yes/no)");
        Scanner anotherShape = new Scanner(System.in);
        String response = anotherShape.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            main(new String[0]); // calls the main method again to restart the program
        } else {
            System.out.println("Thank you for using the Area Calculator!");
        }
    }
    public static void calculateArea(String chooseShape) { 
            switch (chooseShape) {
                case "circle":
                    // asking for the radius of the circle and calculating the area
                    Scanner circleScanner = new Scanner(System.in);
                    System.out.print("Enter the radius of the circle: ");
                    double radius = circleScanner.nextDouble();
                    double area = circleArea(radius);
                    System.out.println("The area of the circle with radius " + radius + " is: " + area);
                    break;
                case "rectangle":
                    // asking for the length and width of the rectangle and calculating the area
                    Scanner rectangleScanner = new Scanner(System.in);
                    System.out.print("Enter the length of the rectangle: ");
                    double length = rectangleScanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = rectangleScanner.nextDouble();
                    double rectangleArea = rectangleArea(length, width);
                    System.out.println("The area of the rectangle with length " + length + " and width " + width + " is: " + rectangleArea);
                    break;
                case "triangle":
                    // asking for the base and height of the triangle and calculating the area
                    Scanner triangleScanner = new Scanner(System.in);
                    System.out.println("Enter the base of the triangle: ");
                    double base = triangleScanner.nextDouble();
                    System.out.println("Enter the height of the triangle: ");
                    double height = triangleScanner.nextDouble();
                    double triangleArea = triangleArea(base, height);
                    System.out.println("The area of the triangle with base " + base + " and height " + height + " is: " + triangleArea);
                    break;
            
                default:
                    System.out.println("Invalid shape. Please choose circle, rectangle, or triangle.");
                    main(new String[0]); // calls the main method again to restart the program 
                    break;
            }
        }
    


    static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
    static double rectangleArea(double length, double width) {
        return length * width;
    }
    static double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }
}