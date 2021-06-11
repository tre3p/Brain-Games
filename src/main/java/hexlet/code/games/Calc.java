package hexlet.code.games;

import hexlet.code.Cli;
import java.util.Scanner;

public class Calc {
    private static int winningsCounter = 0;

    public static void greetingCalc() {
        final int winsCount = 3;

        if (winningsCounter == winsCount) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
            System.exit(0);
        }

        plusCalcGame();
    }


    public static void plusCalcGame() {
        Scanner isEven = new Scanner(System.in);
        final int randomRange = 100;
        int firstRandomDigit = (int) (Math.random() * randomRange);
        int secondRandomDigit = (int) (Math.random() * randomRange);

        System.out.println("What is the result of the expression?");
        System.out.println("Question:" + firstRandomDigit + "+" + secondRandomDigit);
        System.out.println("Your answer:");
        int firstResult = isEven.nextInt();
        int correctResult = firstRandomDigit + secondRandomDigit;

        if (firstResult == correctResult) {
            System.out.println("Correct!");
            winningsCounter++;
            multiplGame();
        } else {
            System.out.printf("'%d' is wrong answer ;(. Correct answer was '%d'.", firstResult, correctResult);
        }

    }

    public static void multiplGame() {
        Scanner isEven = new Scanner(System.in);
        final int randomRange = 100;
        int firstRandomDigit = (int) (Math.random() * randomRange);
        int secondRandomDigit = (int) (Math.random() * randomRange);

        System.out.println("What is the result of the expression?");
        System.out.println("Question:" + firstRandomDigit + "*" + secondRandomDigit);
        System.out.println("Your answer:");
        int firstResult = isEven.nextInt();
        int correctResult = firstRandomDigit * secondRandomDigit;

        if (firstResult == correctResult) {
            System.out.println("Correct!");
            winningsCounter++;
            minusGame();
        } else {
            System.out.printf("'%d' is wrong answer ;(. Correct answer was '%d'.", firstResult, correctResult);
            System.out.println("Let's try again, " + Cli.getName());
        }
    }

    public static void minusGame() {
        Scanner isEven = new Scanner(System.in);
        final int randomRange = 100;
        int firstRandomDigit = (int) (Math.random() * randomRange);
        int secondRandomDigit = (int) (Math.random() * randomRange);

        System.out.println("What is the result of the expression?");
        System.out.println("Question:" + firstRandomDigit + "-" + secondRandomDigit);
        System.out.println("Your answer:");
        int firstResult = isEven.nextInt();
        int correctResult = firstRandomDigit - secondRandomDigit;
        if (firstResult == correctResult) {
            System.out.println("Correct!");
            winningsCounter++;
            greetingCalc();
        } else {
            System.out.printf("'%d' is wrong answer ;(. Correct answer was '%d'.", firstResult, correctResult);
        }
    }
}
