package grade_11_cs;
import java.util.Scanner;
public class tests {
    public static String determineAns (int n1, int n2)
    {
        if ((n1 + n2) == 15)
        {return "MAYBE";}
        else if ((n1 + n2) > 15)
        {return "YES";}
        else
        {return "NO";}
    }
    public static void main(String[] args) {

        int val1 = 6;
        int val2 = 8;

        System.out.println(determineAns (val2, val2));
    }
}