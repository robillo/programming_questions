package robillo.patterns;

import java.util.Scanner;

public class PatternThree {

    /*
          *
         ***
        *****
         ***
          *
     */


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        printPattern(n);
    }

    private static void printPattern(int n) {

        for(int i=0; i<3; i++) {
            for(int j=n-i; j>0; j--) {
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<=n; i++) {
            System.out.print(" ");
            for(int j=0; j<=i; j++) {
                System.out.print(" ");
            }
            for(int j=n-i-1; j>0; j--) {
                System.out.print("*");
            }
            for(int j=n-i-2; j>0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
