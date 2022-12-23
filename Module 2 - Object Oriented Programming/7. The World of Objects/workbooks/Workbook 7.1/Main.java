import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person kathlyn = new Person();
        kathlyn.name = "Kathlyn";
        kathlyn.nationality = "American";
        kathlyn.dateOfBirth = "1/1/99";
        String[] passport = {"Kathlyn Lenz", "American", "1/1/99"};
        kathlyn.passport = passport;
        kathlyn.seatNumber = 7;

        System.out.println(kathlyn.name);
        System.out.println(kathlyn.nationality);
        System.out.println(kathlyn.dateOfBirth);
        System.out.println(Arrays.toString(kathlyn.passport));
        System.out.println(kathlyn.seatNumber);
    }
}
