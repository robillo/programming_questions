package robillo.patterns;

import java.util.Scanner;

public class PatternSeven {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        printPattern(num);
    }

    private static void printPattern(int n) {
        for(int i=1; i<=n; i++)
            printUpper(i, n);

        for (int i=0; i<n-1; i++)
            printLower(i, n);
    }

    private static void printUpper(int row, int total) {

        int temp = total;

        for(int j=1; j<row; j++) {
            System.out.print(temp);
            temp--;
        }
        for(int j=row; j<=total; j++) {
            System.out.print(temp);
        }

        for(int j=row; j<total; j++) {
            System.out.print(temp);
        }
        for(int j=1; j<row; j++) {
            temp++;
            System.out.print(temp);
        }

        System.out.println();

    }

    private static void printLower(int row, int total) {

        int temp = total;

        for(int j=2; j<total-row; j++) {
            System.out.print(temp);
            temp--;
        }
        for(int j=total-row-1; j<=total; j++) {
            System.out.print(temp);
        }

        for(int j=total-row-1; j<total; j++) {
            System.out.print(temp);
        }
        for(int j=2; j<total-row; j++) {
            temp++;
            System.out.print(temp);
        }

        System.out.println();

    }
}
