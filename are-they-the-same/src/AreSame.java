import java.util.Arrays;

public class AreSame {
    public boolean comp(int[]a, int[] b) {
        try {
            for (int i = 0; i < a.length; i++) {
                a[i] = a[i] * a[i];
            }

            Arrays.sort(a);
            Arrays.sort(b);

            return Arrays.equals(a, b);
        } catch (NullPointerException e) {
            return false;
        }
    }
}
