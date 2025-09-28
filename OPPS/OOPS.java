package OPPS;
// import java.util.*;


class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing Something ");
    }

    public void print(){
        System.out.println(this.color+" "+this.type);
    }

}

class Student{

    String name;
    int age;

    // public void printInfo(){

    //     System.out.println(this.age);
    //     System.out.println(this.name);

    // }

    // Student(){
    //     System.out.println("---");
    // }

    // Student(String name,int age){
    //     this.name=name;
    //     this.age=age;

    // }

    // //copy constructor
    // Student (Student s2){
    //     this.name=s2.name;
    //     this.age=s2.age;
    // }

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(int age, String name){
        System.out.println(name+" "+age);
    }

}


public class OOPS {
    

    public static void main(String[] args){
        // System.out.println("_____________________");
        // Pen p1=new Pen();
        // p1.color="Red";
        // p1.type="Gel";
        // p1.write();
        // p1.print();
        // System.out.println("_____________________");
        // Pen p2=new Pen();
        // p2.color="Blue";
        // p2.type="Red";
        // p2.write();
        // p2.print();
        // System.out.println("_____________________");
        // Student s1=new Student("DhruvTiwari",21);
        // s1.age=21;
        // s1.name="Dhruv Tiwari";
        // s1.printInfo();
    //     System.out.println("_____________________");

    //     Student s1 = new Student("Rahul", 22);
    //     Student s2 = new Student(s1); // Copy constructor

    //     System.out.println(s2.name); // Rahul
    //     System.out.println(s2.age);  // 22
    //     System.out.println("_____________________");
        Student s1=new Student();
        s1.name="Aryan";
        s1.age=24;

        s1.printInfo(s1.age);
        s1.printInfo(s1.name);
        s1.printInfo(s1.age, s1.name);


        
    }
    
}
