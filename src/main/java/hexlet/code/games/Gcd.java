package hexlet.code.games;

public class Gcd {
    private static final int RANDOM_RANGE = 1 + (int) (Math.random() * 100);
    public static void getRules() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public static String gcdGameQuestion() {
        int[] randomDigits = generateDigits();
        System.out.printf("Question: %d %d\n", randomDigits[0], randomDigits[1]);
        int correctResult = findGcd(randomDigits[0], randomDigits[1]);
        return String.valueOf(correctResult);
    }

    public static int findGcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static int[] generateDigits() {
        int[] digits = new int[2];
        digits[0] = (int) (Math.random() * RANDOM_RANGE);
        digits[1] = (int) (Math.random() * RANDOM_RANGE);
        return digits;
    }
}
