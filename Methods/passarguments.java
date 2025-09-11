package Methods;

public class passarguments {
    public static void greet(String name,int age){
        System.out.println("Good Morning "+name+"Your age is "+age);
    }
    public static void sum(int a, int b){
        System.out.println(a+b);
    }

    public static int subtract(int a, int b){
        // System.out.println(a-b);
        int val=a-b;
        return val;
    }
    public static void main(String[] args){
        greet("Dhruv",21);
        sum(5,10);
        int result=subtract(19, 12);
        System.out.println("Subtract fun output returned"+result);

    }
}


