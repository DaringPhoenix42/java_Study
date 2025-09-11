package Arrays;
import java.util.Scanner;




public class more {
    int linearsearch(int arr1[],int val){
        int ans=-1;
        for (int i=0;i<arr1.length;i++){
            if (arr1[i]==val){
                ans=i;
                return ans;
            }
        }
        return ans;


    }

    void multiarray(){
        int array1[][]=new int[][]{
            {1,2,3},
            {1,2,3},
            {1,2,3}
        };
    
        int[][] array2= {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}};
        System.out.println("2D Array1 Elements1:");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("------------------------------");

          System.out.println("2D Array2 Elements---:");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("------------------------------");
    
}
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        sc.close();
        System.out.println("-------------------------------------");
        more obj=new more();
        obj.multiarray();
        int arr1[]={2,3,4,5,6,7,9};
        int check=3;
        int val=obj.linearsearch(arr1,check);
        System.out.println(val);
    }
}
