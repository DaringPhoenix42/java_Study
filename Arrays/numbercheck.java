package Arrays;
import java.util.*;
public class numbercheck {
    static int[] makeFrequencyarray(int arr[]){
        int freq[]=new int[100005];

        for (int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        // Declare and initialize array
        int[] arr = new int[n];

        // Take array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int freq[]=makeFrequencyarray(arr);
        // Take number of queries
        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();
        while(q>0){
            System.out.print("Enter number to be searched:- ");
            int x=sc.nextInt();
            if (freq[x]>0){
               System.out.print("Enter number is there"); 
            }
            else{
                 System.out.print("Enter number is  not there");
            }
            q--;
        }

        sc.close();
    }
    
}
