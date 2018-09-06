package robillo.patterns;

import java.util.Scanner;

public class PatternTwo {

    /*
    * ******* *
    ** ***** **
    *** *** ***
    **** * ****
    ***** *****
     */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        printPattern(n);
    }

    private static void printPattern(int n) {
        for(int i=0; i<n; i++) {
            printStarUpper(i);
            printSpace();
            printMiddle(i);
            printSpace();
            printStarUpper(i);
            System.out.println();
        }
    }
    private static void printStarUpper(int num) {
        for(int j=0; j<=num; j++) System.out.print("*");
    }

    private static void printSpace() {
        System.out.print(" ");
    }

    private static void printMiddle(int num) {
        for(int i= 2*(3-num); i>=0; i--) {
            System.out.print("*");
        }
    }
}
