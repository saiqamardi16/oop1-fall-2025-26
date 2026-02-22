package lab;

import javax.lang.model.element.VariableElement;

public class Proceduralprogramming {
    public static void main(String[] args) {
        VariableElement employee1 = (VariableElement) new Employee(50000, 20);
        int totalWage = ((Employee) employee1).calculateWage(10);
        System.out.println("Total Wage: " + totalWage);
    }

    public static class Employee {
        private int baseSalary;
        private int hourlyRate;
        public static int numberOfEmployees;

        public Employee(int baseSalary) {
            this(baseSalary, 0);
        }

        public Employee(int baseSalary, int hourlyRate) {
            setBaseSalary(baseSalary);
            setHourlyRate(hourlyRate);
            numberOfEmployees++;
        }

        public static int getNumberOfEmployees() {
            return numberOfEmployees;
        }

        public int getHourlyRate() {
            return hourlyRate;
        }

        public void setHourlyRate(int hourlyRate) {
            if (hourlyRate > 0)
                this.hourlyRate = hourlyRate;
            else
                throw new IllegalArgumentException("Hourly rate cannot be negative.");
        }

        public int calculateWage(int extraHours) {
            return baseSalary + (extraHours * hourlyRate);
        }

        public void setBaseSalary(int baseSalary) {
            if (baseSalary >= 0)
                this.baseSalary = baseSalary;
            else
                throw new IllegalArgumentException("Base salary cannot be negative.");
        }

        public int getBaseSalary() {
            return baseSalary;
        }
    }
}


