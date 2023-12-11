import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum: " + sum);

        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            max = Math.max(max, num);
        }
        System.out.println("Maximum: " + max);


        int min = Integer.MAX_VALUE;
        for (int num : numbers) {
            min = Math.min(min, num);
        }
        System.out.println("Minimum: " + min);

        double average = sum / (double) numbers.size();
        System.out.println("Average: " + average);
    }
}
