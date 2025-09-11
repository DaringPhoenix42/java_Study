package ProblemSolving;
import java.util.*;

public class Prob5 {
    public static boolean perfectNumber(int num){
        boolean perfectno=false;
        int sum=0;

        for(int i=1;i<num;i++){
            if (num%i==0){
                sum=sum+i;
            }
        }

        if (sum==num){
            perfectno=true;
            return perfectno;

        }
        else{
            return perfectno;
        }


    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:-");
        int num1=sc.nextInt();
        boolean finalv=perfectNumber(num1);
        if(finalv)
			System.out.println("Perfect Number");
		else
			System.out.println("Not an Perfect Number");

        sc.close();


    }
    
}
