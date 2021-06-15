package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Gcd {
    private static int winningsCounter = 0;
    private static int userResult;
    private static int correctResult;

    public static void greetingGcd() {
        Cli.greeting();
        System.out.println("Find the greatest common divisor of given numbers.");
        gcdGame();
    }

    public static void gcdGame() {
        int[] digitsResult = Engine.generateDigits();

        System.out.printf("Question: %d %d\n", digitsResult[0], digitsResult[1]);
        correctResult = findGcd(digitsResult[0], digitsResult[1]);
        userResult = Engine.getAnswerForDigits();
        boolean isAnswerCorrect = Engine.isAnswerCorrect(userResult, correctResult, winningsCounter);

        if (isAnswerCorrect) {
            winningsCounter++;
            gcdGame();
        } else {
            Engine.incorrectAnswer(userResult, correctResult);
        }
    }

    public static int findGcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
