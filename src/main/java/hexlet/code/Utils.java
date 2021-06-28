package hexlet.code;

public class Utils {
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 100;
    public static int[] generateDigits() {
        int[] digits = new int[2];
        digits[0] = MIN_RANGE + (int) (Math.random() * MAX_RANGE);
        digits[1] = MIN_RANGE + (int) (Math.random() * MAX_RANGE);
        return digits;
    }
}
