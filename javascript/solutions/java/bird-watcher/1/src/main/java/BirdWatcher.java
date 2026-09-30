import java.util.Arrays;

class BirdWatcher {

    private static final int BUSY_DAY_COUNT = 5;

    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay.clone();
    }

    public int getToday() {
        int todayIndex = getLastIndex(this.birdsPerDay);
        return this.birdsPerDay[todayIndex];
    }

    private int getLastIndex(int[] array) {
        return Math.max(array.length - 1, 0);
    }

    public void incrementTodaysCount() {
        int todayCount = getToday();
        this.birdsPerDay[getLastIndex(this.birdsPerDay)] = ++todayCount;
    }

    public boolean hasDayWithoutBirds() {
        for (int dayCount : this.birdsPerDay) {
            if (dayCount == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int[] firstDaysCopy = Arrays.copyOf(this.birdsPerDay, numberOfDays);
        return Arrays.stream(firstDaysCopy).sum();
    }

    public int getBusyDays() {
        return Arrays.stream(this.birdsPerDay)
                .filter(dayCount -> dayCount >= BUSY_DAY_COUNT)
                .toArray()
                .length;
    }
}
