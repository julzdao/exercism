import java.util.Objects;

class ReverseString {

    /**
     *
     * Returns the characters of {@code inputString} in reverse order.
     * <p>
     *      Instead of using a loop or creating multiple char arrays,
     *      it uses a {@code StringBuilder} to reverse the string, which
     *      handles more cases such as surrogate pairs (i.e Emojis).
     * </p>
     *
     * @param inputString the string to reverse; must not be {@code null}
     * @return a new {@code String} containing the characters of {@code inputString} in reverse order.
     * @throws NullPointerException if {@code inputString} is {@code null}
     */
    String reverse(String inputString) {
        Objects.requireNonNull(inputString, "input must not be null");
        return new StringBuilder(inputString).reverse().toString();
    }
}
