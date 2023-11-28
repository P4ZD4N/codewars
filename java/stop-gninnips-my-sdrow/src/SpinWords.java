import java.util.StringJoiner;

public class SpinWords {
    public static String spinWords(String sentence) {
        String[] wordsInSentence = sentence.split(" ");
        StringJoiner sentenceWithReversedWords = new StringJoiner(" ");

        for (String word : wordsInSentence) {
            StringBuilder wordReverser = new StringBuilder();

            if (word.length() >= 5) {
                wordReverser.append(word);
                wordReverser.reverse();
                sentenceWithReversedWords.add(wordReverser.toString());
            } else {
                sentenceWithReversedWords.add(word);
            }
        }

        return sentenceWithReversedWords.toString();
    }
    public static void main(String[] args) {
        System.out.println(spinWords("Hey fellow warriors"));
    }
}