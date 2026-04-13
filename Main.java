// Create Student as parent class and CollegeStudent as child class using extends
// Parent class
class Student {
    int id;
    String name;

    // Constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to display student details
    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }
}

// Child class
class CollegeStudent extends Student {
    String collegeName;
    String course;

    // Constructor
    CollegeStudent(int id, String name, String collegeName, String course) {
        super(id, name); // calling parent constructor
        this.collegeName = collegeName;
        this.course = course;
    }

    // Method to display college student details
    void displayCollegeStudent() {
        display(); // calling parent method
        System.out.println("College Name: " + collegeName);
        System.out.println("Course: " + course);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        CollegeStudent cs = new CollegeStudent(101, "Anup kushwaha", "greater noida College", "Btech computer science engineering");

        cs.displayCollegeStudent();
    }
}