import java.util.*;

public class Kata {
    public static Map<Character, Integer> count(String str) {
        List<Character> allCharactersInString = new ArrayList<>();
        Map<Character, Integer> allOccurringCharactersInStringCounter = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            allCharactersInString.add(str.toLowerCase().charAt(i));
        }

        for (Character character : allCharactersInString) {
            if (!(allOccurringCharactersInStringCounter.containsKey(character))) {
                allOccurringCharactersInStringCounter.put(character, Collections.frequency(allCharactersInString, character));
            }
        }

        return allOccurringCharactersInStringCounter;
    }
}
