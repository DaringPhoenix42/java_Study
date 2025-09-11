package String;
import java.util.Scanner;

public class CompareToString {

    // Function placeholder — you'll add your logic here later
    // static int compareStrings(String str1, String str2) {
    //     char arr1[]=str1.toCharArray();
    //     char arr2[]=str2.toCharArray();

    //     int n1=str1.length();
    //     int n2=str2.length();
    //     int i=0;
    //     int j=0;
    //     int result=0;
    //     while(i<n1 && j<n2){
    //         if(arr1[i]==arr2[i]){
    //             continue;
    //         }
    //         else{
    //              result=((int)arr1[i]-(int)arr2[j]);
    //              break;
    //         }
    //         i=i+1;
    //         j=j+1;

    //     }

    //     return result;


    // }


    static int compareStrings(String str1, String str2) {
    char arr1[] = str1.toCharArray();
    char arr2[] = str2.toCharArray();

    int n1 = str1.length();
    int n2 = str2.length();
    int i = 0;
    int j = 0;
    int result = 0;

    while (i < n1 && j < n2) {
        if (arr1[i] == arr2[j]) {
            i++;
            j++;
            continue;
        } else {
            result = (int) arr1[i] - (int) arr2[j];
            break;  
        }
    }

    if (result == 0) {
        result = n1 - n2;
    }

    return result;
}

public class CompareToString2 {

    static int compareStrings(String str1, String str2) {
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        int n1 = str1.length();
        int n2 = str2.length();

        int i = 0;
        while (i < n1 && i < n2) {
            if (arr1[i] != arr2[i]) {
                // Return difference of first mismatched characters
                return arr1[i] - arr2[i];
            }
            i++;
        }

        // If all compared characters are same, shorter string is "smaller"
        return n1 - n2;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking first string input
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        // Taking second string input
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Calling the comparison function
        int res=compareStrings(str1, str2);
        System.out.println(res);
        

        sc.close();
    }
}
}