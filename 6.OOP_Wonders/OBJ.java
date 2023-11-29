class Rectangle{
    private double lenght ,width;
    // Set Method
    public void seT(double lenght,double width){
        this.lenght=lenght;
        this.width=width;
    }
    // Get Method
    public double getLenght(){
        return lenght;
    }
    public double getWidth(){
        return width;
    }
}

class Employee{
    private String name,id;
    private int salary;
    // set Function
    public void seT(String name,String id,int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    // Get Method
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public int getSalary(){
        return salary;
    }
    
}

class Circle{
    private double radious;
    // Set function
    public void setRadious(double radious){
        this.radious = radious;
    }

    // Get function
    public  double getRadious(){
        return radious;
    }
    
}

class Car{
    private String brand,model;
    private int year;
    // Set method
    public void seT(String brand,String model,int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    // Get method
    public String getBrand(){
        return brand;
    }

    public String getmodel(){
        return model;
    }

    public int getYear(){
        return year;
    }
}

class Student{
    private String name, rollNumber,program ;
    private int batch;

    // Set method
    public void seT(String name,String rollNumber,String program,int batch){
        this.name = name;
        this.rollNumber = rollNumber;
        this.program = program;
        this.batch = batch;
    }
    // get function
    public String getName(){
        return name;
    }

    public String getRollnumber(){
        return rollNumber;
    }

    public String getProgram(){
        return program;
    }

    public int getBatch(){
        return batch;
    }
}

public class OBJ {
    public static void main(String[] args) {
        Rectangle rectrangle = new Rectangle();
        rectrangle.seT(5.5,4.5);
        System.out.println("Rectrangle lenght: "+rectrangle.getLenght());
        System.out.println("Rectrangle width: "+rectrangle.getWidth());

        Employee employee = new Employee();
        employee.seT("Irfan","150",60000);
        System.out.println("Employee name: "+employee.getName());
        System.out.println("Employee Id: "+employee.getId());
        System.out.println("Employee slary: "+employee.getSalary());

        Circle circle = new Circle();
        circle.setRadious(3.6);
        System.out.println("Circle radious is: "+circle.getRadious());

        Car car = new Car();
        car.seT("Bmw","BMW-53",2023);
        System.out.println("Car brand is: "+car.getBrand());
        System.out.println("Car model is: "+car.getmodel());
        System.out.println("Car ralase year is: "+car.getYear());

        Student student  = new Student();
        student.seT("Shahreer Irfan","150","CSE",60);
        System.out.println("Student name is: "+student.getName());
        System.out.println("Student Roll number is: "+student.getRollnumber());
        System.out.println("Student program is: "+student.getProgram());
        System.out.println("Student batch is: "+student.getBatch());

    }
}

// 