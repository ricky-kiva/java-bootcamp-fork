package models;

import java.util.Objects;

public class Shirt extends Product {
    public enum Size { // enum is a set of constant, that's functioning like a unit
        SMALL, MEDIUM, LARGE // use CAPITAL to write enum
    }
    private Size size; // extends take Product as parents

    public Shirt(Size size, double price, String color, String brand) {
        super(price, color, brand); // updates the parents constructor
        this.size = size;
    }

    public Shirt(Shirt source) {
        super(source); // super for copy constructor
        this.size = source.size;
    }

    @Override
    public String toString() {
        return "{" +
            " size='" + getSize() + "'" +
            " price='" + super.getPrice() + "'" +
            ", color='" + super.getColor() + "'" +
            ", brand='" + super.getBrand() + "'" +
            "}";
    }


    // CHILD CLASS WILL INHERIT METHODS FROM PARENT CLASS

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Shirt)) {
            return false;
        }
        Shirt shirt = (Shirt) o;
        return (size).equals(shirt.size)
            && super.getPrice() == shirt.getPrice()
            && super.getColor().equals(shirt.getColor())
            && super.getBrand().equals(shirt.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, super.getPrice(), super.getColor(), super.getBrand()); // Objects.hash() could accept multiple value as parameter, while Objects.hashCode() CANNOT
    }

    @Override
    public void fold() {
        System.out.println("Fold both the hand to back");
        System.out.println("Fold the hand leaf down");
        System.out.println("Fold the shirt down to up");
    }

}