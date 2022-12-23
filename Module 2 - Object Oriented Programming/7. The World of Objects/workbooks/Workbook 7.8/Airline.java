public class Airline {
    
    Person[] people; //array that stores Person objects...

    public Airline() {
        this.people = new Person[11];
    }

    public void setPerson(Person person) {
        this.people[person.getSeatNumber()] = new Person(person); // sets seatNumber as index
    } // doing Deep Copy for object element in this.people array

    public String getPerson(int index) {
        return this.people[index].toString(); // on .getPerson call, call toString() from Person.java
    }

}
