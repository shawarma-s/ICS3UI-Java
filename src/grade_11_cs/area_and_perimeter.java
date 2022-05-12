package grade_11_cs;

import java.util.Scanner;

public class area_and_perimeter {

    //static used to make scanner available in all methods
    static Scanner userin = new Scanner(System.in);

    //static used to make variables available in all methods
    static String unit;
    static String choice; //string variables for user defined choices in different procedures
    static String perimeterChoice;
    static String areaChoice;
    static String volumeChoice;
    final static double PI = 3.141592; //constant for PI
    static double widthRectangle; //double variables for user defined choices in dimensions used in calculations
    static double lengthRectangle;
    static double heightRectangle;
    static double widthSquare; //same variable used for square and cube calculations
    static double radius; //same radius variable used for circle and square
    static double triangleSideA;
    static double triangleSideB;
    static double triangleSideC;
    static double baseTriangle;
    static double heightTriangle;
    static double lengthTriangle; //used for triangular prism

    public static void main(String[] args) {
        System.out.println("Please enter the unit (cm, m, km, etc.) that you would like to use:");
        unit = userin.next();
        mainMenu();
    }

    public static void mainMenu() { //procedure for main menu

        System.out.println("Welcome to the calculator. What would you like to calculate?\n"); //options for the main menu
        System.out.println("A) Perimeter\nB) Area\nC) Volume\nD) Exit"); //3 choices for calculations and exit option
        System.out.println("Please enter your selection below:\n");
        choice = userin.next();

        switch (choice) { //options lead to different procedures for each selection
            case "Perimeter", "perimeter", "a", "A" -> perimeter();
            case "Area", "area", "b", "B" -> area();
            case "Volume", "volume", "c", "C" -> volume();
            case "Exit", "exit", "d", "D" -> System.exit(0); //exits if the user chooses to do so
            default -> {
                System.out.println("Invalid input, please try again."); //loops main menu if the input is not accepted
                mainMenu();
            }
        }
    }

    public static void perimeter() { //procedure for perimeter selection menu

        System.out.println("What shape would you like to calculate the perimeter of?"); //choices for perimeter calculations
        System.out.println("A) Rectangle\nB) Square\nC) Circle\nD) Triangle\nE) Exit");
        perimeterChoice = userin.next();

        switch (perimeterChoice) { //4 options for shape perimeters, all are checked using switch
            case "Rectangle", "rectangle", "a", "A" -> {
                System.out.println("Please enter the length of the rectangle:");
                lengthRectangle = userin.nextDouble();
                System.out.println("Please enter the width of the rectangle:");
                widthRectangle = userin.nextDouble();
                System.out.println("The perimeter of this rectangle is " + rectanglePerimeter(lengthRectangle, widthRectangle) + unit);
                mainMenu();
            }
            case "Square", "square", "b", "B" -> {
                System.out.println("Please enter the width of the square:");
                widthSquare = userin.nextDouble();
                System.out.println("The perimeter of this square is " + squarePerimeter(widthSquare) + unit);
                mainMenu();
            }
            case "Circle", "circle", "c", "C" -> {
                System.out.println("Please enter the radius of the circle:");
                radius = userin.nextDouble();
                System.out.println("The circumference of this circle is " + circlePerimeter(radius) + unit);
                mainMenu();
            }
            case "Triangle", "triangle", "d", "D" -> {
                System.out.println("Please enter the length of the first side of the triangle:");
                triangleSideA = userin.nextDouble();
                System.out.println("Please enter the length of the second side of the triangle:");
                triangleSideB = userin.nextDouble();
                System.out.println("Please enter the length of the third side of the triangle:");
                triangleSideC = userin.nextDouble();
                System.out.println("The perimeter of this triangle is " + trianglePerimeter(triangleSideA, triangleSideB, triangleSideC) + unit);
                mainMenu();
            }
            case "Exit", "exit", "e", "E" -> System.exit(0); //exits if user chooses
            default -> {
                System.out.println("Invalid input, please try again."); //loops perimeter menu if input is invalid
                perimeter();
            }
        }
    }

    public static void area() { //procedure for area selection menu

        System.out.println("What shape would you like to calculate the area of?");
        System.out.println("A) Rectangle\nB) Square\nC) Circle\nD) Triangle\nE) Exit"); //area options
        areaChoice = userin.next();

        switch (areaChoice) {  //4 shapes available for area
            case "Rectangle", "rectangle", "a", "A" -> {
                System.out.println("Please enter the length of the rectangle:");
                lengthRectangle = userin.nextDouble();
                System.out.println("Please enter the width of the rectangle:");
                widthRectangle = userin.nextDouble();
                System.out.println("The area of this rectangle is " + rectangleArea(lengthRectangle, widthRectangle) + unit);
                mainMenu();
            }
            case "Square", "square", "b", "B" -> {
                System.out.println("Please enter the width of the square:");
                widthSquare = userin.nextDouble();
                System.out.println("The length of this square is " + squareArea(widthSquare) + unit);
                mainMenu();
            }
            case "Circle", "circle", "c", "C" -> {
                System.out.println("Please enter the radius of the circle:");
                radius = userin.nextDouble();
                System.out.println("The area of this circle is " + circleArea(radius) + unit);
                mainMenu();
            }
            case "Triangle", "triangle", "d", "D" -> {
                System.out.println("Please enter the size of the base of the triangle:");
                baseTriangle = userin.nextDouble();
                System.out.println("Please enter the size of the height of the triangle:");
                heightTriangle = userin.nextDouble();
                System.out.println("The area of this triangle is " + triangleArea(baseTriangle, heightTriangle) + unit);
                mainMenu();
            }
            case "Exit", "exit", "e", "E" -> System.exit(0); //exit if user chooses
            default -> {
                System.out.println("Invalid input, please try again"); //loops area menu if input is invalid
                area();
            }
        }
    }

    public static void volume() { //volume selection menu
        System.out.println("What shape would you like to find the volume of?");
        System.out.println("A) Rectangular Prism\nB) Cube\nC) Sphere\nD) Triangular Prism\nE) Exit"); //options for volume menu
        volumeChoice = userin.next();

        switch (volumeChoice) { //4 shapes for volume
            case "Rectangular Prism", "rectangular prism", "a", "A" -> {
                System.out.println("Please enter the length of the rectangular prism:");
                lengthRectangle = userin.nextDouble();
                System.out.println("Please enter the width of the rectangular prism:");
                widthRectangle = userin.nextDouble();
                System.out.println("Please enter the height of the rectangular prism:");
                heightRectangle = userin.nextDouble();
                System.out.println("The volume of this rectangular prism is " + rectanglePrism(lengthRectangle, widthRectangle, heightRectangle) + unit);
                mainMenu();
            }
            case "Cube", "cube", "b", "B" -> {
                System.out.println("Please enter the width of the cube:");
                widthSquare = userin.nextDouble();
                System.out.println("The volume of this cube is " + cube(widthSquare) + unit);
                mainMenu();
            }
            case "Sphere", "sphere", "c", "C" -> {
                System.out.println("Please enter the radius of the sphere:");
                radius = userin.nextDouble();
                System.out.println("The volume of this sphere is " + sphere(radius) + unit);
                mainMenu();
            }
            case "Triangular Prism", "triangular prism", "d", "D" -> {
                System.out.println("Please enter the size of the base of the triangle face of the triangular prism:");
                baseTriangle = userin.nextDouble();
                System.out.println("Please enter the size of the height of the triangle face of the triangular prism:");
                heightTriangle = userin.nextDouble();
                System.out.println("Please enter the length of the triangular prism:");
                lengthTriangle = userin.nextDouble();
                System.out.println("The volume of this triangular prism is " + trianglePrism(baseTriangle, heightTriangle, lengthTriangle) + unit);
            }
            case "Exit", "exit", "e", "E" -> System.exit(0); //exit if user chooses
            default -> {
                System.out.println("Invalid input, please try again"); //loops volume menu if input is invalid
                volume();
            }
        }
    }

    //below are the functions for the calculations for all possible shape selections
    //function parameters are not named because equations are written in a way that order does not affect outcome (trianglePrism is an exception)
    public static double rectanglePerimeter(double n1, double n2) {
        double rectanglePerimeter = 2*n1+2*n2;
        return rectanglePerimeter;
    }

    public static double squarePerimeter(double n1) {
        double squarePerimeter = n1*4;
        return squarePerimeter;
    }

    public static double circlePerimeter(double n1) { //aka circumference
        double circlePerimeter = 2*PI*n1;
        return circlePerimeter;
    }

    public static double trianglePerimeter(double n1, double n2, double n3) {
        double trianglePerimeter = n1+n2+n3;
        return trianglePerimeter;
    }

    public static double rectangleArea(double n1, double n2) {
        return n1*n2;
    }

    public static double squareArea(double n1) {
        return Math.pow(n1,2);
    }

    public static double circleArea(double n1) {
        return PI*(Math.pow(n1,2));
    }

    public static double triangleArea(double n1, double n2) {
        return (n1*n2)/2;
    }

    public static double rectanglePrism(double n1, double n2, double n3) {
        return n1*n2*n3;
    }

    public static double cube(double n1) {
        return Math.pow(n1,3);
    }

    public static double sphere(double n1) {
        return (4/3)*PI*(Math.pow(n1, 3));
    }

    public static double trianglePrism(double base, double height, double length) {
        return (base*height/2)*length;
    }

}
