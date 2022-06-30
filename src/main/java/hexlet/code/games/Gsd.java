package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Gsd {
    public static final String GAME_RULE = "Find the greatest common divisor of given numbers.";
    public static final int MAX_RANDOM_NUMBER = 100;

    public static void gameGsd() {

        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUND_TO_WIN][2];

        for (int i = 0; i < Engine.NUMBER_OF_ROUND_TO_WIN; i++) {
            int numberOne = RandomUtils.nextInt(1, MAX_RANDOM_NUMBER);
            int numberTwo = RandomUtils.nextInt(1, MAX_RANDOM_NUMBER);
            String question = numberOne + " " + numberTwo;
            questionsAndAnswers[i][Engine.QUESTIONS_INDEX] = question;
            String answer = Integer.toString(gsd(numberOne, numberTwo));
            questionsAndAnswers[i][Engine.ANSWERS_INDEX] = answer;
        }
        Engine.playGame(GAME_RULE, questionsAndAnswers);
    }
    public static int gsd(int numberOne, int numberTwo) {
        int gcd = 1;
        for (int i = 1; i <= numberOne && i <= numberTwo; i++) {
            if (numberOne % i == 0 && numberTwo % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
