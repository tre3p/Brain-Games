package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import java.util.Scanner;

public class Even {
    private static int winningsCounter = 0;
    private static String userResult;
    private static String correctResult;
    private static final int WINS_COUNT = 3;
    private static final int RANDOM_RANGE = 100;
    public static void greetingsEvenGame() {
        Cli.greeting();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        evenGame();
    }

    public static void evenGame() {
        if (winningsCounter == WINS_COUNT) {
            Engine.gameDone();
            System.exit(0);
        }

        Scanner isEven = new Scanner(System.in);
        int randomDigit = (int) (Math.random() * RANDOM_RANGE);

        System.out.println("Question: " + randomDigit);
        System.out.println("Your answer:");
        userResult = isEven.nextLine();

        if (randomDigit % 2 == 0) {
            correctResult = "yes";
        } else {
            correctResult = "no";
        }

        if (userResult.equals(correctResult)) {
            winningsCounter++;
            Engine.correctAnswer();
            evenGame();
        } else {
            Engine.incorrectAnswerForStrings(userResult, correctResult);
        }
    }
}
