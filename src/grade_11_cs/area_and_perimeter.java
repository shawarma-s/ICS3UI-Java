package grade_11_cs;

import java.nio.channels.ShutdownChannelGroupException;
import java.util.Scanner;

import static java.lang.System.exit;

public class area_and_perimeter {

    static  String choice;
    static  String perimeterChoice;
    static  String areaChoice;
    static  String volumeChoice;
    static  double widthRectangle;
    static  double lengthRectangle;

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {

        Scanner userin = new Scanner(System.in);

        System.out.println("Welcome to the calculator. What would you like to calculate?\n");
        System.out.println("A) Perimeter\nB) Area\nC) Volume\nD) Exit");
        System.out.println("Please enter your selection below:\n");
        choice = userin.next();

        if (choice.equals("Perimeter") || choice.equals("perimeter") || choice.equals("a") || choice.equals("A")) {

            System.out.println("What shape would you like to calculate the perimeter of?");
            System.out.println("A) Rectangle\nB) Square\nC) Circle");
            perimeterChoice = userin.next();

            if (perimeterChoice.equals("Rectangle") || perimeterChoice.equals("rectangle") || perimeterChoice.equals("a") || perimeterChoice.equals("A")) {

            }
        }

        else if (choice.equals("Perimeter") || choice.equals("perimeter") || choice.equals("a") || choice.equals("A")) {

            System.out.println("What shape would you like to calculate the perimeter of?");
            System.out.println("A) Rectangle\nB) Square\nC) Circle");
            perimeterChoice = userin.next();

            if (perimeterChoice.equals("Rectangle") || perimeterChoice.equals("rectangle") || perimeterChoice.equals("a") || perimeterChoice.equals("A")) {

            }
        }
        else {
            System.out.println("Invalid input, exiting program.");
            System.exit(0);
        }
    }
}
