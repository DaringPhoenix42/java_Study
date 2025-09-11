package ProblemSolving;
import java.util.*;

public class Prob2 {

    public static int [] fibonacci(int n){
        int arr[]=new int[n];
         arr[0]=0;
         arr[1]=1;
         int a=0;
         int b=1;

        for(int i=2;i<n;i++){
           int nextsum=a+b;
           arr[i]=nextsum;
           a=b;
           b=nextsum;
        }

        return arr;

    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:- ");
        int n=sc.nextInt();
        int arr[]=fibonacci(n);
        System.out.println(Arrays.toString(arr));

        sc.close();
    }
    
}
