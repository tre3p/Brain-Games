package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static int winningsCounter;
    private static final int WINS_TO_VICTORY = 3;
    private static String name;
    private static final int QUESTIONS_QUANTITY = 4;

    public static void checkIfWin() {
        if (winningsCounter == WINS_TO_VICTORY) {
            System.out.printf("Congratulations, %s!", Engine.getName());
            System.exit(0);
        }
    }

    public static void correctAnswer() {
        System.out.println("Correct!");
    }

    public static void greeting() {
        Scanner getName = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        name = getName.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public static String getName() {
        return name;
    }

    public static void incorrectAnswer(String userResult, String correctResult) {
        System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'\n", userResult, correctResult);
        System.out.printf("Let's try again, %s!", Engine.getName());
    }

    public static String getAnswer() {
        Scanner result = new Scanner(System.in);
        System.out.println("Your answer:");
        String userResult = result.nextLine();
        return userResult;
    }

    public static void evenGameEngine(String[][] qa) {
        greeting();
        int i = 0;
        if (winningsCounter == 0) {
            printEvenGameRules();
        }
        for (int j = 1; j < QUESTIONS_QUANTITY; j++) {
            System.out.printf("Question: %s\n", qa[i][0]);
            String userResult = Engine.getAnswer();
            if (userResult.equals(qa[i][1])) {
                i++;
                Engine.correctAnswer();
                winningsCounter++;
                Engine.checkIfWin();
                } else {
                String correctResult = qa[i][1];
                Engine.incorrectAnswer(userResult, correctResult);
                System.exit(0);
                }
            }
    }

    public static void printEvenGameRules() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
    }

    public static void calcGameEngine(String[][] qa) {
        greeting();
        int i = 0;
        if (winningsCounter == 0) {
            printCalcGameRules();
        }
        for (int j = 1; j < QUESTIONS_QUANTITY; j++) {
            System.out.printf("Question: %s\n", qa[i][0]);
            String userResult = Engine.getAnswer();
            if (userResult.equals(qa[i][1])) {
                i++;
                Engine.correctAnswer();
                winningsCounter++;
                Engine.checkIfWin();
            } else {
                String correctResult = qa[i][1];
                Engine.incorrectAnswer(userResult, correctResult);
                System.exit(0);
            }
        }
    }

    public static void printCalcGameRules() {
        System.out.println("What is the result of the expression?");
    }

    public static void gcdGameEngine(String[][] qa) {
        greeting();
        int i = 0;
        if (winningsCounter == 0) {
            printGdcGameRules();
        }
        for (int j = 1; j < QUESTIONS_QUANTITY; j++) {
            System.out.printf("Question: %s\n", qa[i][0]);
            String userResult = Engine.getAnswer();
            if (userResult.equals(qa[i][1])) {
                i++;
                Engine.correctAnswer();
                winningsCounter++;
                Engine.checkIfWin();
            } else {
                String correctResult = qa[i][1];
                Engine.incorrectAnswer(userResult, correctResult);
                System.exit(0);
            }
        }
    }

    public static void printGdcGameRules() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public static void progressionGameEngine(String[][] qa) {
        greeting();
        int i = 0;
        if (winningsCounter == 0) {
            printProgressionGameRules();
        }
        for (int j = 1; j < QUESTIONS_QUANTITY; j++) {
            System.out.printf("Question: %s\n", qa[i][0]);
            String userResult = Engine.getAnswer();
            if (userResult.equals(qa[i][1])) {
                i++;
                Engine.correctAnswer();
                winningsCounter++;
                Engine.checkIfWin();
            } else {
                String correctResult = qa[i][1];
                Engine.incorrectAnswer(userResult, correctResult);
                System.exit(0);
            }
        }
    }

    public static void printProgressionGameRules() {
        System.out.println("What number is missing in the progression?");
    }

    public static void primeGameEngine(String[][] qa) {
        greeting();
        int i = 0;
        if (winningsCounter == 0) {
            printPrimeGameRules();
        }
        for (int j = 1; j < QUESTIONS_QUANTITY; j++) {
            System.out.printf("Question: %s\n", qa[i][0]);
            String userResult = Engine.getAnswer();
            if (userResult.equals(qa[i][1])) {
                i++;
                Engine.correctAnswer();
                winningsCounter++;
                Engine.checkIfWin();
            } else {
                String correctResult = qa[i][1];
                Engine.incorrectAnswer(userResult, correctResult);
                System.exit(0);
            }
        }
    }

    public static void printPrimeGameRules() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }
}
