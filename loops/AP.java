package loops;
import java.util.*;

public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter the first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter the common difference (d): ");
        int d = sc.nextInt();

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        System.out.println("\nArithmetic Progression:");

        // Printing AP using for loop
        for (int i = 0; i < n; i++) {
            System.out.print(a + "\t");
            a += d;  // next term
        }

        sc.close();
    }
}
