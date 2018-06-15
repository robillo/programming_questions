package recursion_java;

import java.util.HashMap;
import java.util.Scanner;

public class KeypadStringsTwo {

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

        printKeypad(n);
    }

    public static void printKeypad(int n){
        int size = 0;
        int temp = n;
        while (temp != 0) {
            size++;
            temp/=10;
        }
        keypad(n, size);
    }

    public static String[] keypad(int n, int req_size){
        if(n == 0) return null;
        int currentNum = n%10;
        n = n/10;
        String mappedString = map.get(currentNum);
        String[] recur = keypad(n, req_size);
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
        for(int i=0; i<updatedStrings.length; i++) {
            if(updatedStrings[i].length() == req_size) System.out.println(updatedStrings[i]);
        }
        return updatedStrings;
    }

}
