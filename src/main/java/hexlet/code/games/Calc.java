package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int QUESTIONS_QUANTITY = 3;
    private static final int ANSWERS_QUANTITY = 2;
    private static final int MIN_RANGE_FOR_SIMPLE_OPERATIONS = 10;
    private static final int MAX_RANGE_FOR_SIMPLE_OPERATIONS = 20;
    private static final int MIN_RANGE_FOR_HARD_OPERATIONS = 10;
    private static final int MAX_RANGE_FOR_HARD_OPERATIONS = 30;
    private static final int DIGITS_QUANTITY = 2;

    public static String getRules() {
        return "What is the result of the expression?";
    }

    public static void launchCalcGame() {
        String[][] qaArray = new String[QUESTIONS_QUANTITY][ANSWERS_QUANTITY];
        int[] firstPartOfRandomise = Utils.generateDigits(MIN_RANGE_FOR_SIMPLE_OPERATIONS,
                MAX_RANGE_FOR_SIMPLE_OPERATIONS,
                DIGITS_QUANTITY);
        int[] secondPartOfRandomise = Utils.generateDigits(MIN_RANGE_FOR_SIMPLE_OPERATIONS,
                MAX_RANGE_FOR_SIMPLE_OPERATIONS,
                DIGITS_QUANTITY);
        int[] thirdPartOfRandomise = Utils.generateDigits(MIN_RANGE_FOR_HARD_OPERATIONS,
                MAX_RANGE_FOR_HARD_OPERATIONS,
                DIGITS_QUANTITY);

        qaArray[0][0] = String.format("%d + %d", firstPartOfRandomise[0], firstPartOfRandomise[1]);
        qaArray[1][0] = String.format("%d - %d", secondPartOfRandomise[0], secondPartOfRandomise[1]);
        qaArray[2][0] = String.format("%d * %d", thirdPartOfRandomise[0], thirdPartOfRandomise[1]);
        qaArray[0][1] = String.valueOf(firstPartOfRandomise[0] + firstPartOfRandomise[1]);
        qaArray[1][1] = String.valueOf(secondPartOfRandomise[0] - secondPartOfRandomise[1]);
        qaArray[2][1] = String.valueOf(thirdPartOfRandomise[0] * thirdPartOfRandomise[1]);
        Engine.gameEngine(qaArray, getRules());
    }
}
