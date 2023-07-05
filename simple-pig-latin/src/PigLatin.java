import java.util.ArrayList;
import java.util.List;

public class PigLatin {
    public String pigIt(String str) {
        String[] wordsInString = str.split(" ");
        List<String> newWords = new ArrayList<>();

        for (String word : wordsInString) {
            if (!(word.equals("!") || word.equals("?") || word.equals(".") || word.equals(","))) {
                newWords.add(word.substring(1) + word.charAt(0) + "ay");
            } else {
                newWords.add(word);
            }
        }

        return String.join(" ", newWords);
    }
}
