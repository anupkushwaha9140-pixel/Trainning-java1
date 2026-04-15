import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Step1:create serializable interface
class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class SerializableDemo {
    public static void main(String[] args) {
        System.out.println("For Serializable Demo.java");
        // Using try-with-resources for automatic resource management
        try (FileOutputStream fos = new FileOutputStream("student.ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            Student s1 = new Student(101, "Abhishek");
            oos.writeObject(s1);

            System.out.println("Object has been serialized");

        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }
    }

}