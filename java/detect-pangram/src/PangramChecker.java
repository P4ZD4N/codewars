import java.util.ArrayList;
import java.util.List;

public class PangramChecker {
    public boolean check(String sentence) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] lettersInAlphabets = alphabet.toCharArray();
        List<String> lettersInSentence = new ArrayList<>();

        for (char letter : lettersInAlphabets) {
            if (sentence.toLowerCase().contains(Character.toString(letter))) {
                lettersInSentence.add(Character.toString(letter));
            }
        }

        String lettersInSentenceAsString = String.join("", lettersInSentence);

        return lettersInSentenceAsString.equals(alphabet);
    }
}
