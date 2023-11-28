import java.util.Scanner;
public class Task_two {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your birth year: : ");
        int birth_year = input.nextInt();
        int age = (2023-birth_year);
        System.out.print("Hello, "+name+" Your birth year is "+birth_year+" and you are "+age+" years old,.");
    }
}
