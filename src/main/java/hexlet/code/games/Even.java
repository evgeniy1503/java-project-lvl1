package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;


public class Even {

    public static final String GAME_RULE = ("Answer 'yes' if number even otherwise answer 'no'.");
    public static final int MAX_RANDOM_NUMBER = 100;

    public static void gameEven() {

        String[] questions = new String[Engine.NUMBER_OF_ROUND_TO_WIN];
        String[] answers = new String[Engine.NUMBER_OF_ROUND_TO_WIN];

        for (int i = 0; i < Engine.NUMBER_OF_ROUND_TO_WIN; i++) {
            int number = RandomUtils.nextInt(0, MAX_RANDOM_NUMBER);
            String questionNumber = String.valueOf(number);
            questions[i] = questionNumber;
            boolean numberParity = number % 2 == 0;
            answers[i] = numberParity ? "yes" : "no";
        }
        Engine.playGame(GAME_RULE, questions, answers);
    }

}
