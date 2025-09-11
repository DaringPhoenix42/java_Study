package Methods;
import java.util.Scanner;
public class power {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b:-");
        double a=sc.nextInt();
        double b=sc.nextInt();
        // int val=1;
        // for (int i=1;i<=b;i++){
        //     val=val*a;
        // }
        double power=Math.pow(a,b);
        System.out.println(power);
        System.out.println(Math.pow(3.14, 3.14));   // 36.3378
        System.out.println(Math.sqrt(3.14));       // 1.7720
        System.out.println(Math.cbrt(3.1415));     // 1.4645
        System.out.println(Math.abs(-6));          // 6
        System.out.println(Math.floor(-3.14));     // -4.0
        sc.close();


    }
}
