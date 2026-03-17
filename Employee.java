class Employee {
    double salary = 50000;

    void displaySalary() {
        System.out.println("Salary: " + salary);
    }
}

class PermanentEmployee extends Employee {

    void calculateBonus() {
        int bonus = (int)(salary * 0.10);
        System.out.println("Bonus: " + bonus);
    }
}

public class Main {
    public static void main(String[] args) {

        PermanentEmployee p = new PermanentEmployee();

        p.displaySalary();
        p.calculateBonus();
    }
}