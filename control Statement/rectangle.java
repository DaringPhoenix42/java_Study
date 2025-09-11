import java.util.*;

public class rectangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Length");
        double length=sc.nextInt();
        System.out.println("Enter the Breath");
        double breadth=sc.nextInt();
        double area=length*breadth;
        double perimeter=2*(length+breadth);
        System.out.println("The area of rectangle= "+area);
        System.out.println("The area of rectangle= "+perimeter);
        if (area>perimeter){
            System.out.println("the area is more than perimeter");
        }
        else if (area==perimeter){
            System.out.println("the area is more than perimeter");
        }
        else{
            System.out.print("the area is less than perimeter");
        }
        sc.close();
    }
}
