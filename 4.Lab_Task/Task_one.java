class Area{
    double radious,lenght,width,base1,base2,height;
    Area(double radious){
        if(radious <0){
            System.out.println("This is a negative number");
        }
        else{
            this.radious = radious;
        }
    }
    Area(double lenght,double width){
        if(lenght>0 && width > 0){
            this.lenght = lenght;
            this.width = width;
        }
        else{
            System.out.println("There is a negative value");
        }
    }

    Area(double base1,double base2, double height){
        if(base1>0 && base2>0 && height>0){
            this.base1 = base1;
            this.base2 = base2;
            this.height = height;
        }
        else{
            System.out.println("There is a negative value");
        }
    }

    void circleAraa(){
        double cirArea = 3.1416*(radious*radious);
        System.out.printf("The area of circle is: %.2f\n",cirArea);
    }

    void rectrangleArea(){
        double recArea = lenght*width;
        System.out.printf("Are of rctrangle is: %.2f\n",recArea);

    }

    void trapezoidArea(){
        double trapArea = ((base1+base2)/2)*height;
        System.out.printf("Area of trapezoid is: %.2f\n",trapArea);
    }
    
}

class Task_one {
    public static void main(String[] args) {
        Area circe = new Area(5);
        circe.circleAraa();

        Area rec = new Area(4, 6);
        rec.rectrangleArea();

        Area trap = new Area(1, 2, 3);
        trap.trapezoidArea();
    }
    
}


// 
//
//........