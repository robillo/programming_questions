package robillo.bit_manipulation;

import java.util.Scanner;

public class cnCheckEvenOrOdd {

    /*You are given an integer N.
    You need to check if it is odd or even*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int testNum = 1; // 00000001

        testNum = testNum & n;  //at 0th position, & operation will always make result bit 0

        if(testNum == 1) {
            System.out.println("odd number");
        }
        else {
            System.out.println("even number");
        }
    }
}
