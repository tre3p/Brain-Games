package hexlet.code;

import java.util.Arrays;

public class Utils {
    private static final int MAX_DIGITS_COUNT = 6;
    public static int[] generateDigits(int minRange, int maxRange, int quantity) {
        int[] digits = new int[MAX_DIGITS_COUNT];
        int counter = 0;
        for (int i = 0; i != quantity; i++) {
            digits[i] = minRange + (int) (Math.random() * maxRange);
        }
        for (int j = 0; j < digits.length; j++) {
            if (digits[j] == 0) {
                counter++;
            }
        }
        digits = Arrays.copyOf(digits, digits.length - counter);
         return digits;
    }
}
