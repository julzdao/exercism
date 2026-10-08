class Leap {

    /**
     * Gregorian rule: every 4th year is a leap year, except for centuries,
     * unless the century is divisible by 400. Checked the most specific first.
     */
    boolean isLeapYear(int year) {
        if (isDivisibleBy(year, 400)) {
            return true;
        }
        if (isDivisibleBy(year, 100)) {
            return false;
        }
        return isDivisibleBy(year, 4);
    }

    private boolean isDivisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }

}
