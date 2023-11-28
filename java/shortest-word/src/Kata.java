import java.util.*;

public class Kata {
    public static int findShort(String s) {
        String[] splittedString = s.split(" ");
        List<Integer> wordsLengthsInSplittedString = new ArrayList<>();
        for (String wordInSplittedString : splittedString) {
            wordsLengthsInSplittedString.add(wordInSplittedString.length());
        }
        return Collections.min(wordsLengthsInSplittedString);
    }
    public static void main(String[] args) {}
}