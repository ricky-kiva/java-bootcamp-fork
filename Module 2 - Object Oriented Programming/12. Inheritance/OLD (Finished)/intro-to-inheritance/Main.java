public class Main {
    public static void main(String[] args) {
        Person person = new Person("Zach", 21);
        Object person2 = new Person(person); // POLYMORPHISM

        System.out.println("POLYMORPHISM: " + person2);

        System.out.println(person.equals(person2)); // objects that are TRUE in .equals() MUST has the SAME HASHCODE
        System.out.println("person: " + person.hashCode()); // to get the same hashcode, need to OVERRIDE hashCode()
        System.out.println("person2: " + person2.hashCode());

        System.out.println(person); // calling via overridden .toString()
    } 
}
