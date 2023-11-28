public class NumberFun {
    public static long findNextSquare(long number) {
        double squareRootOfNumberWithRest = Math.sqrt(number);
        long squareRootOfNumberWithoutRest = (long) squareRootOfNumberWithRest;
        boolean isTheNumberPerfectSquare = squareRootOfNumberWithRest == squareRootOfNumberWithoutRest;
        if (isTheNumberPerfectSquare) {
            return (long) Math.pow(squareRootOfNumberWithRest + 1, 2);
        } else {
            return -1;
        }
    }
}
