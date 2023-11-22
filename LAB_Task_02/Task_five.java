import java.util.Scanner;
public class Task_five {
    // This is maximum funtion
    static int maxi(int n, int[] arr){
        int maximum = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>maximum){
                maximum = arr[i];
            }
        }
        return maximum;
    }
    // This is main function
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers: ");

        n = input.nextInt();

        System.out.print("Enter "+n+" numbers: ");

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }

        System.out.println("Maximum number is:"+maxi(n, arr));
    }
}

// Hello World
