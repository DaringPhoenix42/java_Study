package Arrays;
import java.util.*;

public class rotatebyk {

    // Approach 1: Rotate using extra array
    static int[] rotate(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        int ans[] = new int[n];
        int j = 0;

        // Copy last k elements to the front
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }

        // Copy the first n-k elements
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }

        return ans;
    }

    // Swap helper
    static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // Reverse helper
    static void reverse(int arr[], int a, int b) {
        while (a < b) {
            swap(arr, a, b);
            a++;
            b--;
        }
    }

    // Approach 2: Rotate in place using reverse
    static void rotateInPlace(int arr[], int k) {
        int n = arr.length;
        k = k % n;

        // Step 1: Reverse first part
        reverse(arr, 0, n - k - 1);

        // Step 2: Reverse second part
        reverse(arr, n - k, n - 1);

        // Step 3: Reverse whole array
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take size input
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        // Take array elements
        int arr[] = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Show entered array
        System.out.println("Original array: " + Arrays.toString(arr));

        // Take rotation input
        System.out.print("Enter the number of rotations: ");
        int rotate = sc.nextInt();

        // Approach 1 → Using extra array
        int result[] = rotate(arr, rotate);
        System.out.println("Rotated array (using extra array): " + Arrays.toString(result));

        // Approach 2 → In-place rotation
        rotateInPlace(arr, rotate);
        System.out.println("Rotated array (in-place): " + Arrays.toString(arr));
        sc.close();
    }
}




















// package Arrays;
// import java.util.*;
// public class rotatebyk {

//     static int[] rotate(int arr [],int k){
//         int n=arr.length;
//         k=k%n;
//         int ans[]=new int [n];
//         int j=0;
//         // Copy last k elements to the front
//         for (int i = n - k; i < n; i++) {
//             ans[j++] = arr[i];
//         }

//         // Copy the first n-k elements
//         for (int i = 0; i < n - k; i++) {
//             ans[j++] = arr[i];
//         }

//         return ans;

//         }

//     static void swap(int arr[] ,int a, int b) {
//         int temp = arr[a];
//         arr[a] = arr[b];
//         arr[b] = temp;
//     }

//     static void reverse(int arr[],int i,int j){
//          i=0;
//          j=arr.length-1;
//         while(i<j){
//             swap(arr,i,j);
//             i++;
//             j--;
//         }
//     }


//     public static void main(String[] args){
//          Scanner sc = new Scanner(System.in);

//         // Take size input
//         System.out.println("-------------------------");
//         System.out.print("Enter the size of array: ");
//         int size = sc.nextInt();

//         // Take array elements
//         int arr[] = new int[size];
//         System.out.println("-------------------------");
//         System.out.println("Enter the array elements:");
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("-------------------------");
//         System.out.println("Enter the array elements that you gave as input:");
//         for (int i = 0; i < size; i++) {
//            System.out.print(arr[i]+"\t"); 
//         }
//         System.out.println("-------------------------");
//         System.out.println("Enter the no of  array rotation:");
//         int rotate = sc.nextInt();
        
//         int result []=rotate(arr, rotate);
//         System.out.println("-------------------------");
//         System.out.println("Final rorated array"+Arrays.toString(result));
//         System.out.println("-------------------------");
// rotate = rotate % size; // Handle rotate > size

// // Step 1: Reverse first part (0 to size - rotate - 1)
// reverse(arr, 0, size - rotate - 1);

// // Step 2: Reverse second part (size - rotate to size - 1)
// reverse(arr, size - rotate, size - 1);

// // Step 3: Reverse whole array
// reverse(arr, 0, size - 1);

// System.out.println("Final rotated array: " + Arrays.toString(arr));
//     }
    
// }
