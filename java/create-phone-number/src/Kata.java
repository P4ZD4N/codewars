public class Kata {
    public String createPhoneNumber(int[] numbers) {
        StringBuilder firstPart = new StringBuilder();
        StringBuilder secondPart = new StringBuilder();
        StringBuilder thirdPart = new StringBuilder();

        for (int i = 0; i <= 9; i++) {
            if (i >= 0 && 2 >= i) {
                firstPart.append(numbers[i]);
            } else if (i >= 3 && 5 >= i) {
                secondPart.append(numbers[i]);
            } else {
                thirdPart.append(numbers[i]);
            }
        }
        return "(" + firstPart.toString() + ") " + secondPart.toString() + "-" + thirdPart.toString();
    }
}
