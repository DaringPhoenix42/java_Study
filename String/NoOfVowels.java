package String;
import java.util.*;

public class NoOfVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------");
        System.out.println("Enter the string:");
        String str = sc.nextLine().toLowerCase(); // ✅ Convert to lowercase

        int count = 0;

        // Convert String to char array
        char[] arr = str.toCharArray();

        // Count vowels
        for (char ch : arr) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        String str1 = "Dhruv is great";
        int count1 = 0;

        for (char ch : str1.toLowerCase().toCharArray()) {
        if ("aeiou".indexOf(ch) != -1) {
        count1=count1+1;
        }
        }
        System.out.println("Total vowels: " + count1);

        System.out.println("Number of vowels: " + count);
        count=0;
        String str2="DhruvTiwari";
        for (int i=0;i<str2.length();i++){
            char ch=str2.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count=count+1;

            }

        }
        System.out.println("Number of vowels: " + count);

        sc.close();
    }
}
