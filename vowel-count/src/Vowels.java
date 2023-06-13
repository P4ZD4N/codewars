import java.util.Arrays;
import java.util.List;

public class Vowels {
    public static int getCount(String str) {
        String[] vowelsArray = {"a", "e", "i", "o", "u"};
        List<String> vowelsList = Arrays.asList(vowelsArray);
        String[] lettersInStr = str.split("");
        int vowelCounter = 0;
        for (String letter : lettersInStr) {
            if (vowelsList.contains(letter)) {
                vowelCounter++;
            }
        }
        return vowelCounter;
    }
    public static void main(String[] args) {}
}