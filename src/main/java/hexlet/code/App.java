package hexlet.code;


import hexlet.code.games.Even;
import hexlet.code.games.Gsd;
import hexlet.code.games.Calc;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static final int EXIT = 0;
    public static final int GREET = 1;
    public static final int EVEN = 2;
    public static final int CACL = 3;
    public static final int GSD = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;

    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GSD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        Scanner in = new Scanner(System.in);
        System.out.print("Your choice: ");
        int numberGame = in.nextInt();

        switch (numberGame) {
            case EXIT -> System.out.println("You have left the game!");
            case GREET -> Cli.playerName();
            case EVEN -> Even.gameEven();
            case CACL -> Calc.gameCalc();
            case GSD -> Gsd.gameGsd();
            case PROGRESSION -> Progression.gameProgression();
            case PRIME -> Prime.gamePrime();
            default -> System.out.println("Selection error! Try to choose the game again!");
        }

    }
}
