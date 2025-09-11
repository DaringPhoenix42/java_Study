import java.util.Scanner;

public class character_data {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declare a character and print it
        char ch = 'A';
        System.out.println("Default character: " + ch);

        // Taking character input from the user
        System.out.print("Enter a character: ");
        char ch2 = sc.next().charAt(0);   // ✅ Correct method

        System.out.println("You entered: " + ch2);

        sc.close();
    }
}
