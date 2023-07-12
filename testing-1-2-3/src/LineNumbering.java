import java.util.*;

public class LineNumbering {
    public static List<String> number(List<String> lines) {
        for(String line : lines) {
            int indexOfLine = lines.indexOf(line);
            lines.set(
                    indexOfLine,
                    String.format("%d: %s", indexOfLine + 1, lines.get(indexOfLine))
            );
        }
        return lines;
    }
}
