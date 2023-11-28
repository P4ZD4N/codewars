public class SquareDigit {
    public static int squareDigits(int n) {
        String numberToString = Integer.toString(n);
        String[] digitsInNumber = numberToString.split("");
        StringBuilder digitsInNumberSquaredStringBuilder = new StringBuilder();

        for (String digitInNumber : digitsInNumber) {
            int digitInNumberToInteger = Integer.parseInt(digitInNumber);
            int digitInNumberToIntegerSquared = (int) Math.pow(digitInNumberToInteger, 2);
            digitsInNumberSquaredStringBuilder.append(digitInNumberToIntegerSquared);
        }

        int stringBuilderToInt = Integer.parseInt(digitsInNumberSquaredStringBuilder.toString());
        return stringBuilderToInt;
    }
    public static void main(String[] args) {}
}