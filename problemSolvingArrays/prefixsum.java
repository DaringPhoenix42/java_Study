import java.util.*;
public class prefixsum {

    

    static void printArray(int arr[]){
        System.out.println("----------------------------");
        int size=arr.length;
         for(int i=0;i<size;i++){
            System.out.print(arr[i]+"\t");;
        }
        System.out.println("----------------------------");
    }
    static int[] prefixsumvalue(int arr[],int size){
        int prefSum []=new int[size];
        prefSum[0]=arr[0];
         for(int i=1;i<size;i++){
            prefSum[i]=prefSum[i-1]+arr[i];
            
        }
        return prefSum;
    }

    static void prefixsumbetter(int arr[],int size){
        int sum=arr[0];
        for(int i=1;i<size;i++){
            sum=arr[i]+sum;
            arr[i]=sum;
            
        }
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("----------------------------");
        System.out.println("Enter the array size");
        int size=sc.nextInt();
        System.out.println("----------------------------");
        System.out.println("Enter the array Elements:-");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        printArray(arr);
        System.out.println("Enter the array Elements:-");
        int result[]=new int[size];
        result=prefixsumvalue(arr, size);
        System.out.println("Prefix sum array "+Arrays.toString(result));
        System.out.println("----------------------------");
        prefixsumbetter(arr, size);
        System.out.println("Prefix sum array "+Arrays.toString(arr));



        sc.close();


    }
}
