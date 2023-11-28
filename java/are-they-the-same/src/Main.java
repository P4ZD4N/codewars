public class Main {
    public static void main(String[] args) {
        AreSame areSame = new AreSame();
        boolean test1 = areSame.comp(new int[]{121, 144, 19, 161, 19, 144, 19, 11},
                new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361});
        System.out.println(test1);
    }
}