package hexlet.code.games;

import hexlet.code.Cli;
import java.util.Scanner;


public class Even {
    private static int winningsCounter = 0;
    private static String userResult;
    private static String correctResult;

    public static void greetingsEvenGame() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        evenGame();
    }

    public static void evenGame() {
        Scanner isEven = new Scanner(System.in);
        final int randomRange = 100;
        int randomDigit = (int) (Math.random() * randomRange);
        final int winsCount = 3;

        if (winningsCounter == winsCount) {
            System.out.println("Congratulations, " + Cli.getName());
            System.exit(0);
        }

        System.out.println("Question:" + randomDigit);
        System.out.println("Your answer:");
        userResult = isEven.nextLine();

        if (!userResult.equals("yes") && randomDigit % 2 != 0) {
            winningsCounter++;
            correctResult = "no";
            answerCorrect();
        } else if (!userResult.equals("yes") && randomDigit % 2 == 0) {
            correctResult = "yes";
            answerIncorrect();
        } else if (!userResult.equals("no") && randomDigit % 2 != 0) {
            correctResult = "no";
            answerIncorrect();
        } else if (!userResult.equals("no") && randomDigit % 2 == 0) {
            winningsCounter++;
            correctResult = "yes";
            answerCorrect();
        }
    }

    public static void answerIncorrect() {
        System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", userResult, correctResult);
        System.out.println("Let's try again, " + Cli.getName());
    }

    public static void answerCorrect() {
        System.out.println("Correct!");
        evenGame();
    }
}
