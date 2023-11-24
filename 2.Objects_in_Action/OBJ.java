class Rectangle{
    double length ,width;
    Rectangle(double length ,double width){
        this.length  = length ;
        this.width = width;
    }
    void printData(){
        System.out.println("Information of rectrangle class");
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
        System.out.println("Information of employee class");
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
        System.out.println("Information of circle class");
        System.out.println("Radious = "+radious); 
    }
}

class Car{
    String brand,model;
    int year;
    Car(String brand,String model,int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    void printData(){
        System.out.println("Information of car class");
        System.out.println("Brand = "+brand);
        System.out.println("Model = "+model);
        System.out.println("Year = "+year);
    }
}

class Student{
    String name, rollNumber,program ;
    int batch;

    Student(String name,String rollNumber,String program,int batch){
        this.name = name;
        this.rollNumber = rollNumber;
        this.program = program;
        this.batch = batch;
    }

    void printData(){
        System.out.println("Information of student class");
        System.out.println("Name = "+name);
        System.out.println("Roll Number = "+rollNumber);
        System.out.println("Year = "+program);
        System.out.println("Batch = "+batch);
        
    }
}

public class OBJ {
    public static void main(String[] args) {
        Rectangle rectrangle = new Rectangle(5.4, 5.6);
        rectrangle.printData();

        Employee employee = new Employee("Irfan","2022000000150", 72676);
        employee.printData();

        Circle circle = new Circle(4.9);
        circle.printData();

        Car car = new Car("Range Rover", "Range-Rover-Sport", 2023);
        car.printData();
        Student student  = new Student("Irfan", "150", "CSE", 60);
        student.printData();
    }
    // Hell
}