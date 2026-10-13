public class Twofer {

    private static final String DEFAULT_NAME = "you";

    /**
     * Returns "One for X, one for me.", where X is {@code name},
     * or {@link Twofer#DEFAULT_NAME} if {@code name} is null or blank.
     *
     * @param name the recipient's name; may be null.
     * @return the two-fer saying.
     */
    public String twofer(String name) {
        String recipient = name == null || name.isEmpty() ? DEFAULT_NAME : name.strip();

        return "One for " + recipient + ", one for me.";
    }
}
