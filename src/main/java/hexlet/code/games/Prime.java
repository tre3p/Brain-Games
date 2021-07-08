package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int QUESTIONS_QUANTITY = 3;
    private static final int ANSWERS_QUANTITY = 2;
    private static final int MAX_RANGE_TO_GENERATE_DIGITS = 100;
    private static final int MIN_RANGE_TO_GENERATE_DIGITS = 1;

    public static String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static void launchPrimeGame() {
        String[][] qaArray = new String[QUESTIONS_QUANTITY][ANSWERS_QUANTITY];
        int[] randomDigits = Utils.generateDigits(MIN_RANGE_TO_GENERATE_DIGITS,
                MAX_RANGE_TO_GENERATE_DIGITS,
                QUESTIONS_QUANTITY);
        for (int i = 0; i != QUESTIONS_QUANTITY; i++) {
            qaArray[i][0] = String.valueOf(randomDigits[i]);
            qaArray[i][1] = isPrime(randomDigits[i]) ? "yes" : "no";
        }
        Engine.gameEngine(qaArray, getRules());
    }

    public static boolean isPrime(int num) {
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
