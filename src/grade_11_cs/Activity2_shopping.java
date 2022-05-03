package grade_11_cs;
import java.util.Scanner;
public class Activity2_shopping {
    public static void main(String[] args) {
        Scanner keyinput = new Scanner(System.in);

        final double costusb = 19.99;
        final double costkey = 49.99;
        final double costmouse = 25.99;
        final double tax = 1.13;
        int countusb;
        int countkey;
        int countmouse;
        double totalbefore;
        double total;

        System.out.println("Welcome to the computer store");
        System.out.println("We sell USB sticks for $19.99 each, keyboards for $49.99 each and mice for $25.99 each.");
        System.out.println("");
        System.out.println("How many USB sticks do you want?");
        countusb = keyinput.nextInt();
        System.out.println("How many keyboards do you want");
        countkey = keyinput.nextInt();
        System.out.println("How many mice do you want?");
        countmouse = keyinput.nextInt();

        total = ((countusb * costusb) + (countkey * costkey) + (countmouse * costmouse)) * tax;
        totalbefore = (countusb * costusb) + (countkey * costkey) + (countmouse * costmouse);
        System.out.println("Your total before taxes is $" + totalbefore + ".");
        System.out.println("Your total after taxes is $" + total + ".");
        System.out.println("Thank you for shopping at the computer store, have a nice day!");
    }
}
