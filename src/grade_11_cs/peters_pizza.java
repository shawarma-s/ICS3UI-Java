package grade_11_cs;
import java.util.Scanner;

public class peters_pizza {
    public static void main(String[] args) {

        Scanner userinput = new Scanner(System.in);

        final double labour = 0.75; //instantiates a constant for the cost of labour
        final double rent = 0.99; //instantiates a constant for the cost of rent
        final double costsize = 0.5; //instantiates a constant for the cost per centimeter
        double beforetax;
        double totaltax;
        double aftertax;
        double pizza;

        System.out.println("Welcome to Peter's Pizza!");
        System.out.println("Please enter the diameter of your pizza in centimeters\n(note that your pizza's diameter must be at least 1 centimeter): "); //asks the user how big they want their pizza
        pizza= userinput.nextDouble();

        if (pizza>40) { //checks the value of variable pizza
            System.out.println("Whoa, big pizza! You might need a truck to get this home!");
        }
        else if (pizza>20) { //checks the value of variable pizza
            System.out.println("This will be delicious!");
            }
        else if (pizza>=1){ //checks the value of variable pizza
            System.out.println("We are going to make you a cute little pizza!");
            }
        else if (pizza<1){ //checks the value of variable pizza
            System.out.println("We cannot accept that diameter, your pizza\nmust be at least 1 centimeter in diameter");
        }

        beforetax = (pizza * costsize) + labour + rent; //calculates total before taxes
        System.out.println("Your total before taxes is $" + beforetax + ".");

        totaltax = beforetax * 0.13; //calculates total taxes
        totaltax = Math.round(totaltax*100);
        totaltax = totaltax / 100;
        System.out.println("You will be charged $" + totaltax + " in taxes.");

        aftertax = totaltax + beforetax; //calculates total after tax
        aftertax = Math.round(aftertax*100);
        aftertax = aftertax / 100;
        System.out.println("Your total after taxes is $" + aftertax + ".");

    }
}
