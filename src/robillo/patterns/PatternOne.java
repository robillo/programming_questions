package robillo.patterns;

import java.util.Scanner;

public class PatternOne {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int upper = n/2 + 1;
        int lower = n/2;

        for(int   i=1; i<=upper; i++) printStarUpper(i);
        for(int i=lower; i>0; i--) printStarLower(i);
    }

    private static void printStarUpper(int num) {
        for(int j=0; j<2*num-1; j++) System.out.print(" ");
        for(int j=0; j<num; j++) System.out.print("* ");
        System.out.println();
    }

    private static void printStarLower(int num) {
        for(int j=0; j<2*num-1; j++) System.out.print(" ");
        for(int j=0; j<num; j++) System.out.print("* ");
        System.out.println();
    }
}
