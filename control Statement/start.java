import java.util.Scanner;
public class start {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num1=sc.nextInt();
        if (num1%2==0){
            System.out.println("Tne Number is even");

        }
        else{
             System.out.println("Tne Number is odd");
        }
        sc.close();

    }
}


