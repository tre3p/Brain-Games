package hexlet.code;

import hexlet.code.games.Progression;
import hexlet.code.games.Gcd;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class Engine {
    private static int winningsCounter;
    private static final int WINS_TO_VICTORY = 3;

    public static void checkIfWin() {
        if (winningsCounter == WINS_TO_VICTORY) {
            System.out.printf("Congratulations, %s!", Cli.getName());
            System.exit(0);
        }
    }

    public static void correctAnswer() {
        System.out.println("Correct!");
    }

    public static void incorrectAnswer(String[] userAndCorrectResult) {
        System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'\n", userAndCorrectResult[0],
                        userAndCorrectResult[1]);
        System.out.printf("Let's try again, %s!", Cli.getName());
    }

    public static String getAnswer() {
        Scanner result = new Scanner(System.in);
        System.out.println("Your answer:");
        String userResult = result.nextLine();
        return userResult;
    }

    public static void evenGameEngine() {
        String[] qa = Even.printQuestion();
        String userResult = Engine.getAnswer();
        if (userResult.equals(qa[1])) {
            Engine.correctAnswer();
            winningsCounter++;
            Engine.checkIfWin();
            Engine.evenGameEngine();
        } else {
            Engine.incorrectAnswer(qa);
        }
    }

    public static void printEvenGameRules() {
        Even.printRules();
    }

    public static void calcGameEngine() {
        String correctResult = Calc.printQuestion();
        String userResult = Engine.getAnswer();
        String[] qa = {userResult, correctResult};
        if (userResult.equals(correctResult)) {
            Engine.correctAnswer();
            winningsCounter++;
            Engine.checkIfWin();
            Engine.calcGameEngine();
        } else {
            Engine.incorrectAnswer(qa);
        }
    }

    public static void printCalcGameRules() {
        Calc.printRules();
    }

    public static void gcdGameEngine() {
        String correctResult = Gcd.gcdGameQuestion();
        String userResult = Engine.getAnswer();
        String[] qa = {userResult, correctResult};
        if (userResult.equals(correctResult)) {
            Engine.correctAnswer();
            winningsCounter++;
            Engine.checkIfWin();
            Engine.gcdGameEngine();
        } else {
            Engine.incorrectAnswer(qa);
        }
    }

    public static void printGcdGameRules() {
        Gcd.printRules();
    }

    public static void progressionGameEngine() {
        String correctResult = Progression.printQuestion();
        String userResult = Engine.getAnswer();
        String[] qa = {userResult, correctResult};
        if (userResult.equals(correctResult)) {
            Engine.correctAnswer();
            winningsCounter++;
            Engine.checkIfWin();
            Engine.progressionGameEngine();
        } else {
            Engine.incorrectAnswer(qa);
        }
    }

    public static void printProgressionGameRules() {
        Progression.printRules();
    }

    public static void primeGameEngine() {
        String correctResult = Prime.printQuestion();
        String userResult = Engine.getAnswer();
        String[] qa = {userResult, correctResult};
        if (userResult.equals(correctResult)) {
            Engine.correctAnswer();
            winningsCounter++;
            Engine.checkIfWin();
            Engine.primeGameEngine();
        } else {
            Engine.incorrectAnswer(qa);
        }
    }

    public static void printPrimeGameRules() {
        Prime.printRules();
    }
}
