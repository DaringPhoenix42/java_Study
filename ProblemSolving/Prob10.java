package ProblemSolving;
import java.util.*;
public class Prob10 {

    public static void leapYear(int year){
        // boolean LeapYear=false;
        if (year%400==0){
            System.out.println(year+" is a Leap Year ");

        }
        else if(year % 4 == 0 && year % 100 != 0){
            System.out.println(year+" is a Leap Year ");

        }
        else{
            System.out.println(year+" is not a Leap Year ");
        }

    }


    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year to be checked:-");
        int yr=sc.nextInt();
        leapYear(yr);
        sc.close();



    }
    
}
