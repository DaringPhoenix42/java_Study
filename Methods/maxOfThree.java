package Methods;
import java.util.Scanner;
public class maxOfThree {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three numbers:-");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        System.out.println("Maximum: " + Math.max(n1, Math.max(n2, n3)));
        sc.close();

    }
    
}
