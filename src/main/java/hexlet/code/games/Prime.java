package hexlet.code.games;

public class Prime {
    private static boolean isPrime = true;
    public static void primeGameRules() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    public static boolean checkIsPrime(int[] digits) {
        isPrime = true;
        int num = digits[0];
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.printf("Question: %d\n", num);
        return isPrime;
    }
}
