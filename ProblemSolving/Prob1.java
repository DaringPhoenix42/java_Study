package ProblemSolving;

import java.util.*;

public class Prob1 {

    public static int reverseUsingString(int number) {
    String numStr = Integer.toString(Math.abs(number));
    String reversedStr = new StringBuilder(numStr).reverse().toString();
    return Integer.parseInt(reversedStr);
}


    static int[] wayOne(int number) {
        int count = 0;
        int numberc = Math.abs(number);

        int temp = numberc;
        while (temp > 0) {
            temp /= 10;
            count++;
        }

        int[] array = new int[count];
        int i = 0;
        while (numberc > 0) {
            int digit = numberc % 10;  // last digit
            array[i++] = digit;        // store in array
            numberc /= 10;             // remove last digit
        }

        System.out.println("Digits in reverse order:");
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
        }
        System.out.println();

        return array;  // Return reversed digits
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer number to be reversed:");
        int number = sc.nextInt();
        System.out.println("Input number: " + number);

        int[] reversedDigits = wayOne(number);

        // If you want to convert reversed digits back to a number:
        StringBuilder sb = new StringBuilder();
        for (int d : reversedDigits) {
            sb.append(d);
        }
        int reversedNumber = Integer.parseInt(sb.toString());
        System.out.println("Reversed number constructed from digits: " + reversedNumber);

        sc.close();
    }
}