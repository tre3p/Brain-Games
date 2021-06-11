package hexlet.code.games;

import hexlet.code.Cli;
import java.util.Scanner;

public class Progression {
    private static String userResult;
    private static String correctResult;
    public static void greetingProgression() {
        Cli.greeting();
        System.out.println("What number is missing in the progression?");
        firstProgressionGame();
    }

    public static void firstProgressionGame() {
        Scanner sc = new Scanner(System.in);
        final int complexityOfProgression = 20;
        final int differenceOfProgression = 3;
        final int lengthOfProgression = 10;
        printProgression((int) (Math.random() * complexityOfProgression), differenceOfProgression, lengthOfProgression);
        System.out.println("Your answer:");
        userResult = sc.nextLine();

        if (userResult.equals(correctResult)) {
            System.out.println("Correct!");
            secondProgressionGame();
        } else {
            progressionGameFailed();
        }
    }

    public static void secondProgressionGame() {
        Scanner sc = new Scanner(System.in);
        final int complexityOfProgression = 30;
        final int differenceOfProgression = 6;
        final int lengthOfProgression = 10;
        System.out.println("Question:");
        printProgression((int) (Math.random() * complexityOfProgression), differenceOfProgression, lengthOfProgression);
        System.out.println("Your answer:");
        userResult = sc.nextLine();

        if (userResult.equals(correctResult)) {
            System.out.println("Correct!");
            thirdProgressionGame();
        } else {
            progressionGameFailed();
        }
    }

    public static void thirdProgressionGame() {
        Scanner sc = new Scanner(System.in);
        final int complexityOfProgression = 5;
        final int differenceOfProgression = 7;
        final int lengthOfProgression = 10;
        printProgression((int) (Math.random() * complexityOfProgression), differenceOfProgression, lengthOfProgression);
        System.out.println("Your answer:");
        userResult = sc.nextLine();

        if (userResult.equals(correctResult)) {
            System.out.println("Correct!");
            progressionGameDone();
        } else {
            progressionGameFailed();
        }
    }

    public static void progressionGameDone() {
        System.out.printf("Congratulations, %s", Cli.getName() + "!");
    }

    public static void progressionGameFailed() {
        System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", userResult, correctResult);
        System.out.printf("Let's try again, %s", Cli.getName());
    }

    public static void printProgression(int a, int d, int n) {
        StringBuilder sb = new StringBuilder();
        int temp = a;
        String result = "";
        String[] progression = new String[n];

        for (int i = 0; i < n; i++) {
            temp += d;
            progression[i] = result.valueOf(temp);
        }

        int findIndexToDots = n - 1;
        int dotsIndex = (int) (Math.random() * findIndexToDots);
        correctResult = progression[dotsIndex];
        progression[dotsIndex] = "..";

        for (String value : progression) {
            sb.append(value + " ");
        }

        //System.out.println(Arrays.toString(progression));
        System.out.print("Question: ");
        System.out.println(sb);
    }
}
