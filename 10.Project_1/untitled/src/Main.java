import java.io.*;
import java.util.*;

public class Main {
    private static final String USER_FILE = "users.txt";
    private static final String STUDENT_FILE = "students.txt";
    private static final String COURSE_FILE = "courses.txt";

    private static Map<String, String> users = new HashMap<>();

    public static void main(String[] args) {
        loadUsers();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Student Management System");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (authenticateUser(username, password)) {
            System.out.println("Authentication successful. Welcome, " + username + "!");
            showMainMenu(scanner);
        } else {
            System.out.println("Authentication failed. Please try again.");
        }
    }

    private static void loadUsers() {
        try (BufferedReader reader = new BufferedReader(new FileReader(USER_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                users.put(parts[0], parts[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean authenticateUser(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }

    private static void showMainMenu(Scanner scanner) {
        int choice;
        do {
            System.out.println("\nMain Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. View Student Information");
            System.out.println("3. Assign Courses");
            System.out.println("4. Search Advised Courses");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    viewStudentInformation(scanner);
                    break;
                case 3:
                    assignCourses(scanner);
                    break;
                case 4:
                    searchAdvisedCourses(scanner);
                    break;
                case 5:
                    saveData();
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    private static void addStudent(Scanner scanner) {

    }

    private static void viewStudentInformation(Scanner scanner) {

    }

    private static void assignCourses(Scanner scanner) {

    }

    private static void searchAdvisedCourses(Scanner scanner) {

    }

    private static void saveData() {

    }
}
