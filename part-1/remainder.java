import java.util.Scanner;
public class remainder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number1 ..");
        int Dividend=sc.nextInt();
        System.out.println("Enter the Number2 ..");
        int divisor=sc.nextInt();
        int quotient=Dividend/divisor;
        int remainder=Dividend-divisor*quotient;
        System.out.println(remainder);
        sc.close();
    }
    
}

