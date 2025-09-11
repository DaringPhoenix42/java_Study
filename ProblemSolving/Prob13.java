package ProblemSolving;
import java.util.*;
public class Prob13 {

    public static int [] optimal(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];

        // Clone and sort the array
        int arr2[] = arr.clone();
        Arrays.sort(arr2);

        HashMap<Integer,Integer> rankMap=new HashMap<>();
        int rank=1;
        for(int i=0;i<n;i++){
            if(!rankMap.containsKey(arr2[i])){
                rankMap.put(arr2[i],rank);
                rank++;
            }
        }

        for(int i=0;i<n;i++){
            ans[i]=rankMap.get(arr[i]);
        }
        printarray(ans);


        return ans;

    }


    public static void printarray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+'\t');
        }
    }

    public static int[] bruteapproach(int arr[]) {
        int n = arr.length;
        int ans[] = new int[n];

        // Clone and sort the array
        int arr2[] = arr.clone();
        Arrays.sort(arr2);

        // Assign ranks
        for (int i = 0; i < n; i++) {
            int val = arr[i];
            for (int j = 0; j < n; j++) {
                if (arr2[j] == val) {
                    ans[i] = j + 1;  // rank = position in sorted array + 1
                    break;           // break since we found the rank
                }
            }
        }
        return ans;
    }





    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size:-");
        int n=sc.nextInt();
        System.out.println("Enter the array:-");
        int arr[]=new int[n]; 
        for(int i=0;i<n;i++){
            System.out.println("Enter the array element"+i+'-');
            arr[i]=sc.nextInt();

        }
        int ans[]=optimal(arr);
        System.out.println(Arrays.toString(ans));


        sc.close();


    }
    
}
