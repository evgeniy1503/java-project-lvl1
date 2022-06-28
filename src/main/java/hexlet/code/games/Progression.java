package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Progression {

    public static final String GAME_RULE = ("What number is missing in the progression?");
    public static final int MAX_PROGRESSION_LENGTH = 10;
    public static final int MIN_PROGRESSION_LENGTH = 5;
    public static final int MAX_FIST_NUMBER_PROGRESSION = 15;
    public static final int MAX_STEP_PROGRESSION = 15;

    public static void gameProgression() {

        String[] questions = new String[Engine.NUMBER_OF_ROUND_TO_WIN];
        String[] answers = new String[Engine.NUMBER_OF_ROUND_TO_WIN];

        for (int i = 0; i < Engine.NUMBER_OF_ROUND_TO_WIN; i++) {
            int progressionLength = RandomUtils.nextInt(MIN_PROGRESSION_LENGTH, MAX_PROGRESSION_LENGTH);
            int firstNumberProgression = RandomUtils.nextInt(0, MAX_FIST_NUMBER_PROGRESSION);
            int stepProgression = RandomUtils.nextInt(1, MAX_STEP_PROGRESSION);
            int[] progressionsArray = new int[progressionLength];
            StringBuilder question = new StringBuilder(String.valueOf(firstNumberProgression));
            for (int j = 0; j < progressionLength; j++) {
                int progressionNumber = firstNumberProgression + stepProgression;
                question.append(" ").append(progressionNumber);
                progressionsArray[j] = firstNumberProgression;
                firstNumberProgression = progressionNumber;
            }

            int responseIndex = RandomUtils.nextInt(0, progressionLength);
            String answer = String.valueOf(progressionsArray[responseIndex]);
            question = new StringBuilder(question.toString().replaceFirst(answer, ".."));
            questions[i] = question.toString();
            answers[i] = answer;
        }
        Engine.playGame(GAME_RULE, questions, answers);
    }

}
