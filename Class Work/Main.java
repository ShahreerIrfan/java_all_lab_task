class Car{
    String brand,model;
    double millage;
    int price;

    Car(String brand,String model,double millage,int price){
        this.brand = brand;
        this.model = model;
        this.millage = millage;
        this.price = price;
    }
    void printDetails(){
        System.out.println("car brand is: "+brand);
        System.out.println("car model is: "+model);
        System.out.println("car millage is: "+millage);
        System.out.println("car price is: "+price);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("BMW","XYZ",16.7,20000000);
        c1.printDetails();
    }
    
}
