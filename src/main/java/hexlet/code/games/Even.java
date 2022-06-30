package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;


public class Even {

    public static final String GAME_RULE = "Answer 'yes' if number even otherwise answer 'no'.";
    public static final int MAX_RANDOM_NUMBER = 100;

    public static void gameEven() {

        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUND_TO_WIN][2];

        for (int i = 0; i < Engine.NUMBER_OF_ROUND_TO_WIN; i++) {
            int number = RandomUtils.nextInt(0, MAX_RANDOM_NUMBER);
            String questionNumber = String.valueOf(number);
            questionsAndAnswers[i][Engine.QUESTIONS_INDEX] = questionNumber;
            boolean numberParity = number % 2 == 0;
            questionsAndAnswers[i][Engine.ANSWERS_INDEX] = numberParity ? "yes" : "no";
        }
        Engine.playGame(GAME_RULE, questionsAndAnswers);
    }

}
