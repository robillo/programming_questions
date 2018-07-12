package robillo.recursion_java;

import java.util.Scanner;

public class ReplacePi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        replace(s);
    }

    public static String replace(String s){
        return replacePi(s, 0);
    }

    public static String replacePi(String s, int n) {
        if(n == s.length()-1) return s;

        if(s.substring(n, n+2).equals("pi")) {
            s = s.substring(0, n) + "3.14" + s.substring(n+2, s.length());
        }
        return replacePi(s, n+1);
    }
}
