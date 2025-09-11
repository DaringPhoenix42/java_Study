package ProblemSolving;
import java.util.*;
public class Prob4 {

    public static int greatestCommonDivisor(int n1,int n2){
        int min;
        if (n1>n2){
            min=n2;
        }
        else if(n1<n2){
            min=n1;
        }
        else{
            min=n1;
        }
        int gcd=1;
        for(int i=1;i<min;i++){
            if (n1%i==0 && n2%i==0){
                gcd=i;

            }
        }
        return gcd;
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers:-");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int ans=greatestCommonDivisor(num1, num2);
        System.out.println("reatest Common Divisor (GCD) of two given numbers.");
        System.out.println(ans);
        sc.close();

    }
    
}
