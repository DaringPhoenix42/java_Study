package String;
import java.util.*;

public class Palindrome {
    public static char[] reversestring(char arr[]){
        int n=arr.length;
        char res[]=Arrays.copyOf(arr,n);
        int start=0;
        int end=n-1;
        while (start < end) {
            char temp = res[start];
            res[start] = res[end];
            res[end] = temp;
            start++;
            end--;
        }

        return arr;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("___________________________");
        System.out.println("Enter the input:-");
        String str=sc.next();
        System.out.println("The Entered string:-");
        char arr[]=str.toCharArray();
        int n=arr.length;
        for (int i=0; i<n;i++){
            System.out.print((char)arr[i]);
        }
        char reverse[]=reversestring(arr);
        System.out.println("Reversed String:");
        System.out.println(new String(reverse)); 

        if (Arrays.equals(arr, reverse)) {
            System.out.println(" It's a Palindrome!");
        } else {
            System.out.println(" Not a Palindrome!");
        }

        String reversed = new StringBuffer(str).reverse().toString();

        System.out.println("Reversed String: " + reversed);
        sc.close();

    }
    
}
