package robillo.recursion_java;

import java.util.Scanner;

public class CheckPallindrome {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        System.out.println(isStringPalindrome(s));
    }

    public static boolean isStringPalindrome(String input) {
        return checkPalindrome(input, 0, input.length()-1);
    }

    public static boolean checkPalindrome(String s, int start, int end) {
        if(start == end || start > end) return true;
        if(s.charAt(start) == s.charAt(end)) {
            start++;
            end--;
            return checkPalindrome(s, start, end);
        }
        else {
            return false;
        }
    }
}
