public class Main {
    public static void main(String[] args) {
        Car car = new Car("Honda", "Red");
        Car car2 = car;
        Car car3 = new Car(car);

        // System.out.println(car.equals(car2)); // will return true because it share the same reference
        // System.out.println(car.equals(car3)); // will return false

        // after modifying .equals()
        System.out.println(car.equals(car2)); // will return true, because it has the same fields, and the .equals() method has been overridden
        System.out.println(car.equals(car3)); // will return true, because it has the same fields, and the .equals() method has been overridden
    }

}
