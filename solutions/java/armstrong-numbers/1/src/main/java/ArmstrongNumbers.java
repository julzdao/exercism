import java.util.ArrayList;
import java.util.List;

class ArmstrongNumbers {

    /**
     * Splits the number to check into a list of digits for checking whether
     * a number is an Armstrong number.
     * <p>
     * <b>[INFO]</b> An Armstrong number is a number that is the sum of
     * its own digits raised to the power of the number of digits.
     * </p>
     *
     * @param numberToCheck the number to check
     * @return true if the number is an Armstrong Number, false otherwise.
     */
    boolean isArmstrongNumber(int numberToCheck) {
        List<Integer> digits = splitDigits(numberToCheck);
        int power = digits.size();

        int sum = 0;
        for(Integer digit : digits) {
            sum += (int) Math.pow(digit, power);
        }

        return sum == numberToCheck;
    }

    private List<Integer> splitDigits(int numberToCheck) {
        int numberToSplit = numberToCheck;

        List<Integer> digits = new ArrayList<>();

        while (numberToSplit > 0) {
            digits.add(numberToSplit % 10);
            numberToSplit = numberToSplit / 10;
        }

        return digits;
    }
}
