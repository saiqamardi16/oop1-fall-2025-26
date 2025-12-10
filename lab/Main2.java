package lab;

class Position {
    private String title;
    private double salary;

    public Position(String title, double salary) {
        this.title = title;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public double getSalary() {
        return salary;
    }
}

class Employee {
    private String name;
    private Position position;   // Employee HAS-A Position

    public Employee(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }
}

class Company {
    private String companyName;
    private Employee[] employees;   // Company HAS-MANY Employees
    private int employeeCount = 0;

    public Company(String companyName, int capacity) {
        this.companyName = companyName;
        this.employees = new Employee[capacity];
    }

    public void addEmployee(Employee e) {
        if (employeeCount < employees.length) {
            employees[employeeCount++] = e;
        } else {
            System.out.println("No more space for employees!");
        }
    }

    public void showEmployees() {
        System.out.println("Company: " + companyName);
        System.out.println("Employees List:");
        for (int i = 0; i < employeeCount; i++) {
            Employee e = employees[i];
            System.out.println(
                e.getName() +
                "Position: " + e.getPosition().getTitle() +
                "Salary: " + e.getPosition().getSalary()
            );
        }
    }
}

public class Main2 {
    public static void main(String[] args) {

        // Create Company (capacity = 3)
        Company c = new Company("TechSoft Ltd.", 3);

        // Create Positions
        Position p1 = new Position("Manager", 55000);
        Position p2 = new Position("Software Engineer", 45000);
        Position p3 = new Position("Accountant", 35000);

        // Create Employees with Positions
        Employee e1 = new Employee("Rahim", p1);
        Employee e2 = new Employee("Karim", p2);
        Employee e3 = new Employee("Hasan", p3);

        // Add Employees to Company
        c.addEmployee(e1);
        c.addEmployee(e2);
        c.addEmployee(e3);

        // Display all employees
        c.showEmployees();
    }
}

    
