package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int QUESTIONS_QUANTITY = 3;
    private static final int ANSWERS_QUANTITY = 2;
    private static final int MAX_RANGE_TO_GENERATE_DIGITS = 100;
    private static final int QUANTITY_OF_RANDOM_DIGITS = 3;

    public static String getRules() {
        return "Answer 'yes' if number even otherwise answer 'no'.";
    }

    public static void launchEvenGame() {
        String[][] qa = new String[QUESTIONS_QUANTITY][ANSWERS_QUANTITY];
        int[] randomiseDigits = Utils.generateDigits(1, MAX_RANGE_TO_GENERATE_DIGITS,
                                                    QUANTITY_OF_RANDOM_DIGITS);
        for (int i = 0; i != randomiseDigits.length; i++) {
            qa[i][0] = String.valueOf(randomiseDigits[i]);
            qa[i][1] = isEven(randomiseDigits[i]) ? "yes" : "no";
        }
        Engine.gameEngine(qa, getRules());
    }

    public static boolean isEven(int firstDigit) {
        return firstDigit % 2 == 0;
    }
}
