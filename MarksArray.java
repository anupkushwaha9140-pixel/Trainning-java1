// create an array of 5 marks and print and print them using for loopclass MarksArray 
class MarksArray {
    public static void main(String[] args) {
        
        // Create array of 5 marks
        int marks[] = {85, 90, 78, 88, 92};

        // Print marks using loop
        System.out.println("Marks are:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}