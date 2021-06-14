package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import java.util.Scanner;

public class Prime {
    private static int winsCounter;
    private static String userResult;
    private static String correctResult;
    private static final int WINS_COUNT = 3;
    private static final int MAX = 100;
    private static final int MIN = 1;
    private static boolean probablePrime = true;

    public static void greetingsPrime() {
        Cli.greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        primeGame();
    }

    public static void primeGame() {
        if (winsCounter == WINS_COUNT) {
            Engine.gameDone();
            System.exit(0);
        }
        Scanner sc = new Scanner(System.in);
        int[] randomDigit = Engine.generateDigits();
        for (int i = 2; i <= randomDigit[0] / 2; i++) {
            if (randomDigit[0] % i == 0) {
                probablePrime = false;
                break;
            }
        }
        if (probablePrime) {
            correctResult = "yes";
        } else {
            correctResult = "no";
        }
        System.out.printf("Question: %d\n", randomDigit[0]);
        System.out.print("Your answer:");
        userResult = sc.nextLine();

        if (userResult.equals(correctResult)) {
            winsCounter++;
            Engine.correctAnswer();
            primeGame();
        } else {
            Engine.incorrectAnswerForStrings(userResult, correctResult);
        }
    }
}
