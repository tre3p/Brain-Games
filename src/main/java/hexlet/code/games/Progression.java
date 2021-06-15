package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Progression {
    private static int winningsCounter = 0;
    private static String userResult;
    private static String correctResult;
    private static final int LENGTH_OF_PROGRESSION = 10;
    private static final int COMPLEXITY = 30;
    public static void greetingProgression() {
        Cli.greeting();
        System.out.println("What number is missing in the progression?");
        progressionGame();
    }

    public static void progressionGame() {
        int complexityOfProgression = (int) (Math.random() * COMPLEXITY);
        int differenceOfProgression = (int) (Math.random() * complexityOfProgression);
        printProgression(complexityOfProgression, differenceOfProgression, LENGTH_OF_PROGRESSION);
        userResult = Engine.getAnswerForStrings();
        boolean isAnswerCorrect = Engine.isAnswerCorrect(userResult, correctResult, winningsCounter);

        if (isAnswerCorrect) {
            winningsCounter++;
            progressionGame();
        } else {
            Engine.incorrectAnswer(userResult, correctResult);
        }
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

        System.out.print("Question: ");
        System.out.println(sb);
    }
}
