package robillo.recursion_java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ReturnKeypadStrings {

    static HashMap<Integer, String> map = new HashMap<>();

    static {
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(Arrays.toString(keypad(n)));
    }

    public static String[] keypad(int n){
        if(n == 0) return null;
        int currentNum = n%10;
        n = n/10;
        String mappedString = map.get(currentNum);
        String[] recur = keypad(n);
        int size;
        if(recur == null) {
            size = mappedString.length();
        }
        else {
            size = mappedString.length() * recur.length;
        }
        String[] updatedStrings = new String[size];
        if(recur == null) {
            for(int i=0; i<mappedString.length(); i++) {
                updatedStrings[i] = mappedString.charAt(i) + "";
            }
        }
        else {
            int count = 0;
            for(int i=0; i<recur.length; i++) {
                String temp = recur[i];
                for (char item : mappedString.toCharArray()) {
                    updatedStrings[count] = temp + (item + "");
                    count++;
                }
            }
        }
        return updatedStrings;
    }

}
