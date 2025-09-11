package String;

import java.util.*;

public class StringBaic {
    public static void main(String[] args) {
        char arr[] = { 'D', 'h', 'r', 'u', 'v' };
        System.out.println("------------------");
        for (char elem : arr) {
            System.out.print(elem + " ");
        }
        System.out.println();
        System.out.println("------------------");

        String x = "Hello world this is dhruv";
        System.out.println(x);
        System.out.println("------------------");
        System.out.println(x.charAt(4)); 
        System.out.println("------------------");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String val = sc.nextLine(); 
        System.out.println(val);
        System.out.println("------------------");

        System.out.println("Enter another string:");
        String s2 = sc.next(); 
        System.out.println(s2);
        System.out.println("------------------");

        sc.close();
    }
}
