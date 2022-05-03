package grade_11_cs;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class first_selection_program {
    public static void main(String[] args) throws InterruptedException {

        Scanner userinput = new Scanner(System.in);

        double spent; //instantiates a variable for how much the user spent
        double total; //instantiates a variable to be used for the final cost
        double save; //instantiates a variable to be used for the amount of savings

        System.out.println("Please enter the amount of money you spent: "); //asks the user how much money they spent
        spent = userinput.nextDouble();

        if (spent>120) { //checks the value of variable spent
            System.out.println("You spent $" + spent + ".");
            TimeUnit.SECONDS.sleep(1); //Delays added for readability

            System.out.println("Congratulations, you are eligible for a 40% discount!");
            TimeUnit.SECONDS.sleep(1);

            save = spent * 0.4; //calculates savings amount
            save = Math.round(save);
            System.out.println("You saved $" + save + "!"); //prints savings amount
            TimeUnit.SECONDS.sleep(1);

            total = spent - (spent * 0.4); //calculates total amount
            total = Math.round(total);
            System.out.println("Your total is $" + total + "."); //print total cost
        }
        else if (spent>=80.01) { //checks the value of variable spent
            System.out.println("You spent $" + spent + ".");
            TimeUnit.SECONDS.sleep(1); //Delays added for readability

            System.out.println("Congratulations, you are eligible for a 30% discount!");
            TimeUnit.SECONDS.sleep(1);

            save = spent * 0.3; //calculates savings amount
            save = Math.round(save);
            System.out.println("You saved $" + save + "!"); //prints savings amount
            TimeUnit.SECONDS.sleep(1);

            total = spent - (spent * 0.3); //calculates total amount
            total = Math.round(total);
            System.out.println("Your total is $" + total + "."); //print total cost
        }
        else if (spent>=40.01){ //checks the value of variable spent
            System.out.println("You spent $" + spent + ".");
            TimeUnit.SECONDS.sleep(1); //Delays added for readability

            System.out.println("Congratulations, you are eligible for a 20% discount!");
            TimeUnit.SECONDS.sleep(1);

            save = spent * 0.2; //calculates savings amount
            save = Math.round(save);
            System.out.println("You saved $" + save + "!"); //prints savings amount
            TimeUnit.SECONDS.sleep(1);

            total = spent - (spent * 0.2); //calculates total amount
            total = Math.round(total);
            System.out.println("Your total is $" + total + "."); //print total cost
        }
        else if (spent>=0.01){ //checks the value of variable spent
            System.out.println("You spent $" + spent + ".");
            TimeUnit.SECONDS.sleep(1); //Delays added for readability

            System.out.println("Congratulations, you are eligible for a 10% discount!");
            TimeUnit.SECONDS.sleep(1);

            save = spent * 0.1; //calculates savings amount
            save = Math.round(save);
            System.out.println("You saved $" + save + "!"); //prints savings amount
            TimeUnit.SECONDS.sleep(1);

            total = spent - (spent * 0.1); //calculates total amount
            total = Math.round(total);
            System.out.println("Your total is $" + total + "."); //print total cost
        }

    }
}
