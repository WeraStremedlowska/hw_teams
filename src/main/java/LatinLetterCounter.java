import java.util.HashSet;
import java.util.Set;

/**
 * Sprint3, Task 23
 * Написать метод, который принимает на вход текст
 * и возвращает количество латинских символов в тексте
 */
public class LatinLetterCounter {

    public static final Set<Character> LATIN_LETTERS = new HashSet<>(Set.of(
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));




    public static String countLatinLetters(String text) {


        int count = 0;

        for (char letter : text.toCharArray()) {
            // Проверка, является ли символ буквой и принадлежит ли он множеству латинских букв
            if (Character.isLetter(letter) && LATIN_LETTERS.contains(Character.toUpperCase(letter))
                    || LATIN_LETTERS.contains(Character.toLowerCase(letter))) {
                count++;
            }
        }

        return String.valueOf(count);


    }

}
