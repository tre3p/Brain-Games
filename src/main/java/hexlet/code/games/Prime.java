package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int QUESTIONS_QUANTITY = 3;
    private static final int ANSWERS_QUANTITY = 2;

    public static String printRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static void generateQuestionAndAnswer() {
        String[][] qa = new String[QUESTIONS_QUANTITY][ANSWERS_QUANTITY];
        int[] firstPartOfDigits = Utils.generateDigits();
        int[] secondPartOfDigits = Utils.generateDigits();
        qa[0][0] = String.valueOf(firstPartOfDigits[0]);
        qa[1][0] = String.valueOf(firstPartOfDigits[1]);
        qa[2][0] = String.valueOf(secondPartOfDigits[0]);
        qa[0][1] = isPrime(firstPartOfDigits[0]) ? "yes" : "no";
        qa[1][1] = isPrime(firstPartOfDigits[1]) ? "yes" : "no";
        qa[2][1] = isPrime(secondPartOfDigits[0]) ? "yes" : "no";
        Engine.gameEngine(qa, printRules());
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
