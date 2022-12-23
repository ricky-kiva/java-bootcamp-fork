import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        
        Car nissan = new Car("Nissan", 2016);
        System.out.println("Nissan: " + nissan.hashCode());

        Car honda = new Car("Honda", 2016);
        System.out.println("Honda: " + honda.hashCode());

        Car nissan2 = new Car(nissan);
        System.out.println("Nissan2: " + nissan2.hashCode());

        Car honda2 = new Car(honda);
        System.out.println("Honda2: " + honda2.hashCode()); // calling each hashcode

        HashMap<Car, Double> carPrice = new HashMap<Car, Double>();
        carPrice.put(nissan, 8000.0);
        carPrice.put(honda, 4500.0);

        System.out.println(nissan.equals(nissan2)); // the .equals() has already overridden
        // getting element that is not IN the HashMap, BUT are TRUE in .equals()
        System.out.println(carPrice.get(nissan2)); // only works after the .hashCode() overridden with return Objects.hash(value)

      }
}
