package introduction_oops.constructor;

class Employee {
    private int salary; // to store the salary of employee

    public String employeeName; // to store the name of employee

    // Constructor
    public Employee() {
        employeeName = "John Doe";
        salary = 5000;
    }

    // Method to set the employee name as given input
    public void setName(String s) {
        employeeName = s;
    }

    // Method to set the salary as given input
    public void setSalary(int val) {
        salary = val;
    }

    // Method to get the salary of the employee
    public int getSalary() {
        return salary;
    }
}

// Main Class
class Main {
    public static void main(String[] args) {
        // Creating an object of Employee class
        Employee obj = new Employee();

        // Attributes of object initialized by the constructor
        System.out.println("Default values initialized by the constructor:\n");
        System.out.println("Employee Name: " + obj.employeeName);
        System.out.println("Salary: " + obj.getSalary());
    }
}
