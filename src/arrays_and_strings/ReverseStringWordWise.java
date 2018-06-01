package arrays_and_strings;

import java.util.Scanner;

public class ReverseStringWordWise {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        System.out.print(reverseWordWise(s));
    }

    public static String reverseWordWise(String input) {
        StringBuilder s = new StringBuilder();
        String[] words = input.split(" ");
        for(int i=words.length-1; i>=0; i--) {
            s.append(words[i]).append(" ");
        }
        return s.toString();
    }
}
