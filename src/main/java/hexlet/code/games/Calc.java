package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class Calc {

    public static final String GAME_RULE = "What is the result of the expression?";
    public static final int MAX_RANDOM_NUMBER = 20;
    public static final char[] OPERATORS = {'*', '+', '-'};

    public static void gameCalc() {

        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUND_TO_WIN][2];


        for (int i = 0; i < Engine.NUMBER_OF_ROUND_TO_WIN; i++) {
            int numberOne = RandomUtils.nextInt(0, MAX_RANDOM_NUMBER);
            int numberTwo = RandomUtils.nextInt(0, MAX_RANDOM_NUMBER);
            String operation = RandomStringUtils.random(1, OPERATORS);
            String questionExpression = numberOne + " " + operation + " " + numberTwo;
            questionsAndAnswers[i][Engine.QUESTIONS_INDEX] = questionExpression;
            int answerExpression;
            switch (operation) {
                case "*" -> {
                    answerExpression = numberOne * numberTwo;
                    questionsAndAnswers[i][Engine.ANSWERS_INDEX] = String.valueOf(answerExpression);
                }
                case "+" -> {
                    answerExpression = numberOne + numberTwo;
                    questionsAndAnswers[i][Engine.ANSWERS_INDEX] = String.valueOf(answerExpression);
                }
                default -> {
                    answerExpression = numberOne - numberTwo;
                    questionsAndAnswers[i][Engine.ANSWERS_INDEX] = String.valueOf(answerExpression);
                }
            }


        }
        Engine.playGame(GAME_RULE, questionsAndAnswers);
    }
}
