package ProblemSolving;
import java.util.*;

public class Prob6 {

    public static boolean anagram(String str1,String str2){
        boolean result=false;
        char[] a1 = str1.toLowerCase().toCharArray();
        char[] a2 = str2.toLowerCase().toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        result=Arrays.equals(a1,a2);
        if (result){
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
        String str2=sc.next();
        boolean result=anagram(str1, str2);
        if (result)
            System.out.println(str1 + " and " + str2 + " are Anagram");
        else
            System.out.println(str1 + " and " + str2 + " are not Anagram");

        sc.close();

    }
    
}
