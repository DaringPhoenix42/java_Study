package ProblemSolving;
import java.util.*;

public class Prob8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();

        // Correct way to remove all whitespace characters
        str = str.replaceAll("\\s", "");

        int[] freq = new int[256]; // ASCII range
        int length = str.length();
        char[] arr = str.toCharArray(); // store toCharArray() as per your requirement

        // Count frequency
        for (int i = 0; i < length; i++) {
            freq[arr[i]]++;
        }

        // Print characters and their frequency
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + " : " + freq[i]);
            }
        sc.close();
        }
    }
}
