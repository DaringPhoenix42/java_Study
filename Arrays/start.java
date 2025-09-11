package Arrays;
import java.util.*;
public class start {

    public static void demoarray2(){
        System.out.println("-------------------------------");
        int array6[]=new int[3];
        array6[0]=4;
        array6[1]=4;
        array6[2]=4;

        System.out.println(array6);

        String  names[]={"sri","Aryan","Ankit"};
        System.out.println("-------------------------------");
        System.out.println("Inside the demoarray function with stai c declaration");

        for (int i=0;i<=names.length-1;i++){
            System.out.println(names[i]);
        }
        System.out.println("-------------------------------");

    }
    void demoarray(){
        String  names[]={"Dhruv","SHlok","Apruv"};
        System.out.println("-------------------------------");
        System.out.println("Inside the demoarray function without stai c declaration");

        for (int i=0;i<=names.length-1;i++){
            System.out.println(names[i]);
        }
        System.out.println("-------------------------------");
    }
    public static void main(String[]  args){
        Scanner sc=new Scanner(System.in);
        sc.close();
        int ages[];
        ages = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println("-------------------------------");
        System.out.println("Inside the psvm");
        for (int i=0;i<=ages.length-1;i++)
        {
            System.out.print(ages[i]+"\t");


        }
        System.out.println("-------------------------------");
        start obj=new start();
        obj.demoarray();
        demoarray2();


    }

}
