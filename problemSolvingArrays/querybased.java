import java.util.*;

public class querybased {

    // Function to print array elements (1-based)
    static void printArray(int arr[], int size) {
        System.out.println("----------------------------");
        for (int i = 1; i <= size; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\n----------------------------");
    }

    
    static int[] prefixsumvalue(int arr[], int size) {
        int prefSum[] = new int[size + 1]; // +1 for 1-based indexing
        prefSum[1] = arr[1];
        for (int i = 2; i <= size; i++) {
            prefSum[i] = prefSum[i - 1] + arr[i];
        }
        return prefSum;
    }

    
    static int query(int prefixsum[], int l, int r) {
        return prefixsum[r] - prefixsum[l - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the array size:");
        int size = sc.nextInt();

        int arr[] = new int[size + 1]; // +1 to safely use 1-based indexing
        System.out.println("Enter the array elements:");
        for (int i = 1; i <= size; i++) {
            arr[i] = sc.nextInt();
        }

        
        printArray(arr, size);
        int prefixsum[] = prefixsumvalue(arr, size);
        System.out.println("Prefix sum array (1-based): " + Arrays.toString(Arrays.copyOfRange(prefixsum, 1, size + 1)));

        System.out.println("Enter the number of queries:");
        int q = sc.nextInt();

       
        while (q > 0) {
            System.out.println("Enter Left index (1-based):");
            int l = sc.nextInt();
            System.out.println("Enter Right index (1-based):");
            int r = sc.nextInt();
            if (l < 1 || r > size || l > r) {
                System.out.println("Invalid query range!");
            } else {
                int sum = query(prefixsum, l, r);
                System.out.println("Sum of elements from index " + l + " to " + r + " = " + sum);
            }

            q--; 
        }

        sc.close();
    }
}





















// import java.util.*;
// public class querybased {

//     static void printArray(int arr[]){
//         System.out.println("----------------------------");
//         int size=arr.length;
//          for(int i=0;i<size;i++){
//             System.out.print(arr[i]+"\t");;
//         }
//         System.out.println("----------------------------");
//     }

//     static int[] prefixsumvalue(int arr[],int size){
//         int prefSum []=new int[size];
//         prefSum[1]=arr[1];
//          for(int i=2;i<=size;i++){
//             prefSum[i]=prefSum[i-1]+arr[i];
            
//         }
//         return prefSum;
//     }

//       static void prefixsumbetter(int arr[],int size){
//         int sum=arr[0];
//         for(int i=1;i<size;i++){
//             sum=arr[i]+sum;
//             arr[i]=sum;
            
//         }
        
//     }

//     static int query(int arr[],int l,int r){
//         int sum=0;
//         int size=arr.length;
//         int prefixsum[]=prefixsumvalue(arr, size);
//         sum=prefixsum[r]-prefixsum[l-1];
//         return sum;
//     }
    
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("----------------------------");
//         System.out.println("Enter the array size");
//         int size=sc.nextInt();
//         System.out.println("----------------------------");
//         System.out.println("Enter the array Elements:-");
//         int arr[]=new int[size];
//         for(int i=1;i<=size;i++){
//             arr[i]=sc.nextInt();
//         }
//         printArray(arr);
//         int result[]=new int[size];
//         result=prefixsumvalue(arr, size);
//         System.out.println("Prefix sum array "+Arrays.toString(result));
//         System.out.println("Enter the number of queries:-");
//         int q=sc.nextInt();
//         while(q>0){
//             System.out.println("----------------------------");
//             System.out.println("Enter the Left limit value:-");
//             int l=sc.nextInt();
//             System.out.println("----------------------------");
//             System.out.println("Enter the right limit value:-");
//             int r=sc.nextInt();
//             System.out.println("----------------------------");
//             int sum=query(arr, l, r);
//             System.out.println("The prefix sum for given range"+l+" - "+r+" - "+sum);
//             q=q--;
//         }
//         sc.close();

//     }
// }
