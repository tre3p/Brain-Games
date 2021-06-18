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
    private static int winningsCounter;
    private static final int LENGTH_OF_PROGRESSION = 10;
    private static final int COMPLEXITY = 30;
    private static String correctResult;
    private static String userResult;

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

    public static void incorrectAnswer() {
        System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'\n", userResult, correctResult);
        System.out.printf("Let's try again, %s!", Cli.getName());
    }

    public static void gameDone() {
        System.out.printf("Congratulations, %s!", Cli.getName());
        System.exit(0);
    }

    public static boolean isAnswerCorrect() {
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

    public static String getAnswer() {
        Scanner result = new Scanner(System.in);
        System.out.println("Your answer:");
        userResult = result.nextLine();
        return userResult;
    }


    public static void gcdGameGreetingsRules() {
        Cli.greeting();
        Gcd.gcdGameRules();
        gcdGameEngine();
    }

    public static void progressionGameGreetingRules() {
        Cli.greeting();
        Progression.progressionGameRules();
        progressionGameEngine();
    }

    public static void primeGameGreetingRules() {
        Cli.greeting();
        Prime.primeGameRules();
        primeGameEngine();
    }

    public static void evenGameGreetingRules() {
        Cli.greeting();
        Even.evenGameRules();
        evenGameEngine();
    }

    public static void calcGameGreetingRules() {
        Cli.greeting();
        Calc.calcGameRules();
        calcGameEngine();
    }

    public static void gcdGameEngine() {
        correctResult = Gcd.gcdGameQuestion(Engine.generateDigits());
        userResult = Engine.getAnswer();
        boolean isAnswerCorrect = Engine.isAnswerCorrect();
        if (isAnswerCorrect) {
            winningsCounter++;
            Engine.gcdGameEngine();
        } else {
            Engine.incorrectAnswer();
        }
    }

    public static void progressionGameEngine() {
        int complexityOfProgression = (int) (Math.random() * COMPLEXITY);
        int differenceOfProgression = (int) (Math.random() * complexityOfProgression);
        correctResult = Progression.printProgression(complexityOfProgression, differenceOfProgression,
                        LENGTH_OF_PROGRESSION);
        userResult = Engine.getAnswer();
        boolean isAnswerCorrect = Engine.isAnswerCorrect();
        if (isAnswerCorrect) {
            winningsCounter++;
            Engine.progressionGameEngine();
        } else {
            Engine.incorrectAnswer();
        }
    }

    public static void primeGameEngine() {
        boolean isPrime = Prime.checkIsPrime(Engine.generateDigits());
        userResult = Engine.getAnswer();
        if (isPrime) {
            correctResult = "yes";
        } else {
            correctResult = "no";
        }
        boolean isAnswerCorrect = Engine.isAnswerCorrect();
        if (isAnswerCorrect) {
            winningsCounter++;
            Engine.primeGameEngine();
        } else {
            Engine.incorrectAnswer();
        }
    }

    public static void evenGameEngine() {
        int[] num = Engine.generateDigits();
        Even.evenGame(num[0]);
        userResult = Engine.getAnswer();
        if (num[0] % 2 == 0) {
            correctResult = "yes";
        } else {
            correctResult = "no";
        }
        boolean isAnswerCorrect = Engine.isAnswerCorrect();
        if (isAnswerCorrect) {
            winningsCounter++;
            Engine.evenGameEngine();
        } else {
            Engine.incorrectAnswer();
        }
    }

    public static void calcGameEngine() {
        int[] digits = Engine.generateDigits();
        correctResult = Calc.calcGame(digits, winningsCounter);
        userResult = Engine.getAnswer();
        boolean isAnswerCorrect = Engine.isAnswerCorrect();
        if (isAnswerCorrect) {
            winningsCounter++;
            Engine.calcGameEngine();
        } else {
            Engine.incorrectAnswer();
        }
    }
}
