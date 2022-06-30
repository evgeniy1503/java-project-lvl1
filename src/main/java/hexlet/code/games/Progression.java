package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Progression {

    public static final String GAME_RULE = "What number is missing in the progression?";
    public static final int MAX_PROGRESSION_LENGTH = 10;
    public static final int MIN_PROGRESSION_LENGTH = 5;
    public static final int MAX_FIST_NUMBER_PROGRESSION = 15;
    public static final int MAX_STEP_PROGRESSION = 15;

    public static void gameProgression() {

        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUND_TO_WIN][2];

        for (int i = 0; i < Engine.NUMBER_OF_ROUND_TO_WIN; i++) {
            int progressionLength = RandomUtils.nextInt(MIN_PROGRESSION_LENGTH, MAX_PROGRESSION_LENGTH);
            int firstNumberProgression = RandomUtils.nextInt(0, MAX_FIST_NUMBER_PROGRESSION);
            int stepProgression = RandomUtils.nextInt(1, MAX_STEP_PROGRESSION);

            int responseIndex = RandomUtils.nextInt(0, progressionLength);
            String[] progression = makeProgression(firstNumberProgression, stepProgression, progressionLength);
            String changeNumber = progression[responseIndex];
            String question = String.join(" ", progression);
            question = question.replace(changeNumber, "..");
            questionsAndAnswers[i][Engine.QUESTIONS_INDEX] = question;
            questionsAndAnswers[i][Engine.ANSWERS_INDEX] = changeNumber;
        }
        Engine.playGame(GAME_RULE, questionsAndAnswers);
    }
    public static String[] makeProgression(int first, int step, int length) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            progression[i] = String.valueOf(first);
            first = first + step;
        }
        return progression;
    }

}
