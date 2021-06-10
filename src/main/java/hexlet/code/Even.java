package hexlet.code;
import java.util.Scanner;


public class Even {
    private static int winningsCounter = 0;

    public static void greetingsEvenGame() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        evenGame();
    }

    public static void evenGame() {
        Scanner isEven = new Scanner(System.in);
        final int randomRange = 100;
        int randomDigit = (int) (Math.random() * randomRange);
        final int winsCount = 3;

        if (winningsCounter == winsCount) {
            System.out.println("Congratulations, " + Cli.getName());
            System.exit(0);
        }

        System.out.println("Question:" + randomDigit);
        System.out.println("Your answer:");
        String result = isEven.nextLine();

        if (result.equals("yes") && randomDigit % 2 == 0) {
            winningsCounter++;
            answerCorrect();
        } else if (result.equals("yes") && randomDigit % 2 != 0) {
            answerIncorrect();
        } else if (result.equals("no") && randomDigit % 2 == 0) {
            answerIncorrect();
        } else if (result.equals("no") && randomDigit % 2 != 0) {
            winningsCounter++;
            answerCorrect();
        }
    }

    public static void answerIncorrect() {
        System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
        System.out.println("Let's try again, " + Cli.getName());
    }

    public static void answerCorrect() {
        System.out.println("Correct!");
        evenGame();
    }
}
