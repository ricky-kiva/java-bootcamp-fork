import java.util.ArrayList;

public class ResizableArrays {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>(); // to make resizable arrays // can only store objects
        names.add("Roger");
        names.add("Rick");
        names.add("Syd");

        for (int i = 0; i < names.size(); i++) { // .size() is a method of ArrayList to get array's length
            System.out.print(names.get(i) + " ");
        }
        System.out.println();

        names.add(1, "Mason"); // .add() to add element to array

        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + " ");
        }
        System.out.println();

        names.add("Gilmour");
        names.remove(3); // .remove() to remove element from array

        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + " ");
        }
        System.out.println();
    }
}
