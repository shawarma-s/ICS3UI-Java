package grade_11_cs;
import java.util.Scanner;

public class magic8ball {
    public static void main(String[] args) {

        Scanner userin = new Scanner(System.in);

        //instantiates variables for random number and user input
        int ball = (int)Math.round(Math.random()*5+1); //assigns random value from 1-6 to variable ball
        String question;

        System.out.println("Welcome to the 8-ball, please enter your question: "); //user inputs their question
        question = userin.next();

        switch (ball) { //checks which number was randomly generated and prints a response accordingly
            case 1:
                System.out.println("It is certain");
                break;
            case 2:
                System.out.println("As I see it, yes");
                break;
            case 3:
                System.out.println("Cannot predict now");
                break;
            case 4:
                System.out.println("Ask again later");
                break;
            case 5:
                System.out.println("Very doubtful");
                break;
            case 6:
                System.out.println("My sources say no");
                break;
        }

    }
}
