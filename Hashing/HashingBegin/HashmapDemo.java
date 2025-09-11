package Hashing.HashingBegin;
import java.util.*;
public class HashmapDemo {
    public static void main(String[] args){
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Dhruv");
        map.put(2,"Apurva");
        map.put(3,"Shlok");
        map.put(4,"Sri");
        map.put(5,"Aryan");
        System.out.println(map);
        String student=map.get(3);
        System.out.println(student);
        String std=map.get(39);
        System.out.println(std);
        System.out.println(map.containsKey(4));
        System.out.println(map.containsValue("Dhruv"));

        // Set<Integer> keys=map.keySet();
        // for(int i:keys){
        //     System.out.println(i);
        // }
        for(int i:map.keySet()){
            System.out.print(i+"\t");
        }

      Set<Map.Entry<Integer, String>> entries = map.entrySet();
    System.out.println();
    for (Map.Entry<Integer, String> entry : entries) {
    System.out.println(entry.getKey() + " : " + entry.getValue());
    }
    map.remove(4);
    System.out.println(map);
    boolean check=map.remove(31,"Nitin");
    System.out.println(check);



    }
}
