package ProblemSolving;

import java.util.*;

public class Prob14 {

    public static int [] rotationByk(int arr[],int k){
        int length=arr.length;
        int arr2[]=arr.clone();
        int ans[]=new int[length];
        int j=0;
        for(int i=length-k;i<length;i++){
            ans[j]=arr2[i];
            j++;
        }
        for(int i=0;i<length-k-1;i++){
            ans[j]=arr2[i];
            j++;
        }
        System.out.println(Arrays.toString(ans));

        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:-");
        int size=sc.nextInt();
        int arr[]=new int [size];
        System.out.println("Enter the array Elements:-");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of k:-");
        int k=sc.nextInt();
        k=k%size;
        int ans[]=rotationByk(arr, k);
        System.out.println(Arrays.toString(ans));
        sc.close();



    }
}
