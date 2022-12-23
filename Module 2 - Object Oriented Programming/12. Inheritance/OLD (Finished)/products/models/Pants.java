package models;

import java.util.Objects;

// extends take Product as parents // implements will implements interface to the class
public class Pants extends Product implements Discountables { 
    private int waist; // updates the parents constructor

    public Pants(int waist, double price, String color, String brand) {
        super(price, color, brand);
        this.waist = waist;
    }

    public Pants(Pants source) {
        super(source); // super for copy constructor
        this.waist = source.waist;
    }


    @Override
    public String toString() {
        return "{" +
            " waist='" + getWaist() + "'" +
            " price='" + super.getPrice() + "'" +
            ", color='" + super.getColor() + "'" +
            ", brand='" + super.getBrand() + "'" +
            "}";
    }


    // CHILD CLASS WILL INHERIT METHODS FROM PARENT CLASS

    public int getWaist() {
        return this.waist;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pants)) {
            return false;
        }
        Pants pants = (Pants) o;
        return waist == pants.waist
            && super.getPrice() == pants.getPrice() // super.method() could ONLY call methods from parents. If want to acces method from parent AND this, use this.method()
            && super.getColor().equals(pants.getColor())
            && super.getBrand().equals(pants.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(waist, super.getPrice(), super.getColor(), super.getBrand()); // Objects.hash() could accept multiple value as parameter, while Objects.hashCode() CANNOT
    }

    @Override
    public void fold() {
        System.out.println("Fold it half");
        System.out.println("Fold it down-up until it be a square");
    }

    @Override
    public void discount() {
        super.setPrice(super.getPrice() * 0.5);
    }

}