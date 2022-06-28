package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Prime {
    public static final String GAME_RULE = ("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    public static final int MAX_RANDOM_NUMBER = 100;

    public static void gamePrime() {

        String[] questions = new String[Engine.NUMBER_OF_ROUND_TO_WIN];
        String[] answers = new String[Engine.NUMBER_OF_ROUND_TO_WIN];

        for (int i = 0; i < Engine.NUMBER_OF_ROUND_TO_WIN; i++) {
            int number = RandomUtils.nextInt(0, MAX_RANDOM_NUMBER);
            String questionNumber = String.valueOf(number);
            questions[i] = questionNumber;
            answers[i] = checkPrime(number) ? "yes" : "no";
        }
        Engine.playGame(GAME_RULE, questions, answers);
    }
    public static boolean checkPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
