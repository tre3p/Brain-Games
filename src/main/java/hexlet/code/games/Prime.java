package hexlet.code.games;

import hexlet.code.Cli;
import java.math.BigInteger;
import java.util.Scanner;

public class Prime {
    private static int winsCounter;
    private static String result;
    private static String correctResult;
    public static void greetingsPrime() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        primeGame();
    }

    public static void primeGame() {
        final int winsToFinish = 3;

        if (winsCounter == winsToFinish) {
            System.out.printf("Congratulations, %s", Cli.getName());
            System.exit(0);
        }

        Scanner sc = new Scanner(System.in);
        final int rangeOfTheIntegers = 100;
        Integer integer = (int) (Math.random() * rangeOfTheIntegers);
        BigInteger bigInteger = BigInteger.valueOf(integer);
        boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(integer));

        if (probablePrime) {
            correctResult = "yes";
        } else {
            correctResult = "no";
        }
        System.out.printf("Question: %d\n", integer);
        System.out.println("Your answer:");
        result = sc.nextLine();

        if (result.equals(correctResult)) {
            correctAnswer();
        } else if (!result.equals(correctResult)) {
            incorrectAnswer();
        }
    }

    public static void correctAnswer() {
        winsCounter++;
        System.out.println("Correct!");
        primeGame();
    }

    public static void incorrectAnswer() {
        System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", result, correctResult);
    }
}
