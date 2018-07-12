package robillo.test_2;

import java.util.Arrays;
import java.util.Scanner;

public class StringsOfLengthK {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int k = in.nextInt();

        System.out.println(Arrays.toString(allStrings(s, k)));
    }

    public static String[] allStrings(String s, int k){
        int n = s.length();
        printAllKLengthRec(s.toCharArray(), "", n, k);
        return null;
    }

    static void printAllKLengthRec(char[] set, String prefix, int n, int k) {

        // Base case: k is 0,
        // print prefix
        if (k == 0) {
            System.out.println(prefix);
            return;
        }

        // One by one add all characters
        // from set and recursively
        // call for k equals to k-1
        for (int i = 0; i < n; ++i) {

            // Next character of input added
            String newPrefix = prefix + set[i];

            // k is decreased, because
            // we have added a new character
            printAllKLengthRec(set, newPrefix, n, k - 1);
        }
    }
}
