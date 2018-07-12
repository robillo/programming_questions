package robillo.arrays_and_strings_java;

import java.util.HashMap;
import java.util.Scanner;

public class CheckPermutation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();

        System.out.print(isPermutation(s1, s2));
    }

    private static boolean isPermutation(String s1, String s2) {
        HashMap<Character, Integer> firstMap = new HashMap<>();
        HashMap<Character, Integer> secondMap = new HashMap<>();

        for(int i=0; i<s1.length(); i++) {
            if(firstMap.get(s1.charAt(i)) == null) firstMap.put(s1.charAt(i), 1);
            else                                   firstMap.put(s1.charAt(i), firstMap.get(s1.charAt(i)) + 1);
            if(secondMap.get(s2.charAt(i)) == null) secondMap.put(s2.charAt(i), 1);
                                                    else secondMap.put(s2.charAt(i), secondMap.get(s2.charAt(i)) + 1);
        }

        boolean isPerm = true;
        for(int i=0; i<s1.length(); i++) {
            if(!(firstMap.containsKey(s1.charAt(i)) && secondMap.containsKey(s1.charAt(i)))) {
                isPerm = false;
            }
        }
        return isPerm;
    }
}
