package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void gameEven() {
        System.out.print("May I have your name? ");
        Scanner inName = new Scanner(System.in);
        String namePlayer = inName.nextLine();
        System.out.println("Hello, " + namePlayer + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");
        Scanner inAnswer = new Scanner(System.in);
        int numderWins = 3;
        for (int i = 0; i < numderWins; i++) {
            int number = (int) (Math.random() * 20);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = inAnswer.nextLine();
            if (answer.equals("yes") && number % 2 == 0) {
                System.out.println("Correct!");
            } else if (answer.equals("no") && number % 2 != 0) {
                System.out.println("Correct!");
            } else {
                String correctAnswer = number % 2 == 0 ? "Correct answer was 'yes'." : "Correct answer was 'no'.";
                System.out.println("'" + answer + "'" + " is wrong answer ;( " + correctAnswer);
                System.out.println("Let's try again, " + namePlayer + "!");
                break;
            }
            if (i == 2) {
                System.out.println("Congratulatio, " + namePlayer + "!");
            }
        }
    }
}
