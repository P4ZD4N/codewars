public class Main {
    public static void main(String[] args) {
        Kata kata = new Kata();

        String test1 = kata.high("man i need a taxi up to ubud");
        System.out.println(test1);
        String test2 = kata.high("what time are we climbing up to the volcano");
        System.out.println(test2);
        String test3 = kata.high("take me to semynak");
        System.out.println(test3);
        String test4 = kata.high("aaa b");
        System.out.println(test4);
        String test5 = kata.high("hello world");
        System.out.println(test5);
    }
}