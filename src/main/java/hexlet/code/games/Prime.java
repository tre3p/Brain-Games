package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int QUESTIONS_QUANTITY = 3;
    private static final int ANSWERS_QUANTITY = 2;
    private static final int MAX_RANGE_TO_GENERATE_DIGITS = 100;
    private static final int QUANTITY_OF_RANDOM_DIGITS = 3;

    public static String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static void launchPrimeGame() {
        String[][] qa = new String[QUESTIONS_QUANTITY][ANSWERS_QUANTITY];
        int[] randomDigits = Utils.generateDigits(1, MAX_RANGE_TO_GENERATE_DIGITS, QUANTITY_OF_RANDOM_DIGITS);
        for (int i = 0; i != randomDigits.length; i++) {
            qa[i][0] = String.valueOf(randomDigits[i]);
            qa[i][1] = isPrime(randomDigits[i]) ? "yes" : "no";
        }
        Engine.gameEngine(qa, getRules());
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
