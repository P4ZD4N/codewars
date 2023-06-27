import java.util.*;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        String[] allCharactersInText = text.toLowerCase().split("");
        List<String> allCharactersInTextList = Arrays.asList(allCharactersInText);
        Set<Object> duplicatesCounter = new HashSet<>();

        for (Object character : allCharactersInTextList) {
            int frequencyOfCharacterInList = Collections.frequency(
                    allCharactersInTextList,
                    character
            );

            if (frequencyOfCharacterInList > 1) {
                duplicatesCounter.add(character);
            }
        }

        return duplicatesCounter.size();
    }
    public static void main(String[] args) {}
}