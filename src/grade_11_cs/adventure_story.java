package grade_11_cs;
import java.util.Scanner;
public class adventure_story {
    public static void main(String[] args) {
        Scanner userin = new Scanner(System.in);

        String userChoice;

        System.out.println("You are sitting on a bench and an apple falls on your head. Do you eat the apple? \nYES OR NO");
        userChoice = userin.next();

        if (userChoice.equals("YES")) {
            System.out.println("You eat the apple and wait a little. You don't feel so well and suddenly throw up. Do you" +
                    "go home or go to the hospital?\nHOME OR HOSPITAL");
            userChoice = userin.next();

            if (userChoice.equals("HOME")) {
                System.out.println("You go home and take some medicine. You don't feel better. Do you go to the hospital?\nYES OR NO");
                userChoice = userin.next();

                if (userChoice.equals("YES")) {
                    System.out.println("You go to the hospital and are diagnosed with lead poisoning. They treat you and " +
                            "you recover. You continue with your life as normal.");

                } else if (userChoice.equals("NO")) {
                    System.out.println("You feel worse and decide to just go to sleep. You don't wake up. \nGAME OVER");
                }
            } else if (userChoice.equals("HOSPITAL")) {
                System.out.println("You are diagnosed with lead poisoning in the hospital. They offer you treatment." +
                        "Do you take the treatment?\nYES OR NO");
                userChoice = userin.next();

                if (userChoice.equals("YES")) {
                    System.out.println("You recover from lead poisoning and continue with your life as normal. ");

                } else if (userChoice.equals("NO")) {
                    System.out.println("You refuse treatment. You return home and perish a mere 24 hours after. GAME OVER");
                }
            }
        }
        else if (userChoice.equals("NO")) {
            System.out.println("A stranger sits next to you and tells you to eat the apple. They say nothing else and leave." +
                    "Do you eat the apple?\nYES OR NO");
            userChoice = userin.next();

            if (userChoice.equals("YES")) {
                System.out.println("Your vision begins to go blurry and you don't feel so well. Do you continue sitting on the bench?" +
                        "\nYES OR NO");
                userChoice = userin.next();

                if (userChoice.equals("YES")) {
                    System.out.println("The stranger asks you if you're ok. He reveals that he was hired by your close friends to play" +
                            "a prank on you. He takes you to the hospital where the doctors discover you had lead poisoning." +
                            "They treat you and you recover. You continue with your life as normal.");

                } else if (userChoice.equals("NO")) {
                    System.out.println("You begin to run away from the bench and the stranger. You don't make it too far and fall unconscious" +
                            "You wake up in the hospital. The doctors tell you that you had lead poisoning. They treated you and you recovered fine." +
                            "You never eat apples again and continue with you life as normal.");
                }
            } else if (userChoice.equals("NO")) {
                System.out.println("The stranger comes back with a friend. The stranger picks up the apple and tells you to eat it." +
                        "His friend, a large body builder with scary tattoos, stares you down during this encounter. Do you eat the apple?" +
                        "\nYES OR NO");
                userChoice = userin.next();

                if (userChoice.equals("YES")) {
                    System.out.println("You eat the apple and nothing happens. The strangers laugh and reveal to you" +
                            "that your friend of many year hired them to play a prank on you. You all have a good laugh" +
                            "and continue with your lives as normal.");

                } else if (userChoice.equals("NO")) {
                    System.out.println("You decide not to eat the apple. The strangers friend attempts to grab you but you dodge him and run home." +
                            "You never tell anyone about the encounter and you never see the stranger and his friend again.");
                }
            }
        }
    }
}