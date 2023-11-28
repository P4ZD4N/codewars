import java.util.ArrayList;
import java.util.List;

public class Kata {
    public String expandedForm(int num) {
        int number = num;
        String numberToString = Integer.toString(number);
        String temp = numberToString.substring(0, 1) + "0".repeat(numberToString.length() - 1);
        if (number % Integer.parseInt(temp) == 0) {
            return temp;
        } else {
            List<String> numbers = new ArrayList<>();

            while (temp.length() != 1) {
                numbers.add(temp);
                number = number % Integer.parseInt(temp);
                numberToString = Integer.toString(number);
                temp = numberToString.substring(0, 1) + "0".repeat(numberToString.length() - 1);
            }

            if (!temp.equals("0")) {
                numbers.add(temp);
            }

            return String.join(" + ", numbers);
        }
    }
}
