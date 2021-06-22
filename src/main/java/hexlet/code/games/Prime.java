package hexlet.code.games;

public class Prime {
    private static final int RANDOM_RANGE = 100;
    public static String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static String checkIsPrime() {
        boolean isPrime = true;
        int num = generateDigits();
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        String correctResult = isPrime ? "yes" : "no";
        System.out.printf("Question: %d\n", num);
        return correctResult;
    }

    public static int generateDigits() {
        int randomDigit = (int) (Math.random() * RANDOM_RANGE);
        return randomDigit;
    }
}
