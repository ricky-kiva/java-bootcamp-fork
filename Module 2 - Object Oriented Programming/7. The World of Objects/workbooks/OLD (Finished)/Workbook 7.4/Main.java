 public class Main {
  
    public static void main(String[] args) {
        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5); 
        
        person.setSeatNumber(10);

        Person sister = new Person(person);
        sister.setName("Kathlyn Slim");
        sister.setSeatNumber(3);

        System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n" + "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: " + person.getSeatNumber() + "\n");
        System.out.println("Name: " + sister.getName() + "\n" + "Nationality: " + sister.getNationality() + "\n" + "Date of Birth: " + sister.getDateOfBirth() + "\n" + "Seat Number: " + sister.getSeatNumber() + "\n");
    }
  
  
}
