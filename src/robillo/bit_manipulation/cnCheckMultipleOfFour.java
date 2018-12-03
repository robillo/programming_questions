package robillo.bit_manipulation;

import java.util.Scanner;

public class cnCheckMultipleOfFour {

    /*You are given an integer N.
    You need to check if it is multiple of four or not*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        /*An interesting fact for n > 1 is, we do XOR of all numbers from 1 to n and if the result is equal to n,
          then n is a multiple of 4 else not.
        */

        int XOR = 0;
        for (int i = 1; i <= n; i++)
            XOR = XOR ^ i;

        if(XOR == n) {
            System.out.println("multiple of four");
        }
        else {
            System.out.println("not multiple of four");
        }

    }
}
