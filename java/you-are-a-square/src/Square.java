public class Square {
    public static boolean isSquare(int n) {
        double squareRootOfN = Math.sqrt(n);
        int squareRootOfNToInt = (int) squareRootOfN;
        if (squareRootOfNToInt == squareRootOfN) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {}
}