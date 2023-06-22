public class Kata {
    public static String getMiddle(String word) {
        int wordLength = word.length();
        int halfOfWordLength = wordLength / 2;
        String middleCharacter;
        if (wordLength % 2 == 0) {
            middleCharacter = word.substring(halfOfWordLength - 1, halfOfWordLength + 1);
        } else {
            middleCharacter = word.substring(halfOfWordLength, halfOfWordLength + 1);
        }
        return middleCharacter;
    }
    public static void main(String[] args) {}
}