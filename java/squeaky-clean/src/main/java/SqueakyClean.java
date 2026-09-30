import java.lang.runtime.SwitchBootstraps;

class SqueakyClean {

    public static final String UNDERSCORE = "_";
    public static final String SPACE = " ";
    public static final String KEBAB = "-";

    static String clean(String identifier) {

        String characterFilter = "[^\\p{L}\\p{M}\\p{N}\\p{P}\\p{Z}\\p{Cf}\\p{Cs}\\s]";

        String sanitized = identifier;
        if(sanitized.contains(KEBAB)) {
            int indexOfKebab = sanitized.indexOf("-");
            String nextChar = sanitized[indexOfKebab + 1];

            sanitized = sanitized
                    .replace(KEBAB, "")
                    .replace(nextChar, "");
            System.out.println("NEXT CHAR IS " + nextChar);
        }

        return identifier
                .replace(SPACE, UNDERSCORE)
                .replaceAll("\\p{C}", "CTRL")
                .replaceAll(characterFilter, "")
                ;
    }

    private static boolean isThreeLetter(String identifier) {
        return identifier.length() == 3;
    }

    private static boolean isSingleLetter(String identifier) {
        return identifier.length() == 1;
    }
}
