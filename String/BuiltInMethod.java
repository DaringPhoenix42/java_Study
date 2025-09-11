package String;
import java.util.*;

public class BuiltInMethod {
    public static void main(String[] args) {
        String s = "Aprit Bansal";

        // 1. length() → Returns length of the string
        System.out.println("Length: " + s.length());  // 12

        // 2. charAt() → Returns char at index
        System.out.println("Char at index 3: " + s.charAt(3));  // i

        // 3. indexOf() → First occurrence of a char or substring
        System.out.println("Index of 'p': " + s.indexOf('p'));  // 1
        System.out.println("Index of \"Ban\": " + s.indexOf("Ban")); // 6

        // 4. lastIndexOf() → Last occurrence of char or substring
        System.out.println("Last index of 'a': " + s.lastIndexOf('a'));  // 10

        // 5. substring(beginIndex) → Returns substring from index to end
        System.out.println("Substring from index 6: " + s.substring(6));  // Bansal

        // 6. substring(begin, end) → Returns substring within range
        System.out.println("Substring(0,5): " + s.substring(0, 5));  // Aprit

        // 7. contains() → Check if substring exists
        System.out.println("Contains 'Ban'? " + s.contains("Ban"));  // true

        // 8. equals() vs equalsIgnoreCase()
        System.out.println("Equals 'Aprit'? " + s.equals("Aprit"));  // false
        System.out.println("EqualsIgnoreCase 'aprit bansal'? " + s.equalsIgnoreCase("aprit bansal")); // true

        // 9. compareTo() → Lexicographical comparison
        String s2 = "Aprit";
        System.out.println("CompareTo: " + s.compareTo(s2));  // positive → s > s2

        // 10. startsWith() / endsWith()
        System.out.println("Starts with 'Apr'? " + s.startsWith("Apr"));  // true
        System.out.println("Ends with 'sal'? " + s.endsWith("sal"));  // true

        // 11. toLowerCase() / toUpperCase()
        System.out.println("Lowercase: " + s.toLowerCase());
        System.out.println("Uppercase: " + s.toUpperCase());

        // 12. trim() → Removes leading & trailing spaces
        String spaced = "   Hello World   ";
        System.out.println("Trimmed: '" + spaced.trim() + "'");

        // 13. replace() → Replace char or substring
        System.out.println("Replace 'a' with '@': " + s.replace('a', '@'));

        // 14. replaceAll() with regex
        String digits = "My number is 12345";
        System.out.println("Remove digits: " + digits.replaceAll("[0-9]", "")); // My number is 

        // 15. split() → Split string by regex / space
        String names = "Alice,Bob,Charlie";
        String arr[] = names.split(",");
        System.out.println("Split by comma: " + Arrays.toString(arr)); // [Alice, Bob, Charlie]

        // 16. toCharArray() → Convert string to character array
        char ch[] = s.toCharArray();
        System.out.println("Char Array: " + Arrays.toString(ch));

        // 17. isEmpty() → Check if string is empty
        System.out.println("Is Empty: " + s.isEmpty());  // false

        // 18. join() → Join multiple strings
        String joined = String.join(" - ", "Java", "Python", "C++");
        System.out.println("Joined: " + joined);

        // 19. format() → Similar to printf
        String formatted = String.format("Name: %s, Age: %d", "Dhruv", 22);
        System.out.println("Formatted: " + formatted);

        // 20. matches() → Regex matching
        String email = "test@gmail.com";
        System.out.println("Valid email? " + email.matches("^[A-Za-z0-9+_.-]+@(.+)$")); // true

        // 21. repeat() → Repeat string N times (Java 11+)
        System.out.println("Repeat 3 times: " + "Ha".repeat(3));  // HaHaHa

        // 22. strip() → Removes extra spaces (Java 11+)
        String messy = "   Hello   ";
        System.out.println("Strip: '" + messy.strip() + "'");

        // 23. compareToIgnoreCase()
        System.out.println("Compare Ignore Case: " + "hello".compareToIgnoreCase("HELLO")); // 0

        // 24. valueOf() → Convert other data types to string
        int num = 123;
        String strNum = String.valueOf(num);
        System.out.println("Number to string: " + strNum);

        // 25. intern() → Ensures string from string pool
        String s3 = new String("Aprit").intern();
        System.out.println("Interned string: " + s3);
    }
}
