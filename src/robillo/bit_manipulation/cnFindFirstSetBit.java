package robillo.bit_manipulation;

import java.util.Scanner;

public class cnFindFirstSetBit {

    /*You are given an integer N.
     You need to return an integer M,
     in which only one bit is set which at position of
     lowest set bit of N (from right to left).
    */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = 1;

        while ((n & m) == 0) {
            m = m<<1;
        }

        System.out.println(m);
    }
}
