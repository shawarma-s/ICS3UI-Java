package grade_11_cs;

import java.util.Scanner;

public class caeserCipher {

    static Scanner userin = new Scanner(System.in);

    static String message, encryptedMessage, decryptedMessage = "";
    static int shift;
    static char ch;
    static int userChoice;

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        System.out.println("Welcome to the CaesarEncrypt encryption and decryption tool\n");
        System.out.println("Please select an option from the menu below: ");
        System.out.println("1) Encrypt a message\n2) Decrypt a message\n3) Exit");
        userChoice = userin.nextInt();
        switch (userChoice) {
            case 1 -> encryption();
            case 2 -> decryption();
            case 3 -> System.out.println("Goodbye.");
            default -> {
                System.out.println("Sorry wrong command. Please try again.");
                mainMenu();
            }
        }
    }

    public static void encryption() {

        System.out.println("Please enter the message you would like to encrypt (your message must be less than 31 letters): ");
        message = userin.nextLine();
        System.out.println("Please enter the number of characters you would like to shift: ");
        shift = userin.nextInt();

        for(int i = 0; i < message.length(); ++i){
            ch = message.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch + shift);
                if(ch > 'z'){
                    ch = (char)(ch - 'z' + 'a' - 1);
                }
                encryptedMessage += ch;
            }
            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch + shift);
                if(ch > 'Z'){
                    ch = (char)(ch - 'Z' + 'A' - 1);
                }
                encryptedMessage += ch;
            }
            else {
                encryptedMessage += ch;
            }
        }
        System.out.println("Your encrypted message is " + encryptedMessage);
        mainMenu();
    }

    public static void  decryption() {

    }

}
