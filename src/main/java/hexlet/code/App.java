package hexlet.code;


import java.util.Scanner;
import hexlet.code.games.Even;

public class App {
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        Scanner in = new Scanner(System.in);
        System.out.print("Your choice: ");
        int numberGame = in.nextInt();

        if (numberGame == 0) {
            System.out.println("You have left the game!");
        }
        if (numberGame == 1) {
            Cli.playerName();
        }
        if (numberGame == 2) {
            Even.gameEven();
        }


    }
}
