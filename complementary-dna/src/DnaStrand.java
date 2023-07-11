import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DnaStrand {
    public static String makeComplement(String dna) {
        List<String> symbolsInDNA = Arrays.asList(dna.toUpperCase().split(""));
        List<String> symbolsInComplementaryDNA = new ArrayList<>();

        for (String symbol : symbolsInDNA) {
            if (symbol.equals("A")) {
                symbolsInComplementaryDNA.add("T");
            } else if (symbol.equals("T")) {
                symbolsInComplementaryDNA.add("A");
            } else if (symbol.equals("C")) {
                symbolsInComplementaryDNA.add("G");
            } else if (symbol.equals("G")) {
                symbolsInComplementaryDNA.add("C");
            } else {
                return "Found invalid symbol in DNA";
            }
        }

        return String.join("", symbolsInComplementaryDNA);
    }
}
