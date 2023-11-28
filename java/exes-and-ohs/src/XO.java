public class XO {
    public static boolean getXO (String str) {
        String[] lettersInString = str.toLowerCase().split("");
        int xCounter = 0;
        int oCounter = 0;

        for (String letter : lettersInString) {
            if (letter.equals("x")) {
                xCounter++;
            } else if (letter.equals("o")) {
                oCounter++;
            }
        }

        return xCounter == oCounter;
    }
}
