package String;
import java.util.*;

public class substring {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        sc.close();

        String str="Dhru";
        int n=str.length();
        int total = n * (n + 1) / 2;
        String arr[]=new String[total];
        int index=0;
        for(int i=0;i<n;i++){

             for (int j = i + 1; j <= n; j++) {
                arr[index] = str.substring(i, j);
                index=index+1;
             }
        }
        System.out.print(Arrays.toString(arr));
        System.out.println("____________________________");


        for(int i=0;i<n;i++){

             for (int j = i + 1; j <= n; j++) {
                System.out.print(str.substring(i, j)+"\t");
                
             }
        }

        }


    }
    

