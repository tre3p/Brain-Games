package hexlet.code.games;

import hexlet.code.Cli;
import java.util.Scanner;

public class Calc {
    private static int winningsCounter = 0;
    private static int userResult;
    private static int correctResult;

    public static void greetingCalc() {
        Cli.greeting();
        plusCalcGame();
    }
    public static void checkIfWin() {
        final int winsCount = 3;
        if (winningsCounter == winsCount) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
            System.exit(0);
        }
    }


    public static void plusCalcGame() {
        Scanner isEven = new Scanner(System.in);
        final int randomRange = 100;
        int firstRandomDigit = (int) (Math.random() * randomRange);
        int secondRandomDigit = (int) (Math.random() * randomRange);

        System.out.println("What is the result of the expression?");
        System.out.println("Question: " + firstRandomDigit + " + " + secondRandomDigit);
        System.out.println("Your answer:");
        userResult = isEven.nextInt();
        correctResult = firstRandomDigit + secondRandomDigit;

        if (userResult == correctResult) {
            System.out.println("Correct!");
            winningsCounter++;
            multiplGame();
        } else {
            incorrectAnswer();
        }

    }

    public static void multiplGame() {
        Scanner isEven = new Scanner(System.in);
        final int randomRange = 100;
        int firstRandomDigit = (int) (Math.random() * randomRange);
        int secondRandomDigit = (int) (Math.random() * randomRange);
        System.out.println("Question: " + firstRandomDigit + " * " + secondRandomDigit);
        System.out.println("Your answer:");
        userResult = isEven.nextInt();
        correctResult = firstRandomDigit * secondRandomDigit;

        if (userResult == correctResult) {
            System.out.println("Correct!");
            winningsCounter++;
            minusGame();
        } else {
            incorrectAnswer();
        }
    }

    public static void minusGame() {
        Scanner isEven = new Scanner(System.in);
        final int randomRange = 100;
        int firstRandomDigit = (int) (Math.random() * randomRange);
        int secondRandomDigit = (int) (Math.random() * randomRange);

        System.out.println("Question: " + firstRandomDigit + " - " + secondRandomDigit);
        System.out.println("Your answer:");
        userResult = isEven.nextInt();
        correctResult = firstRandomDigit - secondRandomDigit;
        if (userResult == correctResult) {
            System.out.println("Correct!");
            winningsCounter++;
            checkIfWin();
        } else {
            incorrectAnswer();
        }
    }

    public static void incorrectAnswer() {
        System.out.printf("'%d' is wrong answer ;(. Correct answer was '%d'.\n", userResult, correctResult);
        System.out.println("Let's try again, " + Cli.getName() + "!");
    }
}
