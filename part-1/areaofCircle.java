import java.util.Scanner;


public class areaofCircle {
    
    public static void main(String[] args){

        System.out.println("The area of the circle");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius=sc.nextInt();

        
        double area=3.14*radius*radius;
        System.out.println(area);
        sc.close();
        
    }
}
