package ProblemSolving;
import java.util.*;

public class Prob11 {



    public static char [] nonRepeatingCharacterOptimal(String str){

        HashMap<Character, Integer> freqMap = new HashMap<>();
        for(char ch:str.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (freqMap.get(ch) == 1) {
                sb.append(ch);
            }
        }


        return sb.toString().toCharArray();
    }

    public static char [] nonRepeatingCharacterBrute(String str){
        StringBuilder sb1=new StringBuilder(str);
        System.out.println(sb1);
        int count=0;
        StringBuilder sb2 = new StringBuilder();
        for(int i=0;i<sb1.length();i++){
            char ch=sb1.charAt(i);
            count=0;
            for(int j=0;j<sb1.length();j++){
                char c1=sb1.charAt(j);
                if(c1==ch){
                    count++;

                }
            }
            if (count==1){
                sb2.append(ch);

            }
        }

        return sb2.toString().toCharArray();
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the charecter:-");
        String str=sc.nextLine();
        char[] bruteResult = nonRepeatingCharacterBrute(str);
        System.out.println("Non-repeating characters (Brute): " + Arrays.toString(bruteResult));

        // Optimal result
        char[] optimalResult = nonRepeatingCharacterOptimal(str);
        System.out.println("Non-repeating characters (Optimal): " + Arrays.toString(optimalResult));








        sc.close();

    }
    
}
