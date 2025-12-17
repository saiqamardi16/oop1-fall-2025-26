package lab.Abstraction;
    
    // Abstract class
    abstract class Employee {
    
        String name;
    
        // Constructor
        Employee(String name) {
            this.name = name;
        }
    
        // Abstract method
        abstract void calculateSalary();
    
        // Concrete method
        void showDetails() {
            System.out.println("Employee Name: " + name);
        }
    }
    
    // Subclass FullTimeEmployee
    class FullTimeEmployee extends Employee {
    
        double monthlySalary;
    
        FullTimeEmployee(String name, double monthlySalary) {
            super(name);
            this.monthlySalary = monthlySalary;
        }
    
        @Override
        void calculateSalary() {
            System.out.println("Monthly Salary: " + monthlySalary);
        }
    }
    
    // Main class
    public class AbstractEmployeeDemo {
        public static void main(String[] args) {
    
            Employee emp = new FullTimeEmployee("Saiqa", 50000);
    
            emp.showDetails();
            emp.calculateSalary();
        }
    }
    
        
    

