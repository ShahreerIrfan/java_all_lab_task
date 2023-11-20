public class Task_three {

    // Sum function
    static void printSum() {
        int sum =0;
        for (int i = 1; i <= 100; i++) {
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("Sum of 1 to 100 all even numbers:"+sum);
    }
    // Main function 
    public static void main(String[] args) {
        printSum();
    }

}
