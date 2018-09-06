package robillo.patterns;

import java.util.Scanner;

public class PatternFive {

    /*
        /\        /\        /\        /\
       /  \      /  \      /  \      /  \
      /    \    /    \    /    \    /    \
     /      \  /      \  /      \  /      \
    /        \/        \/        \/        \
     */

    public static void main(String[] args) {
        System.out.println();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printMountains(n);
    }

    private static void printMountains(int numRows) {
        for(int i=1; i<=numRows; i++) {
            printOneRow(numRows, i);
            printOneRow(numRows, i);
            printOneRow(numRows, i);
            printOneRow(numRows, i);
            System.out.println();
        }
    }

    private static void printOneRow(int numRows, int i) {
        for(int j=numRows-i; j>0; j--) {
            System.out.print(" ");
        }
        System.out.print("/");
        for(int j=2*i-2; j>0; j--) {
            System.out.print(" ");
        }
        System.out.print("\\");
        for(int j=numRows-i; j>0; j--) {
            System.out.print(" ");
        }
    }
}
