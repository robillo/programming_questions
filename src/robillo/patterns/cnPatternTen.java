package robillo.patterns;

import java.util.Scanner;

public class cnPatternTen {

    /*     1
          232
         34543
        4567654
       567898765
    */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        printPattern(num);
    }

    private static void printPattern(int n) {
        for(int i=1; i<=n; i++) {
            printSpace(n-i);
            printLeft(i);
            System.out.println();
        }
    }

    private static void printSpace(int n) {
        for(int i=1; i<=n; i++) {
            System.out.print(" ");
        }
    }

    private static void printLeft(int n) {
        int val = n;
        for(int i=1; i<=n; i++) {
            System.out.print(String.valueOf(val++));
        }
        printRight(n, val-2);
    }

    private static void printRight(int n, int val) {
        for(int i=n; i>1; i--) {
            System.out.print(String.valueOf(val--));
        }
    }
}
