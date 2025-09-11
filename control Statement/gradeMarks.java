import java.util.*;

public class gradeMarks {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the percentage :-");
        double percentage=sc.nextDouble();
        if (percentage>=90 && percentage<=100){
            System.out.println("Excellent");

        }
        else if (percentage>80 && percentage<=90){
            System.out.println("Very Good");

        }
        else if (percentage>70 && percentage<=80){
            System.out.println("Good");

        }
        else if (percentage>60 && percentage<=70){
            System.out.println("Can do better");

        }
        else if (percentage>50 && percentage<=60){
            System.out.println("Average");

        }
        else if (percentage>40 && percentage<=50){
            System.out.println("Below Average");

        }
        else{
            System.out.println("Fail");

        }
        sc.close();

    }
    
}
