class Darts {

    private static final int OUTER_RADIUS = 10;
    private static final int MIDDLE_RADIUS = 5;
    private static final int INNER_RADIUS = 1;

    private static final int SCORE_INNER = 10;
    private static final int SCORE_MIDDLE = 5;
    private static final int SCORE_OUTER = 1;
    private static final int NO_SCORE = 0;

    int score(double xOfDart, double yOfDart) {
        double landingDistance = Math.hypot(xOfDart, yOfDart);

        if(isWithin(landingDistance, INNER_RADIUS)) return SCORE_INNER;
        if(isWithin(landingDistance, MIDDLE_RADIUS)) return SCORE_MIDDLE;
        if(isWithin(landingDistance, OUTER_RADIUS)) return SCORE_OUTER;

        return NO_SCORE;
    }

    private boolean isWithin(double distance, int radius) {
        return distance <= radius;
    }
}
