package grade_11_cs;

import java.util.Scanner;

public class area_and_perimeter {

    //static used to make scanner available in all methods
    static Scanner userin = new Scanner(System.in);

    //static used to make variables available in all methods
    static  String choice; //string variables for user defined choices in different procedures
    static  String perimeterChoice;
    static  String areaChoice;
    static  String volumeChoice;
    static double widthRectangle; //double variables for user defined choices in dimensions used in calculations
    static double lengthRectangle;
    static double heightRectangle;
    static double widthSquare; //same variable used for square and cube calculations
    static double radius; //same radius variable used for circle and square
    static double triangleSideA;
    static double triagnleSideB;
    static double triangleSideC;
    static double baseTriangle;
    static double heightTriangle;
    static double lengthTriangle; //used for triangular prism

    public static void main(String[] args) {
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

        switch (perimeterChoice) {
            case "Rectangle", "rectangle", "a", "A" -> {
                System.out.println("Please enter the length of the rectangle:");
                lengthRectangle = userin.nextDouble();
                System.out.println("Please enter the width of the rectangle:");
                widthRectangle = userin.nextDouble();
                System.out.println("The area of this rectangle is " + rectanglePerimeter(lengthRectangle, widthRectangle)); //4 options for shape perimeters
            }
            case "Square", "square", "b", "B" -> squarePerimter();
            case "Circle", "circle", "c", "C" -> circlePerimeter();
            case "Triangle", "triangle", "d", "D" -> trianglePerimeter();
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

        switch (areaChoice) {
            case "Rectangle", "rectangle", "a", "A" -> rectangleArea(); //4 shapes available for area
            case "Square", "square", "b", "B" -> squareArea();
            case "Circle", "circle", "c", "C" -> circleArea();
            case "Triangle", "triangle", "d", "D" -> triangleArea();
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

        switch (volumeChoice) {
            case "Rectangular Prism", "rectangular prism", "a", "A" -> rectanglePrism(); //4 shapes for volume
            case "Cube", "cube", "b", "B" -> cube();
            case "Sphere", "sphere", "c", "C" -> sphere();
            case "Triangular Prism", "triangular prism", "d", "D" -> trianglePrism();
            case "Exit", "exit", "e", "E" -> System.exit(0); //exit if user chooses
            default -> {
                System.out.println("Invalid input, please try again"); //loops volume menu if input is invalid
                volume();
            }
        }
    }

    public static double rectanglePerimeter(double n1, double n2) {
        double rectanglePerimeter = 2*n1+1*n2;
        return rectanglePerimeter;
    }

    public static double squarePerimter(double n1, double n2) {
        double squarePerimeter;
        return squarePerimeter;
    }

    public static double circlePerimeter(double n1, double n2) { //aka circumference
        double circlePerimeter;
        return circlePerimeter;
    }

    public static double trianglePerimeter(double n1, double n2) {
        double trianglePerimeter;
        return trianglePerimeter;
    }

    public static double rectangleArea(double n1, double n2) {
        double rectangleArea;
        return rectangleArea;
    }

    public static double squareArea(double n1, double n2) {
        double squareArea;
        return squareArea;
    }

    public static double circleArea(double n1, double n2) {
        double circleArea;
        return circleArea;
    }

    public static double triangleArea(double n1, double n2) {
        double triangleArea;
        return triangleArea;
    }

    public static double rectanglePrism(double n1, double n2) {
        double rectanglePrism;
        return rectanglePrism;
    }

    public static double cube(double n1, double n2) {
        double cube;
        return cube;
    }

    public static double sphere(double n1, double n2) {
        double sphere;
        return sphere;
    }

    public static double trianglePrism(double n1, double n2) {
        double trianglePrism;
        return trianglePrism;
    }

}
