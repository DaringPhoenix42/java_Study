import java.util.*;

public class sidesOfTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of the triangle:");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        // Check triangle inequality theorem
        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
            System.out.println("Yes, a valid triangle can be formed.");
        } else {
            System.out.println("No, a valid triangle cannot be formed.");
        }

        sc.close();
    }
}
