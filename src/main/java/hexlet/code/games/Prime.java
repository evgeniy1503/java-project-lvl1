package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Prime {
    public static final String GAME_RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int MAX_RANDOM_NUMBER = 100;

    public static void gamePrime() {

        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUND_TO_WIN][2];

        for (int i = 0; i < Engine.NUMBER_OF_ROUND_TO_WIN; i++) {
            int number = RandomUtils.nextInt(2, MAX_RANDOM_NUMBER);
            String questionNumber = String.valueOf(number);
            questionsAndAnswers[i][Engine.QUESTIONS_INDEX] = questionNumber;
            questionsAndAnswers[i][Engine.ANSWERS_INDEX] = isCheckPrime(number) ? "yes" : "no";
        }
        Engine.playGame(GAME_RULE, questionsAndAnswers);
    }
    public static boolean isCheckPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
