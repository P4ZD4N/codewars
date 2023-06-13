import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Solution {
    public static String removeDuplicateWords(String s){
        String[] splittedString = s.split(" ");
        List<String> uniqueWordsFromString = new ArrayList<>();
        for (String word : splittedString) {
            if (!uniqueWordsFromString.contains(word)) {
                uniqueWordsFromString.add(word);
            }
        }
        StringJoiner uniqueWordsString = new StringJoiner(" ");
        for (String uniqueWord : uniqueWordsFromString) {
            uniqueWordsString.add(uniqueWord);
        }
        return uniqueWordsString.toString();
    }
    public static void main(String[] args) {}
}