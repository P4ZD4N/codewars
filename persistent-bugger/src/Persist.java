public class Persist {
    public static int persistence(long n) {
        long number;
        String numberToString = Long.toString(n);
        String[] digitsInNumberAsStrings = numberToString.split("");
        int counter = 0;

        while (numberToString.length() != 1) {
            int product = 1;

            for (int i = 0; i < digitsInNumberAsStrings.length; i++) {
                product *= Integer.parseInt(digitsInNumberAsStrings[i]);
            }

            number = product;
            numberToString = Long.toString(number);
            digitsInNumberAsStrings = numberToString.split("");

            counter++;
        }

        return counter;
    }
    public static void main(String[] args) {}
}