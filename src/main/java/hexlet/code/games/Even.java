package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Even {
    private static int winningsCounter = 0;
    private static String userResult;
    private static String correctResult;
    public static void greetingsEvenGame() {
        Cli.greeting();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        evenGame();
    }

    public static void evenGame() {
        int[] randomDigit = Engine.generateDigits();

        System.out.println("Question: " + randomDigit[0]);
        userResult = Engine.getAnswerForStrings();

        if (randomDigit[0] % 2 == 0) {
            correctResult = "yes";
        } else {
            correctResult = "no";
        }

        boolean isAnswerCorrect = Engine.isAnswerCorrect(userResult, correctResult, winningsCounter);

        if (isAnswerCorrect) {
            winningsCounter++;
            evenGame();
        } else {
            Engine.incorrectAnswer(userResult, correctResult);
        }
    }
}
