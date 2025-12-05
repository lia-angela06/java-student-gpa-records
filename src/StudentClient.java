import java.util.Scanner;

public class StudentClient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.println("Enter the name, ID, and GPA of a student:");
        String name = input.nextLine();
        int ID = input.nextInt();
        double GPA = input.nextDouble();

        // Create student objects
        StudentGPA student1 = new Student(name, ID, GPA);
        StudentGPA student2 = new Student(); // default constructor

        // Print student info
        System.out.println("\n\nStudent Records:");
        System.out.println("Name\t\tID\t\tGPA");
        System.out.println(student1);
        System.out.println(student2);

        // Change GPA of default student
        student2.setGPA(3.55);

        // Print again after changing GPA
        System.out.println("\n\nAfter invoking setGPA method,\n");
        System.out.println("Student Records:");
        System.out.println("Name\t\tID\t\tGPA");
        System.out.println(student1);
        System.out.println(student2);

        input.close();
    }
}
