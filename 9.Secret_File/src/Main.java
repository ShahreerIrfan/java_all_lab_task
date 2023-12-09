import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final String STUDENT_FILE = "students.txt";
    private static final String COURSES_FILE = "courses.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Student\n2. Add Advised Courses\n3. Search by Student ID\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    addAdvisedCourses();
                    break;
                case 3:
                    searchByStudentID();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addStudent() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(STUDENT_FILE, true))) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter Student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Password: ");
            String password = scanner.nextLine();

            System.out.print("Enter Program: ");
            String program = scanner.nextLine();

            System.out.print("Enter Batch: ");
            int batch = scanner.nextInt();

            System.out.print("Enter CGPA: ");
            double cgpa = scanner.nextDouble();

            writer.println(id + "," + name + "," + password + "," + program + "," + batch + "," + cgpa);
            System.out.println("Student added successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void addAdvisedCourses() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(COURSES_FILE, true))) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter Student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Course Code: ");
            String courseCode = scanner.nextLine();

            writer.println(id + "," + courseCode);
            System.out.println("Advised course added successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void searchByStudentID() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(COURSES_FILE))) {
            String line;
            System.out.println("Advised Courses for Student ID " + id + ":");

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (Integer.parseInt(parts[0]) == id) {
                    System.out.println("Course Code: " + parts[1]);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
