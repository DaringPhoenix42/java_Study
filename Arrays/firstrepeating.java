package Arrays;
import java.util.*;
public class firstrepeating {
    int firstrepeatingval(int arr[],int size){
        int count=0;
        for (int i=0;i<size;i++){
                count=0;
                for (int j=0;j<size;j++){
                    if (arr[i]==arr[j]){
                       count=count+1; 
                    }
                if (count>1){
                    return arr[i];
                }
            
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
        System.out.println("Enter the array elements :-");
        int arr[]=new int[size];
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the array elements printed:-");
        for (int i=0;i<size;i++){
            System.out.print( arr[i]+"\t");
        }
        System.out.println("---------------------------------");
        System.out.println("Method call");
        firstrepeating obj=new firstrepeating();
        int result=obj.firstrepeatingval(arr, size);
        System.out.println("---------------------------------");
        System.out.println(result);
        sc.close();

    }
    
}
