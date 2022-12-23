public class Person {
    
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;

    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDoB() {
        return dateOfBirth;
    }

    public void setDoB(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getSeat() {
        return seatNumber;
    }

    public void setSeat(int seatNumber) {
        this.seatNumber = seatNumber;
    }
 
}
