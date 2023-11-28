public class Kata {
    public static boolean twoArePositive(int a, int b, int c) {
        int[] numbers = new int[] {a, b, c};
        int positiveNumbersCounter = 0;

        for (int number : numbers) {
            if (number > 0) {
                positiveNumbersCounter++;
            }
        }

        return positiveNumbersCounter == 2;
    }
}
