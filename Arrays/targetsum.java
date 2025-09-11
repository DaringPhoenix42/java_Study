package Arrays;
import java.util.*;

public class targetsum {

    // Function to count number of pairs whose sum equals target
    int countOfTargetSum(int aarr[], int target) {
        int count = 0;

        // Check all pairs
        for (int i = 0; i < aarr.length; i++) {
            for (int j = i + 1; j < aarr.length; j++) {
                if (aarr[i] + aarr[j] == target) {
                    count++;
                    System.out.println("Pair found: (" + aarr[i] + ", " + aarr[j] + ")");
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------------------------------------");
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Array size must be greater than 0.");
            sc.close();
            return;
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Enter the array elements:");
        int arr1[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Enter the target sum:");
        int target = sc.nextInt();

        System.out.println("--------------------------------------------------");
        System.out.println("Array Elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr1[i] + "\t");
        }
        System.out.println("\n--------------------------------------------------");

        targetsum obj = new targetsum();
        int result = obj.countOfTargetSum(arr1, target);

        if (result > 0) {
            System.out.println("Number of pairs with sum " + target + " = " + result);
        } else {
            System.out.println("No pairs found with sum " + target);
        }

        sc.close();
    }
}
