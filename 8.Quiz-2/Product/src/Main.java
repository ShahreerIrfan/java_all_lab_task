public class Main {
    public static void main(String[] args) {

        Product product1 = new Product(1, "Product A", 10.99);
        Product product2 = new Product(2, "Product B", 20.49);


        Product.writeToFile(product1, "products.txt");
        Product.writeToFile(product2, "products.txt");


        double averagePrice = Product.calculateAveragePrice("products.txt");
        System.out.println("Average Price of All Products: " + averagePrice);

        Product.printLowQuantityProducts("products.txt");

        Product.printProductNames("products.txt");
    }
}