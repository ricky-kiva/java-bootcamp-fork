import java.util.HashMap;

public class KeyValues {
  
    public static void main(String[] args) {
        String[] vegetables = new String[] {"Cauliflower", "Spaghetti Squash", "Parsley"};
        double[] prices = new double[] {4.99, 1.99, 6.99};

        HashMap<String, Double> items = new HashMap<String, Double>(); // HashMap stores key-value
        for (int i = 0; i < vegetables.length; i++) {
            items.put(vegetables[i], prices[i]); // .put() is a method to put element to HashMap
        }

        items.put("Cauliflower", 3.99); // .put() will update key's value if there's already key named by it

        items.forEach((key, value) -> System.out.println(key + ": " + value)); // .get() is a method to call value by key

    }
  
}
