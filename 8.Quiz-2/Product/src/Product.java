import java.io.*; // Import all
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getters and Setters (Encapsulation)
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Method to write product records to a text file
    public static void writeToFile(Product product, String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
            writer.println(product.getProductId() + "," + product.getName() + "," + product.getPrice());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static double calculateAveragePrice(String fileName) {
        double sum = 0;
        int count = 0;

        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                double price = Double.parseDouble(data[2]);
                sum += price;
                count++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return count > 0 ? sum / count : 0; // if coutnt>0 then sum/count
    }

    public static void printLowQuantityProducts(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                int quantity = Integer.parseInt(data[2]);
                if (quantity < 5) {
                    System.out.println("Product ID: " + data[0] + ", Name: " + data[1] + ", Quantity: " + quantity + ", Price: " + data[3]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void printProductNames(String fileName) {
        Map<Integer, String> productMap = new HashMap<>();

        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                int productId = Integer.parseInt(data[0]);
                String productName = data[1];
                productMap.put(productId, productName);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Product Names:");
        for (Map.Entry<Integer, String> entry : productMap.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}