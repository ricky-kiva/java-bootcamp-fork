public class Wrapper {
    public static void main(String[] args) {
        int wholeNumber = 5;
        Integer intNumber = new Integer(5); // is a wrapper of int (deprecated ver.)
        Integer intAngka = 5; // another way to define
        long largeWholeNumber = 5000000000L;
        Long longNumber = new Long(5000000000L); // is a wrapper of long (deprecated ver.)
        Long longAngka = 5000000000L; // another way to define
        double decimal = 5.493;
        Double decNum = new Double(5.493); // is a wrapper of double (deprecated ver.)
        Double decAngka = 5.493; // another way to define
        char letter = 'b';
        Character letAlpha = new Character('b'); // is a wrapper of char (deprecated ver.)
        Character letHuruf = 'b'; // another way to define

        System.out.println(wholeNumber);
        System.out.println(intNumber);
        System.out.println(intAngka);
        System.out.println(largeWholeNumber);
        System.out.println(longNumber);
        System.out.println(longAngka);
        System.out.println(decimal);
        System.out.println(decNum);
        System.out.println(decAngka);
        System.out.println(letter);
        System.out.println(letAlpha);
        System.out.println(letHuruf);
    }
}