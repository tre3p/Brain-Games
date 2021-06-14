package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import java.util.Scanner;

public class Prime {
    private static int winsCounter;
    private static String userResult;
    private static String correctResult;
    private static final int WINS_COUNT = 3;
    private static boolean isPrime = true;

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
        int num = 17;
        for (int i = 2; i < num; i++) {
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
