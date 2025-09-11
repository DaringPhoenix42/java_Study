package Hashing.HashingBegin;
// import java.util.*;
public class Hash {
    public static void main(String[] args) {
        // Testing our simple hash function
        String key = "Hello";
        System.out.println("Hash value for \"" + key + "\": " + simpleHash(key));

        key = "Java";
        System.out.println("Hash value for \"" + key + "\": " + simpleHash(key));

        key = "HashMap";
        System.out.println("Hash value for \"" + key + "\": " + simpleHash(key));
    }

    // Simple hash function
    public static int simpleHash(String key) {
        int sum = 0;

        // Convert each character to ASCII and add
        for (char c : key.toCharArray()) {
            sum += (int) c; // casting character to integer (ASCII value)
        }

        // Return sum modulo 10 to keep hash values between 0-9
        return sum % 10;
    }
}
