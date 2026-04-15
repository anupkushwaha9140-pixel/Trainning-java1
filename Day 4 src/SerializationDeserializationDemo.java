import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;

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

public class SerializationDeserializationDemo {
    public static void main(String[] args) {
        System.out.println("For Serialization and Deserialization Demo.java");


        Student s1 = new Student(101, "Abhishek Maurya");

        // Serialization
        try (FileOutputStream fos = new FileOutputStream("student.ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(s1);
            System.out.println("Object Serialized Successfully.\n");
            oos.close();
            fos.close();

        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }

        // Deserialization
        try (FileInputStream fis = new FileInputStream("student.ser");
                ObjectInputStream ois = new ObjectInputStream(fis)) {

            Student s2 = (Student) ois.readObject();

            System.out.println("Object Deserialized Successfully:");
            System.out.println("Student data After Deserialization:");
            s2.display();

            ois.close();
            fis.close();

        } catch (IOException e) {
            System.out.println("file error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class error: " + e.getMessage());
        }
    }
}