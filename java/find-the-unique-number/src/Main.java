public class Main {
    public static void main(String[] args) {
        Kata kata = new Kata();

        double test1 = kata.findUniq(new double[]{ 1, 0, 0 });
        System.out.println(test1);
        double test2 = kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 });
        System.out.println(test2);
        double test3 = kata.findUniq(new double[]{ 3, 3, 3, 3, 2 });
        System.out.println(test3);
    }
}