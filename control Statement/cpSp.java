import java.util.*;

public class cpSp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Selling price:-");
        int num1=sc.nextInt();
        System.out.println("Enter the cost price:-");
        int num2=sc.nextInt();
        if (num1>num2){
            System.out.println("You have made profit in this quater");

        }
        else if(num1==num2){
            System.out.println("You made no gain or loss in this quater");

        }
        else{
            System.out.println("You have made loss in this quater");
        }
        sc.close();

    }
    
}
