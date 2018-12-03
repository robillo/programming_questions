package robillo.recursion;

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        System.out.println(removeConsecutiveDuplicates(s));
    }

    public static String removeConsecutiveDuplicates(String s) {
        return removeDups(s);
    }

    public static String removeDups(String s) {
        if ( s.length() <= 1 ) return s;
        if( s.substring(1,2).equals(s.substring(0,1)) ) return removeDups(s.substring(1));
        else return s.substring(0,1) + removeDups(s.substring(1));
    }
}
