// Parent class
class Employee {
    void work() {
        System.out.println("Employee is working.");
    }
}

// Child class inheriting Employee
class Manager extends Employee {
    void manageTeam() {
        System.out.println("Manager is managing the team.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        
        // Creating object of Manager
        Manager m = new Manager();
        
        // Calling methods
        m.work();        // inherited from Employee
        m.manageTeam();  // method of Manager
    }
}