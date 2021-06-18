package hexlet.code.games;

public class Gcd {
    private static int correctResult;
    public static void gcdGameRules() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public static String gcdGameQuestion(int[] randomDigits) {
        System.out.printf("Question: %d %d\n", randomDigits[0], randomDigits[1]);
        correctResult = findGcd(randomDigits[0], randomDigits[1]);
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
}
