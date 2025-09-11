package ProblemSolving;
import java.util.*;
public class Prob7 {

    public static boolean palindrome(String str){
        // boolean result=false;
        StringBuilder s1=new StringBuilder(str);
        StringBuilder s2=s1.reverse();
        if (s1.equals(s2)){
            return true;
        }
        else{
            return false;
        }
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string1:-");
        String str1=sc.next();
        boolean result=palindrome(str1);
        if (result)
            System.out.println(str1+" Is palindrome");
        else
            System.out.println(str1 + " Is not an palindrome");

        sc.close();

    }
    
}
