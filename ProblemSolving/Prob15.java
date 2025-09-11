package ProblemSolving;
import java.util.*;

public class Prob15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=5;
        int factorial=1;
        for(int i=1;i<=num;i++){
            factorial=factorial*i;
        }
        System.out.println(factorial);



        sc.close();

    }
}
