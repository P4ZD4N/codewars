import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kata {
    public static String highAndLow(String numbers) {
        String[] numbersArray = numbers.split(" ");
        List<Integer> numbersList = new ArrayList<>();
        for (String number : numbersArray) {
            numbersList.add(Integer.parseInt(number));
        }
        String highestNumber = Integer.toString(Collections.max(numbersList));
        String lowestNumber = Integer.toString(Collections.min(numbersList));
        return String.join(" ", highestNumber, lowestNumber);
    }
    public static void main(String[] args) {}
}