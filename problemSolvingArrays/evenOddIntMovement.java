import java.util.Scanner;

public class evenOddIntMovement {

    static void printarray(int arr[]){
        int n=arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");

        }
    }

    static void evenOddIntMovementn(int arr[]){
        int n=arr.length;
        int left=0;
        int right=n-1;

        while(left<right){
           if (arr[left]%2!=0 && arr[right]%2==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if (arr[left]%2==0){
                left++;
            }
            if (arr[right]%2!=0){
                right--;
            } 
        }

    }

    static void swap(int arr[],int a,int b){
        int temp;
        temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("------------------------");
        // Take size input

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        // Take array elements
        int arr[] = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(" array elements-------:");
        evenOddIntMovementn(arr);
        printarray(arr);
        sc.close();

        
    }
}



