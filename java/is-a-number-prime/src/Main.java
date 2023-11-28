public class Main {
    public static void main(String[] args) {
        Prime prime = new Prime();

        boolean test1 = prime.isPrime(1);
        System.out.println(test1);
        boolean test2 = prime.isPrime(2);
        System.out.println(test2);
        boolean test3 = prime.isPrime(-1);
        System.out.println(test3);
    }
}