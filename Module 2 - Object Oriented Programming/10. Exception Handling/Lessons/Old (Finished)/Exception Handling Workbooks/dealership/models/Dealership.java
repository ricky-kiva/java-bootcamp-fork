package models;

public class Dealership {
    private Car[] cars;

    public Dealership(Car[] cars) {
        this.cars = new Car[cars.length];
        for (int i = 0; i < cars.length; i++) {
            this.cars[i] = new Car(cars[i]);
        }
    }

    public void setCar(Car car, int index) {
        this.cars[index] = new Car(car);
    }

    public Car getCar(int index) {
        return new Car(this.cars[index]);
    }

    
    public void sell(int index) {  
        int carMiss = 0;
        for (int i = 0; i < this.cars.length; i++) {
            if (this.cars[i] == null) {
                carMiss += 1;
            }
            if (carMiss == (this.cars.length)) {
                throw new IllegalStateException("The dealership garage need to be filled with car!");
            }
        }
        this.cars[index].drive();
        this.cars[index] = null;
    }

    /**
     * Name: isEmpty
     *
     * @return (boolean)
     * Inside the function:
     *   • returns true if there are no more cars.
     * 
     */

     
    public String toString() {
        String temp = "\n\n";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "\tParking Spot: " + i + "\n";
            if (this.cars[i] == null) {
                temp += "\tEmpty\n\n";
            } else {
                temp += this.cars[i].toString() + "\n";
            }
        }
        return temp;
    }


}
