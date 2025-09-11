import java.util.*;

public class querybased2 {

    // Function to print array elements
    static void printArray(int arr[]) {
        System.out.println("----------------------------");
        for (int num : arr) {
            System.out.print(num + "\t");
        }
        System.out.println("\n----------------------------");
    }

    // Function to build prefix sum array
    static int[] prefixsumvalue(int arr[], int size) {
        int prefSum[] = new int[size];
        prefSum[0] = arr[0]; // first element is same
        for (int i = 1; i < size; i++) {
            prefSum[i] = prefSum[i - 1] + arr[i];
        }
        return prefSum;
    }

    // Function to find sum in range [l, r] using prefix sum
    static int query(int prefixsum[], int l, int r) {
        if (l == 0)
            return prefixsum[r];
        return prefixsum[r] - prefixsum[l - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size
        System.out.println("Enter the array size:");
        int size = sc.nextInt();

        // Take array elements
        int arr[] = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Print original array
        printArray(arr);

        // Build prefix sum array
        int prefixsum[] = prefixsumvalue(arr, size);
        System.out.println("Prefix sum array: " + Arrays.toString(prefixsum));

        // Take number of queries
        System.out.println("Enter the number of queries:");
        int q = sc.nextInt();

        // Process queries
        while (q > 0) {
            System.out.println("----------------------------");
            System.out.println("Enter Left index (0-based):");
            int l = sc.nextInt();

            System.out.println("Enter Right index (0-based):");
            int r = sc.nextInt();

            // Validate query range
            if (l < 0 || r >= size || l > r) {
                System.out.println("Invalid query range! Please enter values between 0 and " + (size - 1));
            } else {
                int sum = query(prefixsum, l, r);
                System.out.println("Sum of elements from index " + l + " to " + r + " = " + sum);
            }

            q--; // decrease query count
        }

        sc.close();
    }
}
