class Employee {

    protected int id;
    protected String name;
    protected double basicSalary;

    void displayEmployee() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}


// Child class
class PermanentEmployee extends Employee {

    private double bonus;

    PermanentEmployee(int id, String name, double basicSalary, double bonus) {

        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    void calculateSalary() {

        double totalSalary = basicSalary + bonus;

        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
    }
}


public class EmployeePayrollSystem {

    public static void main(String[] args) {

        PermanentEmployee emp =
            new PermanentEmployee(101, "Anchal", 40000, 5000);

        emp.displayEmployee();
        emp.calculateSalary();
    }
}