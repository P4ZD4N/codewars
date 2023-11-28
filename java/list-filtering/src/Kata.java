import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static List<Object> filterList(final List<Object> list) {
        List<Object> tempList = List.of(1);
        List<Object> filteredList = new ArrayList<>();
        for (Object element : list) {
            if (element.getClass().equals(tempList.get(0).getClass()))
                filteredList.add(element);
        }
        return filteredList;
    }
    public static void main(String[] args) {}
}