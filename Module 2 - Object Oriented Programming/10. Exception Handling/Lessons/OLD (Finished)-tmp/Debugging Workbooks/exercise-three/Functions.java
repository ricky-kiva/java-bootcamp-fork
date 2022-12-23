public class Functions {
    public static void main(String[] args) {
        int random = random(15);    
        System.out.println("Number: " + random);
        System.out.println("Prime or Composite: " + isPrime(random));
    }

    public static int random(int range) {
        double random = Math.random() * range + 1;
        return (int) random;
    }
    public static String isPrime(int random) {
        String isPrime = "";
        if (random == 1 || random == 2) {
            return "PRIME";
        }
        for (int i = 1; i < random; i++) {
            isPrime = (random % i == 0) ? "COMPOSITE" : "PRIME";
            if (isPrime.equals("COMPOSITE") && i != 1) {
                return isPrime;
            }
        }
        return isPrime;
    }
}
