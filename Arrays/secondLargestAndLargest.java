package Arrays;
import java.util.*;
public class secondLargestAndLargest {
    int maximum(int arr[],int size){

        if (size==0){
            return -1;
        }

        int maximum = Integer.MIN_VALUE;

        for(int i=0;i<size;i++){
            if (arr[i]>maximum){
                maximum=arr[i];
            }
        }
        return maximum;

    }

    int secondmaximum(int arr [],int size){
        if (size==0){
            return -1;
        }
        int maxvalue=maximum(arr, size);
        int secondmax = Integer.MIN_VALUE;

        for (int i=0;i<size;i++){
            if (arr[i]<maxvalue && arr[i]>secondmax){
                secondmax=arr[i];
            }
        }
        if (secondmax==-Integer.MAX_VALUE){
            return -1;
        }
        return secondmax;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("Enter the size of array:-");
        int size=sc.nextInt();
        System.out.println("-------------------------");
        System.out.println("Enter the array elements :-");
        int arr[]=new int[size];
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the array elements printed:-");
        for (int i=0;i<size;i++){
            System.out.print( arr[i]+"\t");
        }
        secondLargestAndLargest obj=new secondLargestAndLargest();
        System.out.println("---------------------------------");
        System.out.println("Maximum no:-");
        int maximum=obj.maximum(arr, size);
        System.out.println(maximum);
        System.out.println("---------------------------------");
        System.out.println("Second no:-");
        int secondmax=obj.secondmaximum(arr, size);
        System.out.println(secondmax);


        sc.close();
    }
    
}
