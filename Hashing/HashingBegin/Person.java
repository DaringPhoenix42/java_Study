package Hashing.HashingBegin;

import java.util.HashMap;   // ✅ Importing HashMap

public class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        // ✅ Corrected HashMap usage
        HashMap<Person, String> map = new HashMap<>();

        // Creating Person objects
        Person p1 = new Person("Alice", 1);
        Person p2 = new Person("Bob", 2);
        Person p3 = new Person("Bob", 2);
        Person p4 = new Person("Alice", 1);


        // Adding data into the HashMap
        map.put(p1, "Developer");
        map.put(p2, "Designer");
        map.put(p3,"Manager");


        // Retrieving data from the HashMap
        System.out.println(p1.getName() + " → " + map.get(p1));
        System.out.println(p2.getName() + " → " + map.get(p2));
        System.out.println(p2.getName() + " → " + map.get(p3));
        System.out.println(p2.getName() + " → " + map.get(p4));
    }
}
