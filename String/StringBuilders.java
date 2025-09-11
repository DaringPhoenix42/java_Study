package String;

// import java.util.*;

public class StringBuilders {
    public static void main(String[] args) {
        // Create StringBuilder
        StringBuilder s = new StringBuilder("Raghav");
        System.out.println("Original String: " + s);

        // 1. Append
        s.append(" Tiwari");
        System.out.println("After append: " + s);

        // 2. Insert
        s.insert(6, " Dhruv");
        System.out.println("After insert: " + s);

        // 3. Replace
        s.replace(0, 6, "Mr.");
        System.out.println("After replace: " + s);

        // 4. Delete
        s.delete(3, 10);
        System.out.println("After delete: " + s);

        // 5. Reverse
        s.reverse();
        System.out.println("After reverse: " + s);

        // 6. Set a character at index 2
        s.setCharAt(2, 'Z');
        System.out.println("After setCharAt: " + s);

        // 7. Print character at index 1
        System.out.println("Character at index 1: " + s.charAt(1));

        // 8. Show length and capacity
        System.out.println("Length: " + s.length());
        System.out.println("Capacity: " + s.capacity());
    }
}
