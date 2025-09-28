package sorting;

import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};

        // outer loop
        for(int i=0; i<arr.length-1; i++){
            int j = i+1; // j starts from element next to i
            // shift element left until it is in the correct position
            while(j > 0 && arr[j-1] > arr[j]){
                // swap arr[j-1] and arr[j]
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--; // move left
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}

