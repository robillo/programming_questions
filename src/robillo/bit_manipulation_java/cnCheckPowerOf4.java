package robillo.bit_manipulation_java;

import java.util.Scanner;

public class cnCheckPowerOf4 {

    /*You are given an integer N.
    You need to check if it is power of four or not*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        /*normally we write code:
        while(n%2 == 0) {
            n = n/2;
        }
        if(n == 1) then divisible else not divisible
         */

        if ((n & 1) == 0) { //if n is a multiple of 2
            n = n>>1; //divide n by 2 (bitwise right operation)

            //second method based on fact that and of n and n-1 is always zero for numbers of power 2
            if(n <= 1 && (n & n-1) == 0) {
                System.out.println("power of four");
            }
            else {
                System.out.println("not power of four");
            }
        }
        else {
            System.out.println("not power of four");
        }

    }
}
