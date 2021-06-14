package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import java.util.Scanner;

public class Calc {
    private static int winningsCounter = 0;
    private static final int WINS_COUNT = 3;

    public static void greetingCalc() {
        Cli.greeting();
        System.out.println("What is the result of the expression?");
        calcGame();
    }

    public static void checkIfWin() {
        if (winningsCounter == WINS_COUNT) {
            Engine.gameDone();
            System.exit(0);
        }
    }


    public static void calcGame() {
        Scanner isEven = new Scanner(System.in);
        int[] digitsResult = Engine.generateDigits();
        if (winningsCounter == 0) {
            System.out.println("Question: " + digitsResult[0] + " + " + digitsResult[1]);
            System.out.println("Your answer:");
            int userResult = isEven.nextInt();
            int correctResult = digitsResult[0] + digitsResult[1];
            if (userResult == correctResult) {
                Engine.correctAnswer();
                winningsCounter++;
                calcGame();
            } else {
                Engine.incorrectAnswerForDigits(userResult, correctResult);
            }
        } else if (winningsCounter == 1) {
            System.out.println("Question: " + digitsResult[0] + " * " + digitsResult[1]);
            System.out.println("Your answer:");
            int userResult = isEven.nextInt();
            int correctResult = digitsResult[0] * digitsResult[1];
                if (userResult == correctResult) {
                    Engine.correctAnswer();
                    winningsCounter++;
                    calcGame();
                } else {
                    Engine.incorrectAnswerForDigits(userResult, correctResult);
            }
        } else if (winningsCounter == 2) {
            System.out.println("Question: " + digitsResult[0] + " - " + digitsResult[1]);
            System.out.println("Your answer:");
            int userResult = isEven.nextInt();
            int correctResult = digitsResult[0] - digitsResult[1];
                if (userResult == correctResult) {
                    Engine.correctAnswer();
                    winningsCounter++;
                    calcGame();
                } else {
                    Engine.incorrectAnswerForDigits(userResult, correctResult);
            }
        } else if (winningsCounter == WINS_COUNT) {
            Engine.gameDone();
        }
    }
}
