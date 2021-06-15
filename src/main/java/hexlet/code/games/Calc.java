package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Calc {
    private static int winningsCounter = 0;
    private static int userResult = 0;
    private static int correctResult = 0;

    public static void greetingCalc() {
        Cli.greeting();
        System.out.println("What is the result of the expression?");
        calcGame();
    }

    public static void calcGame() {
        int[] digitsResult = Engine.generateDigits();
        if (winningsCounter == 0) {
            System.out.println("Question: " + digitsResult[0] + " + " + digitsResult[1]);
            userResult = Engine.getAnswerForDigits();
            countCorrectAnswer(digitsResult);
            boolean isCorrect = Engine.isAnswerCorrect(userResult, correctResult, winningsCounter);
            isAnswerCorrect(isCorrect);
        } else if (winningsCounter == 1) {
            System.out.println("Question: " + digitsResult[0] + " * " + digitsResult[1]);
            userResult = Engine.getAnswerForDigits();
            countCorrectAnswer(digitsResult);
            boolean isCorrect = Engine.isAnswerCorrect(userResult, correctResult, winningsCounter);
            isAnswerCorrect(isCorrect);
        } else if (winningsCounter == 2) {
            System.out.println("Question: " + digitsResult[0] + " - " + digitsResult[1]);
            userResult = Engine.getAnswerForDigits();
            countCorrectAnswer(digitsResult);
            boolean isCorrect = Engine.isAnswerCorrect(userResult, correctResult, winningsCounter);
            isAnswerCorrect(isCorrect);
        }
    }

    public static void countCorrectAnswer(int[] digits) {
        if (winningsCounter == 0) {
            correctResult = digits[0] + digits[1];
        } else if (winningsCounter == 1) {
            correctResult = digits[0] * digits[1];
        } else if (winningsCounter == 2) {
            correctResult = digits[0] - digits[1];
        }
    }

    public static void isAnswerCorrect(boolean isAnswerCorrect) {
        if (isAnswerCorrect) {
            winningsCounter++;
            calcGame();
        } else {
            Engine.incorrectAnswer(userResult, correctResult);
        }
    }
}
