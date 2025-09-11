package Arrays;
import java.util.*;


public class triplettargetsum {

    int tripletargetsumcount(int arr[],int target,int size){
        int count=0;
         // Triple nested loops to check all triplets
        for (int i = 0; i < size - 2; i++) {
            for (int j = i + 1; j < size - 1; j++) {
                for (int k = j + 1; k < size; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        count++;
                        System.out.println("Triplet found: " + arr[i] + ", " + arr[j] + ", " + arr[k]);
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("Enter the array size");
        int size=sc.nextInt();
        System.out.println("-----------------------");
        System.out.println("Enter the array elements:-");
        int arrr[]=new int[size];
        for (int i=0;i<size;i++){
            arrr[i]=sc.nextInt();
        }
        System.out.println("--------------------------");
        System.out.println("Array elemets:-");
        for (int i=0;i<size;i++){
            System.out.println(arrr[i]+"\t");
        }
        System.out.println("-------------------------");
        System.out.println("Enter the target value:-");
        int target=sc.nextInt();
        System.out.println("-------------------------");
        System.out.println("Passing the values to the function:-");
        triplettargetsum obj=new triplettargetsum();
        int result=obj.tripletargetsumcount(arrr, target, size);
        System.out.println(result);

        sc.close();

    }
    
}
