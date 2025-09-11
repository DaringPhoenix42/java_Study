package Arrays;
import java.util.*;

public class swapTwoInteger {

    // Method to swap two numbers and return swapped values as an array
    int[] swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        // Returning swapped values in an array
        return new int[]{a, b};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter the value of a and b:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Creating object to call swap method
        swapTwoInteger obj = new swapTwoInteger();
        int[] result = obj.swap(a, b);

        // Displaying swapped values
        System.out.println("After swapping: a = " + result[0] + ", b = " + result[1]);

        sc.close();
    }
}

