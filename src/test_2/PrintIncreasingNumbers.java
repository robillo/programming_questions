package test_2;

import java.util.Scanner;

public class PrintIncreasingNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        printIncreasingNumber(n);
    }

    public static void printIncreasingNumber(int n) {
        findStrictlyIncreasingNum(0, " ", n);
    }

    private static void findStrictlyIncreasingNum(int start, String out, int n) {
        // If number becomes N-digit, print it
        if (n == 0) {
            System.out.print(out.replaceFirst("^0+", ""));
            return;
        }

        // start from (prev digit + 1) till 9
        for (int i = start; i <= 9; i++) {
            // append current digit to number
            String str = out + Integer.toString(i);

            // recurse for next digit
            findStrictlyIncreasingNum(i + 1, str, n - 1);
        }
    }
}
