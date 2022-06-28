package hexlet.code;


import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gsd;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static final int EXIT = 0;
    public static final int GREET = 1;
    public static final int EVEN = 2;
    public static final int CACL = 3;
    public static final int GSD = 4;
    public static final int PROGRESSION = 5;

    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GSD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");
        Scanner in = new Scanner(System.in);
        System.out.print("Your choice: ");
        int numberGame = in.nextInt();

        if (numberGame == EXIT) {
            System.out.println("You have left the game!");
        }
        if (numberGame == GREET) {
            Cli.playerName();
        }
        if (numberGame == EVEN) {
            Even.gameEven();
        }
        if (numberGame == CACL) {
            Calc.gameCalc();
        }
        if (numberGame == GSD) {
            Gsd.gameGsd();
        }
        if (numberGame == PROGRESSION) {
            Progression.gameProgression();
        }

    }
}
