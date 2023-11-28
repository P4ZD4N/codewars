public class Kata {
    public static int dontGiveMeFive(int start, int end) {
        int counter = 0;

        for (int i = start; i <= end; i++) {
            String nextNumberToString = Integer.toString(i);
            if (!(nextNumberToString.contains("5"))) {
                counter++;
            }
        }

        return counter;
    }
}
