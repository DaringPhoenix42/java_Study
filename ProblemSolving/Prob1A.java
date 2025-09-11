package ProblemSolving;
import java.util.Scanner;
public class Prob1A {
    public static String reverse_no(int number){
        
        String s="";
        while(number !=0){
            int digit=number%10;
            s=s+Integer.toString(digit);
            number=number/10;

        }
        System.out.println(s);
        return s;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the int digit");
        int number=sc.nextInt();
        System.out.println("The Reversed String:-");
        String str=reverse_no(number);
        // StringBuilder s1=new StringBuilder();
        System.out.println(str);
        sc.close();
    }
    
}
