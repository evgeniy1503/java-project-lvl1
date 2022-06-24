package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int NUMBER_OF_ROUND_TO_WIN = 3;

    public static void playGame(String gameRule, String[] questions, String[] answers) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner inName = new Scanner(System.in);
        String namePlayer = inName.nextLine();
        System.out.println("Hello, " + namePlayer + "!");
        System.out.println(gameRule);

        for (int i = 0; i < NUMBER_OF_ROUND_TO_WIN; i++) {
            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");
            Scanner inAnswer = new Scanner(System.in);
            String answer = inAnswer.nextLine();
            if (answer.equals(answers[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + answers[i] + "'.");
                System.out.println("Let's try again, " + namePlayer + "!");
                break;
            }
            if (i == 2) {
                System.out.println("Congratulations, " + namePlayer);
            }
        }
    }
}
