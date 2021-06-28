package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    private static final int QUESTIONS_QUANTITY = 3;
    private static final int ANSWERS_QUANTITY = 2;

    public static String printRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static void generateQuestionAndAnswer() {
        String[][] qa = new String[QUESTIONS_QUANTITY][ANSWERS_QUANTITY];
        int[] firstPartOfRandomise = Utils.generateDigits();
        int[] secondPartOfRandomise = Utils.generateDigits();
        int[] thirdPartOfRandomise = Utils.generateDigits();
        qa[0][0] = String.format("%d %d", firstPartOfRandomise[0], firstPartOfRandomise[1]);
        qa[1][0] = String.format("%d %d", secondPartOfRandomise[0], secondPartOfRandomise[1]);
        qa[2][0] = String.format("%d %d", thirdPartOfRandomise[0], thirdPartOfRandomise[1]);
        qa[0][1] = String.valueOf(findGcd(firstPartOfRandomise[0], firstPartOfRandomise[1]));
        qa[1][1] = String.valueOf(findGcd(secondPartOfRandomise[0], secondPartOfRandomise[1]));
        qa[2][1] = String.valueOf(findGcd(thirdPartOfRandomise[0], thirdPartOfRandomise[1]));
        Engine.gameEngine(qa, printRules());
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
