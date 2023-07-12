import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(LineNumbering.number(Arrays.asList(new String[] {"a", "b", "c"})));
        System.out.println(LineNumbering.number(Arrays.asList(new String[] {"", "", "", "", ""})));
        System.out.println(LineNumbering.number(Arrays.asList(new String[] {"1", "2", "3", "4", "5", "6"})));
    }
}