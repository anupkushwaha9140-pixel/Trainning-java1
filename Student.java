class Student {
    int rollNo;
    String name;
    float marks;

    // Method to assign values
    void setDetails(int r, String n, float m) {
        rollNo = r;
        name = n;
        marks = m;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        // Setting student details
        s1.setDetails(101, "Anup Kushwaha", 85.5f);

        // Displaying student details
        s1.displayDetails();
    }
}
