package grade_11_cs;
import java.util.Scanner;
public class cubes_squares_powers {
    public static void main(String[] args) {

        Scanner userin = new Scanner(System.in);

        //instantiates variables for the users choice, the number they choose and the power they choose for option 3
        int choice;
        int number;
        int power;

        do { //prompts the user to select from the menu until the user chooses 4
            System.out.println("1… Find the value of a number squared (NOTE: 2\u00b2 = 2 x 2)\n" +
                    "2… Find the value of a number cubed (NOTE: 2\u00b3 = 2 x 2 x 2)\n" +
                    "3… Find the value of a number, to any power\n" +
                    "4… Exit");
            System.out.println("Please enter your selection:");
            choice = userin.nextInt();

            if (choice == 1) { //checks if the user chooses option 1
                System.out.println("Please enter the number you would like to square:");
                number = userin.nextInt(); //user inputs a choice for the number they want squared
                System.out.println("The answer is " + number * number + ".");
            }
            else if (choice == 2) { //checks if the user chooses optino 2
                System.out.println("Please enter the number you would like to cube: ");
                number = userin.nextInt(); //user inputs a choice for the number they want cubed
                System.out.println("The answer is " + number * number * number + ".");
            }
            else if (choice == 3) { //checks if the user chooses option 3
                System.out.println("Please enter the number you want to be the base (the base is the number getting multiplied): ");
                number = userin.nextInt(); //user inputs the number they want as the base
                System.out.println("Please enter the number you want to be the exponent: ");
                power = userin.nextInt(); //user inputs the number they want as the exponent
                int result = number; //instantiates a new variable for the answer so that the variable number remains
                                     // unchanged so that it can be used for the multiplication
                for (int i = 1; i < power; i++) { //for loop repeats until i is 1 less than the exponent (1 less since
                                                  //the number is used once during the first run through, which is
                                                  //not tracked. if it repeated until i<=power, result would get multiplied 1 extra time)
                    result = result * number; //multiplies result, which is =number during the first loop and changes each loop after
                }
                System.out.println("The answer to " + number + "^" + power + " is " + result + "."); //prints the equation and the result
            }
        }
        while (choice != 4); //exits if the user chooses option 4
    }
}
