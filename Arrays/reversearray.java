package Arrays;
import java.util.*;

public class reversearray {

    // Method to reverse an array and return a new reversed array
    int[] reverseArray(int arr[], int size) {
        int arr1[] = new int[size];
        int j = 0;

        // Copy elements in reverse order
        for (int i = size - 1; i >= 0; i--) {
            arr1[j] = arr[i];
            j++;
        }

        return arr1;
    }

    // Better approach: Reverse array in-place using swapping
    static int[] reversebetterapp(int arr[], int size) {
        int i = 0;
        int j = size - 1;
        while (i < j) {  //
            swap(arr, i, j);
            i++;
            j--;
        }
        return arr;
    }

    // Swap two elements
    static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;  // ✅ Corrected line
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

        // Create object to call reverseArray method
        reversearray obj = new reversearray();
        int reversed[] = obj.reverseArray(arr, size);
        System.out.println("------------------------");
        System.out.println("Brute approach");
        // Print reversed array
        System.out.println("Reversed Array: " + Arrays.toString(reversed));

        System.out.println("----------------------------------");
        System.out.println("Better approach");
        int result[] = reversebetterapp(arr, size);
        System.out.println("Reversed Array: " + Arrays.toString(result));

        sc.close();
    }
}





// package Arrays;
// import java.util.*;

// public class reversearray {

//     // Method to reverse an array and return a new reversed array
//     int[] reverseArray(int arr[], int size) {
//         int arr1[] = new int[size];
//         int j = 0;

//         // Copy elements in reverse order
//         for (int i = size - 1; i >= 0; i--) {
//             arr1[j] = arr[i];
//             j++;
//         }

//         return arr1;
//     }

//     static int[] reversebetterapp(int arr[],int size){
//         int i=0;
//         int j=size-1;
//         while (i<size && j>=0){

//             swap(arr,i,j);
//             i=i+1;
//             j=j-1;
//         }
//         return arr;
//     }

//     static void swap(int arr[],int a,int b){
//         int temp;
//         temp=arr[a];
//         arr[a]=arr[b];
//         arr[b]=temp;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Take size input
//         System.out.print("Enter the size of array: ");
//         int size = sc.nextInt();

//         // Take array elements
//         int arr[] = new int[size];
//         System.out.println("Enter the array elements:");
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // Create object to call reverseArray method
//         reversearray obj = new reversearray();
//         int reversed[] = obj.reverseArray(arr, size);
//         System.out.println("------------------------");
//         System.out.println("Brute approach");
//         // Print reversed array
//         System.out.println("Reversed Array: " + Arrays.toString(reversed));
//         System.out.println("----------------------------------");
//         System.out.println("Better approach");
//         int result[]=reversebetterapp(arr,size);
//         System.out.println("Reversed Array: " + Arrays.toString(result));

//         sc.close();
//     }
// }