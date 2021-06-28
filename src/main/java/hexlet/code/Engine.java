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

    public static void gameEngine(String[][] qa, String rules) {
        greeting();
        int i = 0;
        if (winningsCounter == 0) {
            System.out.println(rules);
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
}
