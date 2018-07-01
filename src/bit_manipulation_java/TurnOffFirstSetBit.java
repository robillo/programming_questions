package bit_manipulation_java;

import java.util.Scanner;

public class TurnOffFirstSetBit {

    /*You are given an integer N.
     You need to make first set bit of binary
     representation of N to 0 and return the updated N.
    */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int m = 1;
        while ((n & m) == 0) {
            m = m<<1;
        }

        m = ~m;
        n = n & m;

        System.out.println(n);
    }
}
