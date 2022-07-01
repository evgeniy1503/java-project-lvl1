package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int NUMBER_OF_ROUND_TO_WIN = 3;
    public static final int QUESTIONS_INDEX = 0;
    public static final int ANSWERS_INDEX = 1;

    public static void playGame(String gameRule, String[][] questionsAndAnswers) {
        System.out.print("May I have your name? ");
        Scanner inText = new Scanner(System.in);
        String namePlayer = inText.nextLine();
        System.out.println("Hello, " + namePlayer + "!");
        System.out.println(gameRule);

        for (int i = 0; i < NUMBER_OF_ROUND_TO_WIN; i++) {
            System.out.println("Question: " + questionsAndAnswers[i][QUESTIONS_INDEX]);
            System.out.print("Your answer: ");
            String answer = inText.nextLine();
            if (answer.equals(questionsAndAnswers[i][ANSWERS_INDEX])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + questionsAndAnswers[i][1] + "'.");
                System.out.println("Let's try again, " + namePlayer + "!");
                return;
            }

        }
        System.out.println("Congratulations, " + namePlayer + "!");
    }
}
