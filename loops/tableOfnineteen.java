package loops;
import java.util.*;
public class tableOfnineteen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Wap to print table of 19");
        int number=19;
        for (int i=1;i<=10;i++){
            System.out.println(number+"  *  "+i+"  =  "+(number*i));
        }
        sc.close();
    }
    
}
