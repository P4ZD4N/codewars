import java.util.*;

public class JadenCase {
    public static String toJadenCase(String phrase) {
        try {
            if (phrase.isEmpty()) {
                return null;
            } else {
                String[] splittedPhrase = phrase.split(" ");
                List<String> capitalizedWordsInSplittedPhrase = new ArrayList<>();
                StringJoiner capitalizedWordsInSplittedPhraseToString = new StringJoiner(" ");
                for (String wordInSplittedPhrase : splittedPhrase) {
                    capitalizedWordsInSplittedPhrase.add(
                            wordInSplittedPhrase.substring(0, 1).toUpperCase()
                                    + wordInSplittedPhrase.substring(1)
                    );
                }
                for (String capitalizedWord : capitalizedWordsInSplittedPhrase) {
                    capitalizedWordsInSplittedPhraseToString.add(capitalizedWord);
                }
                return capitalizedWordsInSplittedPhraseToString.toString();
            }
        } catch (NullPointerException nullException) {
            return null;
        }
    }
    public static void main(String[] args) {}
}