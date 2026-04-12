// Create a shared company name using static variable
class CompanyEmployee {
    int empId;
    String empName;
    double salary;

    // Static variable (shared by all objects)
    static String companyName = "TCS";

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
        System.out.println("Company Name: " + companyName);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Anup", 25000);
        Employee e2 = new Employee(102, "Rahul", 30000);

        e1.display();
        e2.display();
    }
}

