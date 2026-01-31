public class Lasagna {

    private final static int EXPECTED_MINUTES_IN_OVEN = 40;

    public int expectedMinutesInOven() {
        return EXPECTED_MINUTES_IN_OVEN;
    }

    public int remainingMinutesInOven(int actualMinutes) {
        return Math.max(EXPECTED_MINUTES_IN_OVEN - actualMinutes, 0);
    }

    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * 2;
    }

    public int totalTimeInMinutes(int numberOfLayers, int minutesInOvenAlready){
        return preparationTimeInMinutes(numberOfLayers) + minutesInOvenAlready;
    }
}
