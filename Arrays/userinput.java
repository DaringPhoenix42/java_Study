package Arrays;
import java.util.*;
public class userinput {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("-------------------------------------");
        System.out.println("Enter the array elements:-");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("-------------------------------------");
        System.out.println("The array elements:-");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ "\t");

        }
        System.out.println("-------------------------------------");
        sc.close();

    }
    
}

