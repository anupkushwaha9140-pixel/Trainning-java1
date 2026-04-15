import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Student class (no need to make it public here)
class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class FileWriteDemo {
    public static void main(String[] args) {
        System.out.println("For File Write Demo");
        // create Student object
        Student s1 = new Student(1, "Anup kushwaha");
        try {
            FileWriter fw = new FileWriter("Student");
            // write data to file
            fw.write("Id: " + s1.id + "\n");
            fw.write("Name: " + s1.name);
            fw.close();
            System.out.println("Data Written Successfully");

            // Read data back from the file
            BufferedReader br = new BufferedReader(new FileReader("Student"));
            String line;
            System.out.println("\nDisplaying file content:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
