package recursion_java;

import java.util.HashMap;
import java.util.Scanner;

public class ReturnKeypadStrings {

    static HashMap<Integer, String> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        map.put(1, "abc");
        map.put(2, "def");
        map.put(3, "ghi");
        map.put(4, "jkl");
        map.put(5, "mno");
        map.put(6, "pqrs");
        map.put(7, "tuv");
        map.put(8, "wxyz");

        keypad(n);
    }

    public static String[] keypad(int n){
        return null;
    }
}
