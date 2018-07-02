package arrays_and_strings_java;

import java.util.Scanner;

public class ReverseEachWord {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        System.out.print(reverseEachWord(s));
    }

    public static String reverseEachWord(String input) {
        StringBuilder s = new StringBuilder();
        String[] words = input.split(" ");
        for (String word : words) {
            StringBuilder s2 = new StringBuilder();
            s2.append(word);
            s2.reverse();
            s.append(s2.toString()).append(" ");
        }
        return s.toString();
    }
}
