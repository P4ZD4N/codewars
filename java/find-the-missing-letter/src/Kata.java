public class Kata {
    public static char findMissingLetter(char[] array) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        int startingIndex = 0;

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == Character.toLowerCase(array[0])) {
                startingIndex = i;
                break;
            }
        }

        char missingLetter = '\0';

        for (int i = 0; i < array.length; i++) {
            if (Character.toLowerCase(array[i]) != alphabet[startingIndex + i]) {
                missingLetter = alphabet[startingIndex + i];
                break;
            }
        }

        if (Character.toLowerCase(array[0]) == array[0]) {
            return missingLetter;
        } else {
            return Character.toUpperCase(missingLetter);
        }

    }
}
