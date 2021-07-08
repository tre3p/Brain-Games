package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int QUESTIONS_QUANTITY = 3;
    private static final int ANSWERS_QUANTITY = 2;
    private static final int MAX_RANGE_TO_GENERATE_DIGITS = 100;
    private static final int MIN_RANGE_TO_GENERATE_DIGITS = 1;

    public static String getRules() {
        return "Answer 'yes' if number even otherwise answer 'no'.";
    }

    public static void launchEvenGame() {
        String[][] qaArray = new String[QUESTIONS_QUANTITY][ANSWERS_QUANTITY];
        int[] randomiseDigits = Utils.generateDigits(MIN_RANGE_TO_GENERATE_DIGITS,
                MAX_RANGE_TO_GENERATE_DIGITS,
                QUESTIONS_QUANTITY);
        for (int i = 0; i != QUESTIONS_QUANTITY; i++) {
            qaArray[i][0] = String.valueOf(randomiseDigits[i]);
            qaArray[i][1] = isEven(randomiseDigits[i]) ? "yes" : "no";
        }
        Engine.gameEngine(qaArray, getRules());
    }

    public static boolean isEven(int firstDigit) {
        return firstDigit % 2 == 0;
    }
}
