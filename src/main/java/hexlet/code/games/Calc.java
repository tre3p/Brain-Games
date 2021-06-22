package hexlet.code.games;

public class Calc {
    private static int correctResult = 0;
    private static final int RANDOM_RANGE = 1 + (int) (Math.random() * 100);
    private static final int RANDOMISE_QUESTION = 3;
    private static final int FIRST_EXPRESSION = 1;
    private static final int SECOND_EXPRESSION = 2;
    private static final int THIRD_EXPRESSION = 3;

    public static String printRules() {
        return "What is the result of the expression?";
    }

    public static String printQuestion() {
        int random = 1 + (int) (Math.random() * RANDOMISE_QUESTION);
        int[] digits = generateDigits();
        if (random == FIRST_EXPRESSION) {
            correctResult = digits[0] + digits[1];
            System.out.printf("Question: %d + %d\n", digits[0], digits[1]);
        } else if (random == SECOND_EXPRESSION) {
            correctResult = digits[0] * digits[1];
            System.out.printf("Question: %d * %d\n", digits[0], digits[1]);
        } else if (random == THIRD_EXPRESSION) {
            correctResult = digits[0] - digits[1];
            System.out.printf("Question: %d - %d\n", digits[0], digits[1]);
        }
        return String.valueOf(correctResult);
    }

    public static int[] generateDigits() {
        int[] digits = new int[2];
        digits[0] = (int) (Math.random() * RANDOM_RANGE);
        digits[1] = (int) (Math.random() * RANDOM_RANGE);
        return digits;
    }
}
