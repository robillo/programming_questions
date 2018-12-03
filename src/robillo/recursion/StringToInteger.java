package robillo.recursion;

import java.util.Scanner;

public class StringToInteger {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        System.out.println(convertStringToInt(s));
    }

    public static int convertStringToInt(String s){
        return funcStringToInt(s, 0);
    }

    public static int funcStringToInt(String s, int i) {
        if(s.length() == 0) return i;
        i = i * 10 + Integer.valueOf(s.substring(0, 1));
        return funcStringToInt(s.substring(1), i);
    }
}
