package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    private static final int QUESTIONS_QUANTITY = 3;
    private static final int ANSWERS_QUANTITY = 2;
    private static final int MAX_RANGE_TO_GENERATE_DIGITS = 100;
    private static final int QUANTITY_OF_RANDOM_DIGITS = 6;

    public static String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static void launchGcdGame() {
        int counter = 0;
        String[][] qa = new String[QUESTIONS_QUANTITY][ANSWERS_QUANTITY];
        int[] randomDigits = Utils.generateDigits(1, MAX_RANGE_TO_GENERATE_DIGITS, QUANTITY_OF_RANDOM_DIGITS);
        for (int i = 0; i != QUANTITY_OF_RANDOM_DIGITS / 2; i++) {
            qa[i][0] = String.format("%d %d", randomDigits[counter], randomDigits[counter + 1]);
            qa[i][1] = String.valueOf(findGcd(randomDigits[counter], randomDigits[counter + 1]));
            counter = counter + 2;
        }
        Engine.gameEngine(qa, getRules());
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
