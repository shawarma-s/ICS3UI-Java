package grade_11_cs;

import java.util.Scanner;

public class math_methods {
    public static void main(String[] args) {

        Scanner userin = new Scanner(System.in);

        double num1;
        double num2;
        double decimal;

        System.out.println("Please enter the first number: ");
        num1 = userin.nextDouble();
        System.out.println("Please enter the second number: ");
        num2 = userin.nextDouble();

        System.out.println("The larger number is " + Math.max(num1, num2));
        System.out.println("The smaller number is " + Math.min(num1, num2));
        System.out.println(num1+" to the power "+num2+" equals "+Math.pow(num1,num2));
        System.out.println("Given both numbers as side lengths of a triangle, the hypotenuse of this triangle is "+Math.hypot(num1,num2));

        System.out.println("Please enter a decimal number: ");
        decimal = userin.nextDouble();
        System.out.println("This number rounded up is "+Math.ceil(decimal));
        System.out.println("This number rounded down is "+Math.floor(decimal));

    }
}
