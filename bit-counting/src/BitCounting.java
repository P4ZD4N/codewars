public class BitCounting {
    public static int countBits(int n) {
        String numberAsBinaryString = Integer.toBinaryString(n);
        String[] digitsInNumber = numberAsBinaryString.split("");
        int counter = 0;

        for (String digit : digitsInNumber) {
            if (digit.equals("1")) {
                counter++;
            }
        }

        return counter;
    }
    public static void main(String[] args) {
        System.out.println(countBits(1234));
    }
}