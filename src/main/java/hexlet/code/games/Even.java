package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int QUESTIONS_QUANTITY = 3;
    private static final int ANSWERS_QUANTITY = 2;

    public static String printRules() {
        return "Answer 'yes' if number even otherwise answer 'no'.";
    }

    public static void generateQuestionAndAnswer() {
        String[][] qa = new String[QUESTIONS_QUANTITY][ANSWERS_QUANTITY];
        int[] firstPartOfDigits = Utils.generateDigits();
        int[] secondPartOfDigits = Utils.generateDigits();
        qa[0][0] = String.valueOf(secondPartOfDigits[0]);
        qa[1][0] = String.valueOf(secondPartOfDigits[1]);
        qa[2][0] = String.valueOf(firstPartOfDigits[0]);
        qa[0][1] = isEven(secondPartOfDigits[0]) ? "yes" : "no";
        qa[1][1] = isEven(secondPartOfDigits[1]) ? "yes" : "no";
        qa[2][1] = isEven(firstPartOfDigits[0]) ? "yes" : "no";
        Engine.gameEngine(qa, printRules());
    }

    public static boolean isEven(int firstDigit) {
        return firstDigit % 2 == 0;
    }
}
