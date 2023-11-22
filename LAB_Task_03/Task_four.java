import java.util.Scanner;
public class Task_four {
    static int farToCel(int n){
        return (n-32)*5/9;
    }

    // This is main function
    public static void main(String[] args) {
        int fahrenheit ;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your fahrenheit: ");
        fahrenheit = input.nextInt();
        System.out.println(fahrenheit+" fahrenheit = "+farToCel(fahrenheit)+" celsious");
    }
}
