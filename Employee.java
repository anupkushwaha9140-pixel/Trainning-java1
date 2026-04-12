// Create Employee are trainer class with empId and empName salary using constructor
class Employee {
    int empId;
    String empName;
    double salary;

    // Constructor
    Employee(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }

    // Method to display details
    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        // Creating object using constructor
        Employee e1 = new Employee(101, "Anup kushwaha", 125000);

        // Display details
        e1.display();
    }
}