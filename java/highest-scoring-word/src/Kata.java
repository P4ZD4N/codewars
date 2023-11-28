import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Kata {
    public String high(String s) {
        String[] wordsInString = s.split(" ");
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] alphabetLetters = alphabet.split("");
        List<String> alphabetLettersList = Arrays.asList(alphabetLetters);
        List<Integer> scoresList = new ArrayList<>();

        for (String word : wordsInString) {
            int wordScore = 0;
            String[] lettersInWord = word.split("");
            for (String letter : lettersInWord) {
                if (alphabetLettersList.contains(letter)) {
                    wordScore += (alphabetLettersList.indexOf(letter) + 1);
                }
            }
            scoresList.add(wordScore);
        }

        int highestScore = Collections.max(scoresList);
        int indexOfHighestScore = scoresList.indexOf(highestScore);
        String wordWithHighestScore = wordsInString[indexOfHighestScore];

        return wordWithHighestScore;
    }
}
