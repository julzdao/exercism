import java.util.ArrayList;
import java.util.List;

class ArmstrongNumbers {

    private static final int BASE = 10;

    /**
     * Returns whether a {@code numberToCheck} equals the sum of its digits,
     * each raised to the power of the number of digits
     * (e.g. 153 = 1^3 + 5^3 + 3^3).
     * Negative numbers are never Armstrong numbers.
     */
    boolean isArmstrongNumber(int number) {
        if(number < 0) return false;

        int digitCount = countDigits(number);

        long sum = 0;
        for (int remaining = number; remaining > 0; remaining /= BASE) {
            sum += power(remaining % BASE, digitCount);
        }
        return sum == number;
    }

    private int countDigits(int number) {
        int count = 1;
        while (number >= BASE) {
            number /= BASE;
            count++;
        }
        return count;
    }

    private long power(int base, int exponent) {
        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
