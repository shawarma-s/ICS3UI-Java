package grade_11_cs;

import java.util.Scanner;

public class loop_practice {
    public static void main(String[] args) {
        Scanner userin = new Scanner(System.in);

        int choice;

        System.out.println("Please enter your choice:\n" +
                "\n" +
                "1... Count from 0 to 10 by 1\n" +
                "2... Count from 100 to 0 by 10\n" +
                "3... Count from 50 to 500 by 50\n" +
                "4... Count from 6000 to 1000 by 1000\n" +
                "5... Exit program");
        choice = userin.nextInt();

        if (choice == 1) {
            for (int i = 0;i<=10;i++) {
                System.out.println(i);
            }
        }

        else if (choice == 2) {
            for (int i=100;i>=0;i-=10) {
                System.out.println(i);
            }
        }

        else if (choice == 3) {
            for (int i=150;i<=500;i+=50) {
                System.out.println(i);
            }
        }

        else if (choice == 4) {
            for (int i=6000;i>=1000;i-=1000) {
                System.out.println(i);
            }
        }

        else {
            System.out.println("Exiting program, goodbye.");
        }

    }
}
