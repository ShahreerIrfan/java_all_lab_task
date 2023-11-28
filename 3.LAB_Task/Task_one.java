import java.util.Scanner;

public class Task_one {
    // This is Sum Fnction for make sum 2 variable
    static int sum(int x,int y){
        return x+y;
        }
    // This is substraction function
    static int subtrac(int x,int y){
        return x-y;
        }

    // This is multiplication function
    static int multi(int x,int y){
        return x*y;
        }
    // This is divition function
    static int div(int x,int y){
        return x/y;
        }
        

        // This is main function
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        System.out.print("Enter two numbers: ");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("Sum of two numbers is: "+sum(a,b));
        System.out.println("Substraction of two numbers is: "+subtrac(a,b));
        System.out.println("Multiplication of two numbers is: "+multi(a,b));
        // Handling zero for divition
        if(a>0&&b>0){
            System.out.println("Divition of two numbers is: "+div(a,b));
        }
        else{
            System.out.println("There is a zero ");
        }
        
        
    }
}