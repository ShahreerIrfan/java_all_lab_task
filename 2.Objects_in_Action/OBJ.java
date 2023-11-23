class Rectangle{
    double length ,width;
    Rectangle(double length ,double width){
        this.length  = length ;
        this.width = width;
    }
    void printData(){
        System.out.println("Length = "+length);
        System.out.println("Width = "+width);
    }
}

class Employee{
    String name,id;
    int salary;
    Employee(String name,String id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void printData(){
        System.out.println("Name = "+name);
        System.out.println("ID = "+id);
        System.out.println("Salary = "+salary);
    }
}

class Circle{
    double radious;
    Circle(double radious){
        this.radious = radious;
    }
    void printData(){
        System.out.println("Radious = "+radious); 
    }
}

class Car{
    String brand,model;
    int year;
    Car(String brand,String model,int year){
        
    }
}

public class OBJ {
    public static void main(String[] args) {
        
    }
}
