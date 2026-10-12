class ReverseString {

    /**
     * Reverses a string using a StringBuilder for efficiency.
     * Instead of using a loop or creating multiple char arrays,
     * it uses a StringBuilder to reverse the string, which is more efficient due to its mutable capability.
     *
     * @param inputString the string to reverse
     * @return the reversed string
     */
    String reverse(String inputString) {
        StringBuilder messageToReverse = new StringBuilder(inputString);
        return messageToReverse.reverse().toString();
    }
  
}
