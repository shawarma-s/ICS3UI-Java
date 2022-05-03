package grade_11_cs;

import java.util.Scanner;

public class TicTacToe_summative {

    static char[] r1 = {' ',' ',' '};
    static char[] r2 = {' ',' ',' '};
    static char[] r3 = {' ',' ',' '};
    private static char x;

    public static void main(String[] args){
        MainMenu();
    }

    public static void MainMenu(){
        System.out.println("**********************"); //welcomes the user
        System.out.println("Welcome to 2 player Tic-Tac-Toe!");
        System.out.println("~-~-~-~-~-~-~-~-~-~-~-");

        Scanner userin = new Scanner(System.in);
        System.out.println("Main Menu:"); //main menu selection with 3 options
        System.out.println("----------");
        System.out.println("1. Start Game");
        System.out.println("2. Help");
        System.out.println("3. Exit Game");
        System.out.println();
        System.out.print("Please enter a selection: ");
        int menuChoice = userin.nextInt();
        switch(menuChoice){ //checks what option the user selected
            case 1:
                StartTicTacToeGame(); //option 1 starts the game
                break;
            case 2:
                HelpScreen();
                break;
            case 3:
                System.out.println("Goodbye."); //exits program if the user chooses option 3
                break;
            default:
                System.out.println("Sorry wrong command.");
        }

    }

    public static void HelpScreen(){ //if the user chooses 2, this help screen will show them the instructions for how to play

        Scanner userin = new Scanner(System.in);
        System.out.println("To select a position for your symbol, enter 2 numbers. The first number is for the row and the second is for the column.");
        System.out.println("For example:");
        System.out.println("    1    2    3");
        System.out.println("1 [ X ][   ][   ]");
        System.out.println("2 [ X ][ O ][ X ]");
        System.out.println("3 [ O ][ O ][ X ]");
        System.out.println();
        System.out.println("Position: 1 3");
        System.out.println("The above selection will place your symbol in the top right corner");
        System.out.print("Return to main menu? Y/N: ");
        String choice = userin.next();
        if (choice.equals("y") || choice.equals("Y")){
            MainMenu();
        } else if (choice.equals("n") || choice.equals("N")) {
            System.out.print("Thanks for playing! See you soon! \n");
        };
        while(!choice.equals("y") && !choice.equals("Y") && !choice.equals("n") && !choice.equals("N")){
            System.out.print("Wrong command, return to main menu? Y/N: ");
            choice = userin.next();
        };

    }


    public static void StartTicTacToeGame(){

        // Game goes here
        Scanner userin = new Scanner(System.in); //game start for when user chooses option 1

        char p1 = ' '; // Player 1
        char p2 = ' '; // Player 2

        if (p1 == ' ' || p2 == ' '){ //players choose either X or 0 to play as
            System.out.println("Choose X or O (You may choose a custom character if you like)");
            System.out.println("-------------");
            System.out.print("Player 1: ");
            p1 = userin.next().charAt(0);
            System.out.println();
            System.out.print("Player 2: ");
            p2 = userin.next().charAt(0);
            while (p1 == p2){ //checks if both players chose the same character (X or 0) (user is also allowed to choose a custom character)
                System.out.println("Player 1 is already "+p1+". Please enter a different value.");
                System.out.print("Player 2: ");
                p2 = userin.next().charAt(0);
            } //else {
            //System.out.println("Player 1 is " + p1 + ". Player 2 is " + p2 + ".");
            //};
        };

        char player = p2;
        String player_name = "Player 1";
        boolean CONTINUE = true;
        while(CONTINUE){

            if (
                    r1[0] == r1[1] && r1[1] == r1[2] && r1[0] != ' ' ||
                            r2[0] == r2[1] && r2[1] == r2[2] && r2[0] != ' ' ||
                            r3[0] == r3[1] && r3[1] == r3[2] && r3[0] != ' ' ||
                            r1[0] == r2[0] && r2[0] == r3[0] && r1[0] != ' ' ||
                            r1[1] == r2[1] && r2[1] == r3[1] && r1[1] != ' ' ||
                            r1[2] == r2[2] && r2[2] == r3[2] && r1[2] != ' ' ||
                            r1[0] == r2[1] && r2[1] == r3[2] && r1[0] != ' ' ||
                            r1[2] == r2[1] && r2[1] == r3[0] && r1[2] != ' '
            )

            {

                showBoard();
                System.out.println("");
                r1[0] = ' ';
                r1[1] = ' ';
                r1[2] = ' ';
                r2[0] = ' ';
                r2[1] = ' ';
                r2[2] = ' ';
                r3[0] = ' ';
                r3[1] = ' ';
                r3[2] = ' ';
                System.out.println(player_name+" wins!");
                System.out.print("Would you like to play again? \nY/N: ");
                String choice = userin.next();
                if (choice.equals("y") || choice.equals("Y")){
                    MainMenu();
                } else if (choice.equals("n") || choice.equals("N")) {
                    System.out.print("Goodbye \n");
                    System.exit(0); //program was not exiting on its own, so I had to add this to enforce an exit when the user selects accordingly
                };
                while(!choice.equals("y") && !choice.equals("Y") && !choice.equals("n") && !choice.equals("N")){
                    System.out.print("Wrong command, play again? Y/N: ");
                    choice = userin.next();
                };

            } else {


                if (player == p2){
                    player = p1;
                    player_name = "Player 1";
                } else {
                    player = p2;
                    player_name = "Player 2";
                };

                showBoard();
                System.out.println();
                System.out.println(player_name +"'s turn.");
                System.out.print("Enter row and column (Please use the format: rowNumber space columnNumber): ");
                int row = userin.nextInt();
                int col = userin.nextInt();
                switch(row-1){
                    case 0:
                        if (r1[col-1] != ' '){
                            System.out.println("**********************************");
                            System.out.println("That box is occupied, please try again. ");  //shows if the user chooses a box that is already occupied (row 1)
                            System.out.println("**********************************");
                            if (player == p2){
                                player = p1;
                                player_name = "Player 1";
                            } else {
                                player = p2;
                                player_name = "Player 2";
                            };
                        } else {
                            r1[col-1] = player;
                        };
                        break;

                    case 1:
                        if (r2[col-1] != ' '){
                            System.out.println("**********************************");
                            System.out.println("That box is occupied, please try again. ");  //shows if the user chooses a box that is already occupied (row 1=2)
                            System.out.println("**********************************");
                            if (player == p2){
                                player = p1;
                                player_name = "Player 1";
                            } else {
                                player = p2;
                                player_name = "Player 2";
                            };
                        } else {
                            r2[col-1] = player;
                        };
                        break;

                    case 2:
                        if (r3[col-1] != ' '){
                            System.out.println("**********************************");
                            System.out.println("That box is occupied, please try again. ");  //shows if the user chooses a box that is already occupied (row 3)
                            System.out.println("**********************************");
                            System.out.println();
                            if (player == p2){
                                player = p1;
                                player_name = "Player 1";
                            } else {
                                player = p2;
                                player_name = "Player 2";
                            };
                        } else {
                            r3[col-1] = player;
                        };
                        break;

                    default:
                        System.out.println("Invalid.");
                        break;
                }
            }

        }
    }

    public static void showBoard(){
        System.out.println("    1    2    3");
        System.out.println("1 [ "+r1[0]+" ][ "+r1[1]+" ][ "+r1[2]+" ]");
        System.out.println("2 [ "+r2[0]+" ][ "+r2[1]+" ][ "+r2[2]+" ]");  //tic tac toe board layout with user selected symbols being placed in it
        System.out.println("3 [ "+r3[0]+" ][ "+r3[1]+" ][ "+r3[2]+" ]");

    }
}