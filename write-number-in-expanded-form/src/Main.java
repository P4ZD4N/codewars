public class Main {
    public static void main(String[] args) {
        Kata kata = new Kata();

        String test1  = kata.expandedForm(12);
        System.out.println(test1);
        String test2 = kata.expandedForm(42);
        System.out.println(test2);
        String test3 = kata.expandedForm(70304);
        System.out.println(test3);
    }
}