import java.util.*;

public class divisibility {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Wap to tell if number is divisible by 5 and 3");
        System.out.println("Enter the number:-");
        int number1=sc.nextInt();
        if (number1%5==0 && number1%3==0){
            System.out.println("The number is divisible by both 5 and 3");
        }
        else{
            System.out.println("The number is not divisible by both 5 and 3");
        }
        sc.close();
    }
}
