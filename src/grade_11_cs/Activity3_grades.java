package grade_11_cs;
import java.util.Scanner;
public class Activity3_grades {
    public static void main(String[] args) {
        Scanner keyinput = new Scanner(System.in);

        double grade1;
        double grade2;
        double grade3;
        double grade4;
        double average;

        System.out.println("Welcome to the WRDSB grade average calculator!");
        System.out.println("");
        System.out.println("Please enter your first grade: ");
        grade1 = keyinput.nextDouble();
        System.out.println("Please enter your second grade: ");
        grade2 = keyinput.nextDouble();
        System.out.println("Please enter your third grade: ");
        grade3 = keyinput.nextDouble();
        System.out.println("Please enter your fourth grade: ");
        grade4 = keyinput.nextDouble();

        average = (grade1 + grade2 + grade3 + grade4)/4;
        average = average * 100;
        average = Math.round(average);
        average = average / 100;
        System.out.println("Thank your for using the WRDSB average grade calculator.");
        System.out.println("Your average grade is: " + average + "%.");

    }
}
