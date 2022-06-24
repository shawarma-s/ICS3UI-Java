package grade_11_cs;
import java.util.Scanner;

public class caesarCipher {

    static Scanner userin = new Scanner(System.in); //scanner made available globally using static

    static int userChoice; //variables static to make them available globally
    static String message;
    static int shift;
    static char ch;

    public static void main(String[] args) {
        System.out.println("Welcome to the CaesarEncrypt encryption and decryption tool."); //prints message and goes to main menu function
        mainMenu();
    }

    public static void mainMenu() {
        System.out.println("Please select an option number from the menu below: "); //3 options for encryption, decryption and exiting
        System.out.println("1) Encrypt a message\n2) Decrypt a message\n3) Exit");
        userChoice = userin.nextInt();
        switch (userChoice) { //switch statement used to simplify code by using number input as the user choice
            case 1 -> {
                System.out.println("Your encrypted message is " + encryption() + "."); //prints the returned result from encryption() and calls maineMenu()
                mainMenu();
            }
            case 2 -> {
                System.out.println("Your decrypted message is " + decryption() + "."); //prints the returned result from decryption() and calls mainMenu()
                mainMenu();
            }
            case 3 -> System.out.println("Goodbye."); //terminates for option 3
            default -> {
                System.out.println("Sorry wrong command. Please try again."); //loops back to start of mainMenu() if the choice is not valid
                mainMenu();
            }
        }
    }

    public static String encryption() {
        String encryptedMessage = ""; //empty initialized variable for encrypted message that will be returned

        System.out.println("Please enter a message (letters only, no spaces): "); //clear instructions for input specifications and uses global variable message for the message input
        message = userin.next();

        if (message.length() > 30) {
            System.out.println("Please try again, your message must be less than 31 characters long."); //checks if message is too long
            encryption();
        }

        System.out.println("Please enter a phase shift (the number of times the letters will be shifted): "); //# of characters to be shifted
        shift = userin.nextInt();

        for(int i = 0; i < message.length(); ++i){ //for loop that handles the shifting by casting each character of the message to an int (ascii) and adding the shift value to result in new letter. then casts that back into a char and 'adds' it to an empty string variable
            ch = message.charAt(i);
                //separate loops for uppercase and lowercase
            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch + shift);

                if(ch > 'z'){
                    ch = (char)(ch - 'z' + 'a' - 1); //goes to start of alphabet if ch is 'after' z
                }

                encryptedMessage += ch; //'adds' the new character to the encryptedMessage variable
            }

            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch + shift);

                if(ch > 'Z'){
                    ch = (char)(ch - 'Z' + 'A' - 1); //goes to start of alphabet if ch is 'after' Z
                }

                encryptedMessage += ch; //'adds' the new character to the encryptedMessage variable
            }

            else {
                encryptedMessage += ch; //'adds' the character to the encryptedMessage variable
            }
        }

        return encryptedMessage; //returns the encrypted message
    }

    public static String decryption() {
        String decryptedMessage = ""; //empty initialized variable for decrypted message that will be returned

        System.out.println("Please enter a message (letters only, no spaces): "); //clear instructions for input specifications and uses global variable message for the message input
        message = userin.next();

        if (message.length() > 30) {
            System.out.println("Please try again, your message must be less than 31 characters long."); //checks if message is too long
            decryption();
        }

        System.out.println("Please enter a phase shift (the number of times the letters will be shifted): "); //# of characters to be shifted
        shift = userin.nextInt();

        for(int i = 0; i < message.length(); ++i){ //for loop that handles the shifting by casting each character of the message to an int (ascii) and adding the shift value to result in new letter. then casts that back into a char and 'adds' it to an empty string variable
            ch = message.charAt(i);
                //separate loops for uppercase and lowercase
            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch - shift);

                if(ch < 'a'){
                    ch = (char)(ch + 'z' - 'a' + 1); //goes to start of alphabet if ch is 'after' z
                }

                decryptedMessage += ch; //'adds' the new character to the decryptedMessage variable
            }

            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch - shift);

                if(ch < 'A'){
                    ch = (char)(ch + 'Z' - 'A' + 1); //goes to start of alphabet if ch is 'after' Z
                }

                decryptedMessage += ch; //'adds' the new character to the decryptedMessage variable
            }

            else {
                decryptedMessage += ch; //'adds' the character to the decryptedMessage variable
            }
        }

        return decryptedMessage; //returns the encrypted message
    }
}
