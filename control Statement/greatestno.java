import java.util.*;

public class greatestno {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Wap to find the largest no among 3 number:-");
        System.out.println("Enter the number1:-");
        int num1=sc.nextInt();
        System.out.println("Enter the number2:-");
        int num2=sc.nextInt();
        System.out.println("Enter the number3:-");
        int num3=sc.nextInt();
        if (num1>num2 && num1>num3){
            System.out.println("The number "+num1+"is the greatest");
        }
        else if (num2>num1 && num2>num3){
            System.out.println("The number "+num2+"is the greatest");
        }
        else if (num3>num1 && num3>num2){
            System.out.println("The number "+num3+"is the greatest");
        }
        else{
            System.out.println("The numbers are equal");
        }
        sc.close();
    }
}
