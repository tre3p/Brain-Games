package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import java.util.Scanner;

public class Gcd {
    private static int winningsCounter = 0;
    private static int userResult;
    private static int correctResult;
    private static final int WINS_COUNT = 3;

    public static void greetingGcd() {
        Cli.greeting();
        System.out.println("Find the greatest common divisor of given numbers.");
        gcdGame();
    }

    public static void checkIfWin() {
        if (winningsCounter == WINS_COUNT) {
            Engine.gameDone();
            System.exit(0);
        }
    }

    public static void gcdGame() {
        Scanner gcdResult = new Scanner(System.in);
        int[] digitsResult = Engine.generateDigits();

        System.out.printf("Question: %d %d\n", digitsResult[0], digitsResult[1]);
        correctResult = findGcd(digitsResult[0], digitsResult[1]);
        System.out.println("Your answer:");
        userResult = gcdResult.nextInt();

        if (userResult == correctResult) {
            winningsCounter++;
            Engine.correctAnswer();
            checkIfWin();
            gcdGame();
        } else {
            Engine.incorrectAnswerForDigits(userResult, correctResult);
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
