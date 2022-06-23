package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void playerName() {
        System.out.print("May I have your name? ");
        Scanner inName = new Scanner(System.in);
        String name = inName.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
