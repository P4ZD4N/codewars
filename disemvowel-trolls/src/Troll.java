import java.util.List;
import java.util.Locale;

public class Troll {
    public static String disemvowel(String str) {
        String[] vowels = new String[] {"a", "e", "i", "o", "u"};
        String newString = str;
        for (String vowel : vowels) {
            newString = newString.replace(vowel, "");
            newString = newString.replace(vowel.toUpperCase(), "");
        }
        return newString;
    }
    public static void main(String[] args) {}
}