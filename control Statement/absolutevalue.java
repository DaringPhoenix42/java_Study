
import java.util.*;
public class absolutevalue {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:-");
        int num1=sc.nextInt();
        if (num1>0){
            System.out.println(num1);
        }
        else{

            int val=Math.abs(num1);
            System.out.println(val);
        }
        sc.close();
    }
    
}
