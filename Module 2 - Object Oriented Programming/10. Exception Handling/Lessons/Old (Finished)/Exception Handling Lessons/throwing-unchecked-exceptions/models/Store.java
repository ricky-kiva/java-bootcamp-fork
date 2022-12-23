package models; // marking folder as package

public class Store {
    Employee[] employees;

    public Store() {
        employees = new Employee[3];
    }

    public void setEmployees(int index, Employee employee) {
        this.employees[index] = new Employee(employee);
    }

    public void open() {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] == null) {
                throw new IllegalStateException("Need to be fully staffed to open the store");
            } // throwing Illegal State Exception if there's null in this.employees
        }
        System.out.println("We're open for business!");
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < employees.length; i++) {
            temp += employees[i] != null ? employees[i].toString() : "";
        }
        return temp;
    }

}
