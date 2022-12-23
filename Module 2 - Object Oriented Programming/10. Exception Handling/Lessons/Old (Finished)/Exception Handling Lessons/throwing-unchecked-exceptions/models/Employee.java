package models; // marking folder as package

public class Employee {
    private String name;
    private String position;

    public Employee(String name, String position) {
        if (name.isBlank() || name == null || position.isBlank() || position == null) {
            throw new IllegalArgumentException("name & position can't be blank/null");
        } // throw Illegal Argument Exception if name/position is blank/null
        this.name = name;
        this.position = position;
    }
    public Employee(Employee source) {
        this.name = source.name;
        this.position = source.position;
    }

    public String getName() {
        return name;
    }
    
    public String getPosition() {
        return position;
    }

    public String toString() {

        return "\tName: " + name + "\tPosition: " + this.position + "\n";
    }
}
