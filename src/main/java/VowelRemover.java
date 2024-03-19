public class VowelRemover {

    // Sprint3, Task 15

    public static String removeVowels(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            // Check if the character 'c' is not found in the list of vowels.
           // If the character is not a vowel, append it to the result StringBuilder.
            if (Const.VOWELS.indexOf(c) == -1) {
                result.append(c);
            }
        }
        return result.toString();
    }
}
