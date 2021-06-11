package hexlet.code.games;

import hexlet.code.Cli;
import java.util.Scanner;

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
        final int winsCount = 3;
        if (winningsCounter == winsCount) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
            System.exit(0);
        }

        Scanner gcdResult = new Scanner(System.in);
        final int randomRange = 100;
        int firstRandomDigit = (int) (Math.random() * randomRange);
        int secondRandomDigit = (int) (Math.random() * randomRange);
        correctResult = findGcd(firstRandomDigit, secondRandomDigit);

        System.out.printf("Question: %d %d\n", firstRandomDigit, secondRandomDigit);
        System.out.println("Your answer:");
        userResult = gcdResult.nextInt();

        if (userResult == correctResult) {
            correctAnswer();
        } else {
            incorrectAnswer();
        }
    }

    public static void correctAnswer() {
        System.out.println("Correct!");
        winningsCounter++;
        gcdGame();
    }

    public static void incorrectAnswer() {
        System.out.printf("'%d' is wrong answer ;(. Correct answer was '%d'\n", userResult, correctResult);
        System.out.printf("Let's try again, %s!", Cli.getName());
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
