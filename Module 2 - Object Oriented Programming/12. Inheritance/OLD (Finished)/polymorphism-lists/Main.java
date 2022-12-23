import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(); // arraylist has direct reference to each elements (faster)
        list.add(1);
        list.add(2);
        list.size(); // size is a 'List' interface method, means ArrayList<> have a contract with list
        List<Integer> list2 = new ArrayList<Integer>(); // means polymorphism could applied between List & ArrayList

        LinkedList<Integer> linkList = new LinkedList<Integer>(); // LinkedList will iterate until the ends of element (slower)
        list.size(); // LinkedList has contract with interface 'List'
        List<Integer> linkList2 = new LinkedList<Integer>(); // LinkedList could polymorph List too
    }
}
