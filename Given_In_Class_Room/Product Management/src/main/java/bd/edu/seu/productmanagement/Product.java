package bd.edu.seu.productmanagement;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Description of the file</h1>
 * <p></p>
 *
 * @author : Asaduzzaman Noor
 * @version : 2.0
 * @since : Tuesday, 12 December 2023 17:28
 */
public class Product {
    private int id;
    private String name;
    private double price;

    public Product() {

    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void writeToFile() throws IOException {
        String line = this.id + "," + this.name + "," + this.price + "\n";
        RandomAccessFile r = new RandomAccessFile("products.txt", "rw");
        r.seek(r.length());
        r.writeBytes(line);
//        try {
//        } catch (FileNotFoundException ex) {
//            System.err.println("File not found");
//        } catch (IOException ex) {
//            System.err.println("Failed to write file");
//        }
    }

    public List<Product> readFile() throws IOException {
        List<Product> productList = new ArrayList<>();

        RandomAccessFile r = new RandomAccessFile("products.txt", "r");
        String line;
        while ((line = r.readLine()) != null) {
            String[] data = line.split(",");
            int id = Integer.parseInt(data[0]);
            String name = data[1];
            double price = Double.parseDouble(data[2]);

            Product product = new Product(id, name, price);
            productList.add(product);
        }
        return productList;
    }

    public double getPriceAverage() throws IOException {
        List<Product> productList = readFile();
        double sum = 0;
        for (Product product: productList) {
            sum += product.getPrice();
        }
        return sum / productList.size();
    }
}
