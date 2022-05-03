package grade_11_cs;
import java.util.Scanner;

public class Activity3_food_truck {
    public static void main(String[] args) throws InterruptedException {


        Scanner userin = new Scanner(System.in);

        //Initializes all variables (constants for prices and tax, integers and doubles for rest)
        final double HAMBURGER = 6.99;
        final double VEGBURGER = 8.99;
        final double CHICKBURGER = 7.49;
        final double FRIES = 3.99;
        final double WATER = 2.49;
        int hamburgercount;
        int veggiecount;
        int chickencount;
        int frycount;
        int watercount;
        double total;
        double taxtotal;
        double endtotal;
        final double TAX = 0.13;

        System.out.println("Welcome to Toronto's very first virtual food truck!"); //Greets the user
        System.out.println("");
        System.out.println("My name is Beep-Bop and I will be taking your order today!");
        System.out.println("");
        System.out.println("We sell hamburgers for $6.99 each, veggie burgers for $8.99 each, and chicken burgers " +
                "for $7.49 each!"); //Presents the different products available and their prices
        System.out.println("We also sell french fries for $3.99 each and bottled water for $2.49 each!");
        System.out.println("");
        System.out.println("How many hamburgers would you like today?"); //Begins asking use how many of each product they want
            hamburgercount = userin.nextInt();
        System.out.println("How many veggie burgers would you like today?");
            veggiecount = userin.nextInt();
        System.out.println("How many chicken burgers would you like today?");
            chickencount = userin.nextInt();
        System.out.println("How many orders of french fries would you like today?");
            frycount = userin.nextInt();
        System.out.println("How many bottles of water do you want?");
            watercount = userin.nextInt();
        System.out.println("");

        System.out.println("Processing your order..."); //Tells the user their order is being processed

        //Total before tax calculations
        total = ((HAMBURGER * hamburgercount) + (VEGBURGER * veggiecount) + (CHICKBURGER * chickencount)
                + (FRIES * frycount) + (WATER * watercount))*100;
        total = Math.round(total);
        total = total/100;

        //Total taxes paid
        taxtotal = total * TAX;
        taxtotal = Math.round(taxtotal*100);
        taxtotal = taxtotal / 100;

        //Total after tax calculations
        endtotal = total + taxtotal;
        endtotal = Math.round(endtotal * 100);
        endtotal = endtotal / 100;

        //Thanks the user for buying #(s) of each product
        System.out.println("Thank you for buying " + hamburgercount + " hamburger(s), " + veggiecount + " veggie burger(s), "
                + chickencount + " chicken burger(s), " + frycount + " order(s) of fries, and " + frycount + " bottle(s) of water.");
        //Tells the user their total before tax
        System.out.println("Your total before taxes is: $" + total);
        //Tells the user their total taxes paid
        System.out.println("You will be charged $" + taxtotal + " in taxes");
        //Tells the user their total after tax
        System.out.println("Your total after taxes is $" + endtotal);

        //Thanks user/'customer'
        System.out.println("Thank you for shopping at Toronto's very first virtual food truck, come back soon!");

    }
}
