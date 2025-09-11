import java.util.*;

public class digitOfNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Wap to find the no of digit in the number:-");
        System.out.println("Enter the number:-");
        int number=sc.nextInt();
        int count=0;
        int n=Math.abs(number);
        if (n==0){
            count=1;
        }
        else {
            while(n>0){
                n=n/10;
                count++;
            }
        }
        System.out.println("Number of digits: " + count);
        sc.close();
        // another logic number greater than 99 and less than 1000
    }
}
