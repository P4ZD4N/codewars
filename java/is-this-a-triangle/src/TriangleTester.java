import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TriangleTester {
    public static boolean isTriangle(int a, int b, int c) {
        Integer[] sideLengths = {a, b, c};
        List<Integer> sideLengthsToList = Arrays.asList(sideLengths);
        Collections.sort(sideLengthsToList);
        int sumOfTwoShortestSides = sideLengthsToList.get(0) + sideLengthsToList.get(1);
        int longestSide = sideLengthsToList.get(2);
        if (sumOfTwoShortestSides > longestSide) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {}
}