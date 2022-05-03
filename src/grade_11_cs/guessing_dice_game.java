package grade_11_cs;
import java.util.Scanner;
public class guessing_dice_game {
    public static void main(String[] args) {

        Scanner userin = new Scanner(System.in);

        //instantiates the 2 variables for the computer selected number and user selected number
        int usernum;
        int dice;

        //prompts the user to enter a number of their choice
        System.out.println("Please enter a number between 1 and 6: ");
        usernum = userin.nextInt();

        //computer selects a number
        dice = (int)Math.round(Math.random()*5+1);

        //checks if the user chose the same number as the computer
        if (dice == usernum) {
            System.out.println("You guessed the number " + usernum + ", which is the correct number!");
        }
        else if (dice != usernum) {
            System.out.println("Sorry, you did not guess the correct number.");
            System.out.println("You guessed " + usernum + ". \nThe correct number is " + dice + ".");
        }

    }
}
