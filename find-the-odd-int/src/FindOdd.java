import java.util.*;

public class FindOdd {
    public static int findIt(int[] a) {
        Integer[] intArrayToIntegerArray = Arrays.stream(a)
                                            .boxed()
                                            .toArray(Integer[]::new);
        List<Integer> arrayAsList = Arrays.asList(intArrayToIntegerArray);
        Set<Integer> allNumbersExistingInList = new HashSet<>(arrayAsList);
        int numberThatAppearsOddNumberOfTimes = 0;

        for (int number : allNumbersExistingInList) {
            int numberFrequencyInList = Collections.frequency(arrayAsList, number);
            if (!(numberFrequencyInList % 2 == 0)) {
                numberThatAppearsOddNumberOfTimes = number;
            }
        }

        return numberThatAppearsOddNumberOfTimes;
    }
    public static void main(String[] args) {}
}