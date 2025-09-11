package Arrays;
import java.util.*;
public class countone {
    int occurrence(int arr[],int size){
        int count=0;
        for (int i=0;i<size;i++){
            count=0;
            for (int j=i+1;j<size;j++){
                if (arr[i]==arr[j]){
                    count=count+1;
                }
            }
            if (count==0){
                return arr[i];
            }
        }
        return -1;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("Enter the size of array:-");
        int size=sc.nextInt();
        System.out.println("-------------------------");
        int arrr[]=new int[size];
        System.out.println("Enter the array elements:-");
        for (int i=0;i<size;i++){
            arrr[i]=sc.nextInt();
        }
        System.out.println("-------------------------");
        System.out.println("Enter the array elements printed:-");
        for (int i=0;i<size;i++){
            System.out.println(arrr[i]);
        }
        countone obj=new countone();
        int result=obj.occurrence(arrr,size);
        System.out.println("-------------------------");
        System.out.println("Enter unique elemnt in array:-");
        System.out.println(result);
        sc.close();




    }
    
}
