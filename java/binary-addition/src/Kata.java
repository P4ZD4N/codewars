public class Kata {
    public static String binaryAddition(int a, int b) {
        int sum = a + b;
        String sumToBinary = Integer.toBinaryString(sum);
        return sumToBinary;
    }
    public static void main(String[] args) {}
}