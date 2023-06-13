public class Main {
    public static String maskify(String str) {
        int strLen = str.length();
        if (strLen > 4) {
            return "#".repeat(strLen - 4) + str.substring(strLen - 4, strLen);
        } else {
            return str;
        }
    }
    public static void main(String[] args) {}
}