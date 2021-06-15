package hexlet.code;

import hexlet.code.games.Progression;
import hexlet.code.games.Gcd;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class Engine {
    private static final int RANDOM_RANGE = 100;
    private static final int WINS_COUNT = 2;
    public static void gameChooser() {
        final int firstGame = 2;
        final int secondGame = 3;
        final int thirdGame = 4;
        final int fourthGame = 5;
        final int sixthGame = 6;

        System.out.println("Please enter the game number and press Enter.");
        Scanner chooseGame = new Scanner(System.in);
        chooseGame();
        int result = chooseGame.nextInt();

        switch (result) {
            case 1:
                System.out.println("Welcome to the Brain Games!");
                Cli.greeting();
                break;
            case firstGame:
                Even.greetingsEvenGame();
                break;
            case secondGame:
                Calc.greetingCalc();
                break;
            case thirdGame:
                Gcd.greetingGcd();
                break;
            case fourthGame:
                Progression.greetingProgression();
                break;
            case sixthGame:
                Prime.greetingsPrime();
                break;
            default:
                break;
        }
    }

    public static void chooseGame() {
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.println("Please enter the game number and press Enter.");
    }

    public static int[] generateDigits() {
        int[] digits = new int[2];
        int firstRandomDigit = (int) (Math.random() * RANDOM_RANGE);
        int secondRandomDigit = (int) (Math.random() * RANDOM_RANGE);
        digits[0] = firstRandomDigit;
        digits[1] = secondRandomDigit;
        return digits;
    }

    public static void correctAnswer() {
        System.out.println("Correct!");
    }

    public static void incorrectAnswer(int userResult, int correctResult) {
        System.out.printf("'%d' is wrong answer ;(. Correct answer was '%d'\n", userResult, correctResult);
        System.out.printf("Let's try again, %s!", Cli.getName());
    }

    public static void incorrectAnswer(String userResult, String correctResult) {
        System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'\n", userResult, correctResult);
        System.out.printf("Let's try again, %s!", Cli.getName());
    }

    public static void gameDone() {
        System.out.printf("Congratulations, %s!", Cli.getName());
        System.exit(0);
    }

    public static boolean isAnswerCorrect(int userResult, int correctResult, int winningsCounter) {
        boolean isAnswerCorrect = false;

        if (userResult == correctResult) {
            Engine.correctAnswer();
            isAnswerCorrect = true;
        }

        if (winningsCounter == WINS_COUNT && isAnswerCorrect) {
            Engine.gameDone();
        }
        return isAnswerCorrect;
    }

    public static boolean isAnswerCorrect(String userResult, String correctResult, int winningsCounter) {
        boolean isAnswerCorrect = false;

        if (userResult.equals(correctResult)) {
            Engine.correctAnswer();
            isAnswerCorrect = true;
        }

        if (winningsCounter == WINS_COUNT && isAnswerCorrect) {
            Engine.gameDone();
        }
        return isAnswerCorrect;
    }

    public static int getAnswerForDigits() {
        int userResult = 0;
        Scanner result = new Scanner(System.in);
        System.out.println("Your answer:");
        userResult = result.nextInt();
        return userResult;
    }

    public static String getAnswerForStrings() {
        String userResult;
        Scanner result = new Scanner(System.in);
        System.out.println("Your answer:");
        userResult = result.nextLine();
        return userResult;
    }
}
