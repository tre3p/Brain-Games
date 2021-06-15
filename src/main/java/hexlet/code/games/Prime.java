package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Prime {
    private static int winningsCounter;
    private static String userResult;
    private static String correctResult;
    private static boolean isPrime = true;

    public static void greetingsPrime() {
        Cli.greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        primeGame();
    }

    public static void primeGame() {
        int[] randomDigit = Engine.generateDigits();
        int num = randomDigit[0];
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            correctResult = "yes";
        } else {
            correctResult = "no";
        }
        System.out.printf("Question: %d\n", num);
        userResult = Engine.getAnswerForStrings();
        boolean isAnswerCorrect = Engine.isAnswerCorrect(userResult, correctResult, winningsCounter);

        if (isAnswerCorrect) {
            winningsCounter++;
            primeGame();
        } else {
            Engine.incorrectAnswer(userResult, correctResult);
        }
    }
}
