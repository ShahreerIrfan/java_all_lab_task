import java.util.Scanner;
public class Task_one {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        
        String name = input.nextLine();
        System.out.print("Enter your age: : ");

        int age = input.nextInt();

        System.out.print("Hello "+name+" You are "+age+" years old.");

    }
}