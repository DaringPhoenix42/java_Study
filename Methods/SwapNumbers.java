package Methods;
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + " " + b);  // Print original values

        a = a + b;   // Step 1: a becomes sum of a and b
        b = a - b;   // Step 2: b becomes original a
        a = a - b;   // Step 3: a becomes original b

        System.out.println(a + " " + b);  // Print swapped values
        sc.close();
    }
}
