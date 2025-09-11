package ProblemSolving;
import java.util.*;

public class Prob8A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();

        // Correct way to remove all whitespace characters
        str = str.replaceAll("\\s", "");
        HashMap<Character,Integer> freqmap=new HashMap<>();
        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if (freqmap.containsKey((char)arr[i])){
                freqmap.put((char)arr[i],freqmap.get((char)arr[i])+1);

            }
            else{
                freqmap.put((char)arr[i],1);
            }
        }

        for (char key : freqmap.keySet()) {
            System.out.println(key + " : " + freqmap.get(key));
        }

        
        sc.close();
        }
    }