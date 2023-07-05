public class Main {
    public static void main(String[] args) {
        PigLatin pigLatin = new PigLatin();

        String test1 = pigLatin.pigIt("Pig latin is cool");
        System.out.println(test1);
        String test2 = pigLatin.pigIt("Hello world !");
        System.out.println(test2);
        String test3 = pigLatin.pigIt("This is my string ");
        System.out.println(test3);
    }
}