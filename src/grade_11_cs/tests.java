package grade_11_cs;

public class tests {
    public static void main(String[] args) {
        int result = 0;
        int num = 0;

        while (true) {
            int temp_sum = fib(num);
            if (temp_sum < 4000000) {
                if (temp_sum % 2 == 0) {
                    result+=temp_sum;
                    System.out.println(result);
                }
            }
            else {break;}
            num++;
        }
        System.out.println(result);
    }
    public static int fib(int i) {
        if (i<2) {
            return i;
        }
        return fib(i-1) + fib(i-2);
    }
}