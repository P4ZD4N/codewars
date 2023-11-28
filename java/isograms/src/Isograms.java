import java.util.*;

public class Isograms {
    public static boolean isIsogram(String str ) {
        String[] lettersInStringArray = str.toLowerCase().split("");
        List<String> lettersInStringList = Arrays.asList(lettersInStringArray);
        Map<String, Integer> quantityOfEachLetterInString = new HashMap<>();

        for (String letter : lettersInStringArray) {
            quantityOfEachLetterInString
                    .put(letter, Collections.frequency(lettersInStringList, letter));
        }

        boolean isIsogram = true;

        for (int value : quantityOfEachLetterInString.values()) {
            if (value != 1) {
                isIsogram = false;
            }
        }

        return isIsogram;
    }
    public static void main(String[] args) {}
}