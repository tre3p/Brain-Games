package hexlet.code.games;

public class Calc {
    private static int correctResult = 0;

    public static void calcGameRules() {
        System.out.println("What is the result of the expression?");
    }

    public static String calcGame(int[] digits, int winningsCounter) {
        if (winningsCounter == 0) {
            correctResult = digits[0] + digits[1];
            System.out.println("Question: " + digits[0] + " + " + digits[1]);
            return String.valueOf(correctResult);
        } else if (winningsCounter == 1) {
            correctResult = digits[0] * digits[1];
            System.out.println("Question: " + digits[0] + " * " + digits[1]);
            return String.valueOf(correctResult);
        } else if (winningsCounter == 2) {
            correctResult = digits[0] - digits[1];
            System.out.println("Question: " + digits[0] + " - " + digits[1]);
            return String.valueOf(correctResult);
        }
        return String.valueOf(correctResult);
    }
}
