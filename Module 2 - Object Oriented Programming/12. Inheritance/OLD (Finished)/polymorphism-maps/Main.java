import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Book, String> books1 = new HashMap<Book, String>(); // HashMap will sort randomly
        books1.put(new Book("Harry Potter", "J.K. Rowling", 29.99), "SSBob3Bl");
        books1.put(new Book("The Catcher in the Rye", "J. D. Salinger", 18.99), "dGhhdCB5b3UncmU=");
        books1.put(new Book("Game of Thrones", "George RR Martin", 31.99), "ZW5qb3lpbmc=");
        books1.put(new Book("The Alchemist", "Paulo Coelho", 14.99), "dGhlIGNvdXJzZSE=");
        printMap(books1);
        System.out.println();

        LinkedHashMap<Book, String> books2 = new LinkedHashMap<Book, String>(); // LinkedHashMap will sort as the way it inserted
        books2.put(new Book("Harry Potter", "J.K. Rowling", 29.99), "SSBob3Bl");
        books2.put(new Book("The Catcher in the Rye", "J. D. Salinger", 18.99), "dGhhdCB5b3UncmU=");
        books2.put(new Book("Game of Thrones", "George RR Martin", 31.99), "ZW5qb3lpbmc=");
        books2.put(new Book("The Alchemist", "Paulo Coelho", 14.99), "dGhlIGNvdXJzZSE=");
        printMap(books2);
        System.out.println();

        TreeMap<Book, String> books3 = new TreeMap<Book, String>(); // TreeMap will sort as overridden .compareTo() method 
        books3.put(new Book("Harry Potter", "J.K. Rowling", 29.99), "SSBob3Bl");
        books3.put(new Book("The Catcher in the Rye", "J. D. Salinger", 18.99), "dGhhdCB5b3UncmU=");
        books3.put(new Book("Game of Thrones", "George RR Martin", 31.99), "ZW5qb3lpbmc=");
        books3.put(new Book("The Alchemist", "Paulo Coelho", 14.99), "dGhlIGNvdXJzZSE=");
        printMap(books3);
        System.out.println();
        


    }  

    public static void printMap(Map<Book, String> map) { // uses Map (polymorphic advantages), so the input could change from HashMap, TreeMap, or LinkedMap
        map.entrySet().forEach((entry) -> {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        });
    }
}
