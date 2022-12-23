import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import models.Discountables;
import models.Pants;
import models.Product;
import models.Shirt;

public class Main {
  
    static final String FILE_NAME = "products.txt";

    public static void main(String[] args) {
        Product[] products = new Product[] {
            new Pants(32, 24.99, "Blue", "JAVA KLEIN"),
            new Shirt(Shirt.Size.MEDIUM, 22.99, "Black", "CHANEL"),
            new Pants(34, 104.99, "Red", "JANGLER"),
            new Shirt(Shirt.Size.SMALL, 13.99, "Orange", "GEORGE"),
            new Pants(30, 119.99, "Grey", "FENDI"),
            new Shirt(Shirt.Size.LARGE, 34.99, "Blue", "ECKO"),
            new Pants(30, 129.99, "Red", "VERSACE"),
            new Shirt(Shirt.Size.SMALL, 22.99, "Beige", "ZARA"),
            new Pants(29, 99.99, "Dark", "JANGLER"),
            new Shirt(Shirt.Size.SMALL, 19.99, "Red", "NIKE"),
            new Pants(26, 24.99, "Indigo", "BELSTAFF"),
            new Shirt(Shirt.Size.LARGE, 29.99, "Blue", "ADIDAS"),
            new Pants(34, 104.99, "Red", "JANGLER"),
        }; // because Shirt & Pants inherited from the same parents (Product), it could be put to an array of Product(s)

        Shirt shirt = new Shirt(Shirt.Size.LARGE, 5.99, "Black", "JAVA VUITTON");
        Shirt shirt2 = new Shirt(shirt); // applying copy constructor
        Pants pants = new Pants(28, 24.99, "Black", "JAVA KLEIN");
        Pants pants2 = new Pants(pants);

        Product prodShirt = new Shirt(Shirt.Size.MEDIUM, 5.99, "Black", "JAVA VUITTON");
        
        // Product prodShirtCopy = new Shirt(prodShirt); // will error because copy constructor only accept Shirt object

        // Product product = new Product(5.99, "Black", "JAVA VUITTON"); // will error because product is an abstract class

        System.out.println(shirt);
        System.out.println(prodShirt);

        System.out.println(shirt.getBrand());
        System.out.println(products[1].getBrand()); // ? weird, Product object shouldn't be able to be made

        System.out.println(shirt2.equals(shirt)); // will return true because .equals() has already overridden
        System.out.println(pants2.equals(pants)); // will return true because .equals() has already overridden

        System.out.println();
        pants2.fold(); // printing the abstract method from Product parent that is overridden by Pants child
        System.out.println();
        shirt.fold();  // printing the abstract method from Product parent that is overridden by Shirt child

        // Interface ALLOWS polymorphism
        Discountables pantsDiscount = new Pants(32, 12.5  , "Pink", "Javadidas");

        System.out.println();
        pants2.discount(); // doing the method from interface
        System.out.println("Discounted Pants price: " + pants2.getPrice()); // testing the Discountables interface
        System.out.println(pantsDiscount); // testing interface's polymorphism
        // System.out.println(pantsDiscount.getPrice); // Will error because Discountables doesn't have .getPrice() method
        System.out.println();

        Arrays.sort(products); // will sort the array according to Comparable interface
        printArray(products);

        System.out.println("\nPRODUCT FROM FILE:\n");
        try {
            Product[] productTxt = getData();
            Arrays.sort(productTxt);
            printArray(productTxt);
        } catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
    }

    public static void printArray(Product[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);   
        }
    }
  
    /**
     * Function Name: getData
     * @return Product[]
     * @throws FileNotFoundException
     * 
     * Inside the function:
     *   1. Loads the data from products.txt
     */

     public static Product[] getData() throws FileNotFoundException {
        FileInputStream fis1 = new FileInputStream(FILE_NAME); // File Input Stream to COUNT the LENGTH
        Scanner scanLength = new Scanner(fis1); // scanner to count the length

        int fisLength = 0;

        while (scanLength.hasNextLine()) {
            scanLength.nextLine();
            fisLength += 1; // counting the length
        }

        scanLength.close();
        FileInputStream fis = new FileInputStream(FILE_NAME); // File Input Stream to read the file data
        Scanner scan = new Scanner(fis);  // scanner to read the data

        Product[] products = new Product[fisLength];

        for (int i = 0; scan.hasNextLine(); i++) {
            switch(scan.next()) {
                case "SHIRT": products[i] = new Shirt(Shirt.Size.valueOf(scan.next()), scan.nextDouble(), scan.next(), scan.next());
                break;
                case "PANTS": products[i] = new Pants(scan.nextInt(), scan.nextDouble(), scan.next(), scan.next());
                break;
            }
        }
        scan.close();
        return products;
     }
}
