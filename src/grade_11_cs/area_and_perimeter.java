package grade_11_cs;

import java.util.Scanner;

public class area_and_perimeter {

    static  String choice;
    static  String perimeterChoice;
    static  String areaChoice;
    static  String volumeChoice;
    static  double widthRectangle;
    static  double lengthRectangle;

    public static void main(String[] args) {

        Scanner userin = new Scanner(System.in);

        System.out.println("Welcome to the calculator. What would you like to calculate?\n");
        System.out.println("A) Perimeter\nB) Area\nC) Volume\nD) Exit");
        System.out.println("Please enter your selection below:\n");
        choice = userin.next();

        if (choice.equals("Perimeter") || choice.equals("perimeter") || choice.equals("a") || choice.equals("A")) {

            System.out.println("What shape would you like to calculate the perimeter of?");
            System.out.println("A) Rectangle\nB) Square\nC) Circle\nD) Triangle");
            perimeterChoice = userin.next();

            if (perimeterChoice.equals("Rectangle") || perimeterChoice.equals("rectangle") || perimeterChoice.equals("a") || perimeterChoice.equals("A")) {
                rectanglePerimeter();
            }
            else if (perimeterChoice.equals("Square") || perimeterChoice.equals("square") || perimeterChoice.equals("b") || perimeterChoice.equals("B")){
                squarePerimter();
            }
        }
        else if (choice.equals("Perimeter") || choice.equals("perimeter") || choice.equals("b") || choice.equals("B")) {

            System.out.println("What shape would you like to calculate the perimeter of?");
            System.out.println("A) Rectangle\nB) Square\nC) Circle\nD) Triangle");
            perimeterChoice = userin.next();

            if (perimeterChoice.equals("Rectangle") || perimeterChoice.equals("rectangle") || perimeterChoice.equals("a") || perimeterChoice.equals("A")) {

            }
        }
        else {
            System.out.println("Invalid input, exiting program.");
            System.exit(0);
        }
    }

    public static double rectanglePerimeter() {

        return 0;
    }

    public static double squarePerimter() {

        return 0;
    }

    public static double circlePerimeter() {

        return 0;
    }

    public static double trianglePerimeter() {

        return 0;
    }

    public static double rectangleArea() {

        return 0;
    }

    public static double squareArea() {

        return 0;
    }

    public static double circleArea() {

        return 0;
    }

    public static double triangleArea() {

        return 0;
    }

    public static double rectanglePrism() {

        return 0;
    }

    public static double cube() {

        return 0;
    }

    public static double sphere() {

        return 0;
    }

    public static double trianglePrism() {

        return 0;
    }

}
