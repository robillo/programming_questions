package robillo.bit_manipulation_java;

import java.util.Scanner;

public class CheckPowerOf2 {

    /*You are given an integer N.
    You need to check if it is power of two or not*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        /*normally we write code:
        while(n%2 == 0) {
            n = n/2;
        }
        if(n == 1) then divisible else not divisible
         */

        while ((n & 1) == 0) {
            n = n>>1; //divide n by 2 (bitwise right operation)
        }

        if(n == 1) {
            System.out.println("power of two");
        }
        else {
            System.out.println("not power of two");
        }

        //second method based on fact that and of n and n-1 is always zero for numbers of power 2
        if((n & n-1) == 0) {
            System.out.println("power of two");
        }
        else {
            System.out.println("not power of two");
        }
    }
}
