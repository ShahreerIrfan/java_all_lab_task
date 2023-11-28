import java.util.Scanner;
public class Task_three {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        float length = input.nextFloat();
        System.out.print("Enter the width of the rectangle: ");
        float width = input.nextFloat();
        float area = (length*width);
        System.out.printf("Area of the rectangle is %.2f square units.",area);
    }
    
}
