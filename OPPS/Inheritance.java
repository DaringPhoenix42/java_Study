package OPPS;
import Bank.*;

class Shape{
    String color;
}

class Triangle extends Shape{

}

public class Inheritance {

    public static void main(String [] args){
        Triangle t1=new Triangle();
        t1.color="yellow";

        Shape s1=new Shape();
        Account acc = new Account();  
        acc.name = "Ramesh";

    }
    
}
