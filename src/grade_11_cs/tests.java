package grade_11_cs;
import java.util.Scanner;

public class tests {
    static int key;
    static char ch;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String message, encryptedMessage = "";
        System.out.println("Enter a message: ");
        message = sc.next();
        System.out.println("Enter key: ");
        key = sc.nextInt();

        for(int i = 0; i < message.length(); ++i){
            ch = message.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch + key);

                if(ch > 'z'){
                    ch = (char)(ch - 'z' + 'a' - 1);
                }

                encryptedMessage += ch;
            }

            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch + key);

                if(ch > 'Z'){
                    ch = (char)(ch - 'Z' + 'A' - 1);
                }

                encryptedMessage += ch;
            }

            else {
                encryptedMessage += ch;
            }
        }
        System.out.println("Encrypted Message = " + encryptedMessage);
    }
}