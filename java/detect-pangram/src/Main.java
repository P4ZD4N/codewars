public class Main {
    public static void main(String[] args) {
        PangramChecker pangramChecker = new PangramChecker();

        boolean test1 = pangramChecker.check("The quick brown fox jumps over the lazy dog.");
        System.out.println(test1);
        boolean test2 = pangramChecker.check("You shall not pass!");
        System.out.println(test2);
        boolean test3 = pangramChecker.check("Waltz, bad nymph, for quick jigs vex.");
        System.out.println(test3);
        boolean test4 = pangramChecker.check("Pack my box with five dozen liquor jugs.");
        System.out.println(test4);
        boolean test5 = pangramChecker.check("Hello world!");
        System.out.println(test5);
    }
}