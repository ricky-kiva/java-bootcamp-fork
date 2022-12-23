import models.*; // import all packages from models

public class Main {
    public static void main(String[] args) {
        Employee stocker = new Employee("Steve", "Stocker");
        Employee assisManager = new Employee("Kirk", "Assist Manager");
        Employee manager = new Employee("Hetfield", "manager");

        Store store = new Store();

        Employee[] arrEmploy = {stocker, assisManager, manager};

        for (int i = 0; i < arrEmploy.length; i++) {
            store.setEmployees(i, arrEmploy[i]);
        }

        System.out.println(store);
        store.open();
        
    }
}
