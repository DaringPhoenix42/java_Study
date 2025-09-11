package ProblemSolving;
import java.util.*;
public class Prob16 {

    public static boolean amstrongno(int num){
        // boolean result=false;
        int val=num;
        int noofDigit=0;
        while(val!=0){
            val=val/10;
            noofDigit++;

        }
        int sum=0;
        val=num;

        while(val!=0){
            int lastDigit= val % 10;
            sum=sum+(int)Math.pow(lastDigit, noofDigit);
            val = val / 10;

        }

        if (sum==num){
            System.out.println("Yes the no is anagram "+num);
            return true;
        }
        else{
            System.out.println("No the no is not an anagram "+num);
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of number:-");
        int num=sc.nextInt();
        boolean result=amstrongno(num);
        System.out.println(result);
    


        sc.close();

    }
}
