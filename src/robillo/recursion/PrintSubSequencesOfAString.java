package robillo.recursion;

import java.util.Scanner;

public class PrintSubSequencesOfAString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        printSubSequences(s, "");
    }

    public static void printSubSequences(String input, String output) {
        if(input.length() == 0) {
            System.out.println(output);
            return;
        }

        printSubSequences(input.substring(1), output);
        printSubSequences(input.substring(1), output + input.charAt(0));
    }
}
