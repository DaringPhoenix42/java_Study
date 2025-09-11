package Methods;


import java.util.Scanner;

public class Permutation {

    // Factorial using long to handle big numbers
    public static long factorial(int num) {
        long val = 1;
        for (int i = 1; i <= num; i++) {
            val *= i;
        }
        return val;
    }

    // Combination (nCr)
    public static long combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    // Permutation (nPr)
    public static long permutation(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { // Auto-close Scanner

            System.out.print("Enter value of n: ");
            int n = sc.nextInt();

            System.out.print("Enter value of r: ");
            int r = sc.nextInt();

            if (r > n) {
                System.out.println("Invalid input! r cannot be greater than n.");
            } else {
                System.out.println("nCr (Combination) = " + combination(n, r));
                System.out.println("nPr (Permutation) = " + permutation(n, r));
            }
        }
    }
}
