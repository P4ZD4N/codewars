import java.util.Arrays;

public class Kata {
    public double findUniq(double arr[]) {
        Arrays.sort(arr);
        int indexOfUniqueNumber;
        if (arr[arr.length - 1] == arr[arr.length - 2]) {
            indexOfUniqueNumber = 0;
        } else {
            indexOfUniqueNumber = arr.length - 1;
        }
        return arr[indexOfUniqueNumber];
    }
}

