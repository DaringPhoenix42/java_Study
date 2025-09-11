// package CollectionsDemo;
package String;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();

        // 1. Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");
        System.out.println("Initial List: " + list);

        // 2. Adding element at a specific index
        list.add(2, "Grapes");
        System.out.println("After adding Grapes at index 2: " + list);

        // 3. Accessing elements
        System.out.println("Element at index 1: " + list.get(1));

        // 4. Modifying elements
        list.set(3, "Pineapple");
        System.out.println("After replacing element at index 3: " + list);

        // 5. Removing elements by index
        list.remove(2);
        System.out.println("After removing element at index 2: " + list);

        // 6. Removing elements by value
        list.remove("Orange");
        System.out.println("After removing 'Orange': " + list);

        // 7. Checking if element exists
        System.out.println("Contains 'Apple'? " + list.contains("Apple"));
        System.out.println("Contains 'Grapes'? " + list.contains("Grapes"));

        // 8. Getting the size of the ArrayList
        System.out.println("Size of ArrayList: " + list.size());

        // 9. Sorting the ArrayList
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        // 10. Iterating through ArrayList using for-each loop
        System.out.print("Iterating using for-each: ");
        for (String fruit : list) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 11. Iterating using an Iterator
        System.out.print("Iterating using Iterator: ");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 12. Iterating using forEach and lambda
        System.out.println("Iterating using forEach & lambda:");
        list.forEach(item -> System.out.println("Fruit: " + item));

        // 13. Clearing the ArrayList
        list.clear();
        System.out.println("After clearing, isEmpty? " + list.isEmpty());
    }
}
