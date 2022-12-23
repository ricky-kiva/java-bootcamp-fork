package models;

// Comparable is an interface to make a class able to handle .sort() // placed in Parent, so Pants & Shirt could inherits the method also
public abstract class Product implements Comparable<Product> { // is an ABSTRACT class, means you can't make object out of it
    private double price;
    private String color;
    private String brand;

    public Product(double price, String color, String brand) {
        this.price = price;
        this.color = color;
        this.brand = brand;
    }

    public Product (Product source) {
        this.price = source.price;
        this.color = source.color;
        this.brand = source.brand;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public int compareTo(Product o) {
        String className = this.getClass().getSimpleName();
        String classNameIn = o.getClass().getSimpleName();
        if (!(className.equals(classNameIn))) {
            return className.compareTo(classNameIn); // compare by class name first
        }
        // return (int) Math.round(this.getPrice() - o.getPrice()); // compare by price
        return Double.compare(this.getPrice(), o.getPrice());
    }

    public abstract void fold(); // an abstract method is a method that forces parent's child class to override it by themself (them: the child)

}
