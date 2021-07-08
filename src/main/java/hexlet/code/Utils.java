package hexlet.code;

public class Utils {
    public static int[] generateDigits(int minRange, int maxRange, int quantity) {
        int[] digits = new int[quantity + 1];
        for (int i = 0; i != quantity; i++) {
            digits[i] = minRange + (int) (Math.random() * maxRange);
        }
        return digits;
    }
}
