package grade_11_cs;
import java.util.Objects;
import java.util.Scanner;

public class multi_choice_quiz {
    public static void main(String[] args) {

        Scanner userin = new Scanner(System.in);

        /*instantiates all variables, including point values for correct and
        incorrect answers
        */
        final int PTCORRECT = 2;
        final int TOTALQUESTIONS = 6;
        final int PTPOSSIBLE = 12;
        String userAns1;
        String userAns2;
        String userAns3;
        String userAns4;
        String userAns5;
        String userAns6;
        int ansCorrect = 0;
        int ansWrong = 0;
        double ansPercent;
        int ptTotal;

        System.out.println("Welcome to your first quiz. \nThere are 6 " + //welcomes user and introduces quiz
                "questions, each with 3 possible answers of a, b, or c.\n" +
                "Each correct answer is 2 points, each incorrect answer is -1 point.\n" +
                "Good luck.");

        System.out.println("Question 1) Solve the following equation: 8 x 3 + 6 / 2" + //First question start
                "\n \t a) 27" +
                "\n \t b) 15" +
                "\n \t c) 36");
        System.out.println("Enter you answer selection here: ");
            userAns1 = userin.next();

        if (Objects.equals(userAns1, "a") || Objects.equals(userAns1, "A")){ //checks if user got first answer correct
            System.out.println("Great job! That is the correct answer!\n");
            ansCorrect++;
        }
        else { //feedback if answer is wrong
            System.out.println("Sorry, that is not the correct answer.\nRemember to multiply and divide numbers before" +
                    "adding or subtracting. In the question \nabove, you must multiply 8 x 3 and divide 6 / 2. After" +
                    " this step, you \ncan add the results of both those operations.\n");
            ansWrong++;
        } //First question end

        System.out.println("Question 2) Simplify the following equation: 8x + 3 - 2y + 4 - 5x" + //Second question start
                "\n \t a) xy + 7" +
                "\n \t b) 8xy" +
                "\n \t c) 3x + 7 - 2y");
        System.out.println("Enter you answer selection here: ");
        userAns2 = userin.next();

        if (Objects.equals(userAns2, "c") || Objects.equals(userAns2, "C")){ //checks if user got second answer correct
            System.out.println("Great job! That is the correct answer!\n");
            ansCorrect++;
        }
        else { //feedback if answer is wrong
            System.out.println("Sorry, that is not the correct answer.\nRemember, you can only combine like terms " +
                    "if the terms have the same coefficient. You cannot \ncombine 3x and 3y to be 6xy, because they " +
                    "have different coefficients. Similarly, you cannot \ncombine it to be 6, because that gets rid of " +
                    "the variables, which is not allowed.\n");
            ansWrong++;
        } //Second question end

        System.out.println("Question 3) Determine the slope of the following line: y = 4x - 12" + //Third question start
                "\n \t a) -8" +
                "\n \t b) 4" +
                "\n \t c) -12");
        System.out.println("Enter you answer selection here: ");
        userAns3 = userin.next();

        if (Objects.equals(userAns3, "b") || Objects.equals(userAns3, "B")){ //checks if user got third answer correct
            System.out.println("Great job! That is the correct answer!\n");
            ansCorrect++;
        }
        else { //feedback if answer is wrong
            System.out.println("Sorry, that is not the correct answer.\nRecall that the equation for the " +
                    "slope of a line is y = mx + b, \nwhere m is the slope of the line. This means the coefficient \nfor" +
                    " x will always be the slope for a line.\n");
            ansWrong++;
        } //Third question end

        System.out.println("Question 4) What is the y-intercept of this line: y = 6x + 8" + //Fourth question start
                "\n \t a) 6" +
                "\n \t b) 14" +
                "\n \t c) 8");
        System.out.println("Enter you answer selection here: ");
        userAns4 = userin.next();

        if (Objects.equals(userAns4, "c") || Objects.equals(userAns4, "C")){ //checks if user got fourth answer correct
            System.out.println("Great job! That is the correct answer!\n");
            ansCorrect++;
        }
        else { //feedback if answer is wrong
            System.out.println("Sorry, that is not the correct answer.\nRecall that in the equation for a line, " +
                    "y = mx + b, b represents the y-intercept of the line.\n");
            ansWrong++;
        } //Fourth question end

        System.out.println("Question 5) Expand the following equation: (a + b)(a - b)" + //Fifth question start
                "\n \t a) a\u00b2 - b\u00b2" +
                "\n \t b) 2a - 2b" +
                "\n \t c) a - b");
        System.out.println("Enter you answer selection here: ");
        userAns5 = userin.next();

        if (Objects.equals(userAns5, "a") || Objects.equals(userAns5, "A")){ //checks if user got fifth answer correct
            System.out.println("Great job! That is the correct answer!\n");
            ansCorrect++;
        }
        else { //feedback if answer is wrong
            System.out.println("Sorry, that is not the correct answer.\nWhen expanding this equation, remember to use" +
                    "the FOIL method. FOIL stands for \nfirst, inner, outer, last. This means you must multiply the " +
                    "variables in \nthat order. You first multiply the first variables (a * a), then the \nouter variables" +
                    " (a * -b), then the inner variables (b * a), and finally the \nlast variables (b * -b).\n");
            ansWrong++;
        } //Fifth question end

        System.out.println("Question 6) Solve for x: 180 = 2x\u00b2 * 10" + //Sixth question start
                "\n \t a) 18" +
                "\n \t b) 3" +
                "\n \t c) 9");
        System.out.println("Enter you answer selection here: ");
        userAns6 = userin.next();

        if (Objects.equals(userAns6, "b") || Objects.equals(userAns6, "B")){ //checks if user got sixth answer correct
            System.out.println("Great job! That is the correct answer!\n");
            ansCorrect++;
        }
        else { //feedback if answer is wrong
            System.out.println("Sorry, that is not the correct answer.\nFor the above equation, you must first divide\n" +
                    "by 10, which gives you 18 = 2x\u00b2. Then you divide both sides by 2. This gives us 9 = x\u00b2\n" +
                    "Finally, you square root both sides. We do this because x is to the power of 2, not being \n" +
                    "multiplied by 2. This means x is being multiplied by itself twice (x * x). Our final \nanswer is 3 = x." +
                    "\n");
            ansWrong++;
        } //Sixth question end

        //tells the user how many questions they got correct and how many they got wrong
        System.out.println("You answered " + ansCorrect + " questions correctly & " + ansWrong + " questions incorrectly");

        //calculates the percent of questions (rounded to 1 decimal place) that the user got correct
        ansPercent = (double) ansCorrect / (double) TOTALQUESTIONS;
        ansPercent = Math.round(ansPercent * 1000);
        ansPercent = ansPercent / 10;
        System.out.println("You got " + ansPercent + "% of the questions correct.");

        /*calculates how many points the user gets out of the total points available based on the # of questions answered
        correct and incorrect. point system uses variables so that the total points, incorrect points and correct points
        can be changed if needed*/
        ptTotal = ansCorrect * PTCORRECT;
        System.out.println("Your final score is " + ptTotal + "/" + PTPOSSIBLE + " points.\nThanks for playing!");

    }
}
