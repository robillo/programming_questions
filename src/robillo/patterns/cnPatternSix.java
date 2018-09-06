package robillo.patterns;

import java.util.Scanner;

public class cnPatternSix {

    public static void main(String[] args) {
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        printPattern(n);
    }

    private static void printPattern(int n) {
        for(int i=0; i<n; i++) {
            printLeftTriangle(i);
            printSpaces(i, n);
            printRightTriangle(i);
            System.out.println();
        }
    }

    private static void printLeftTriangle(int n) {
        for(int j=0; j<=n; j++) {
            System.out.print(j + 1);
        }
    }

    private static void printSpaces(int n, int total) {
        for(int j=0; j<2 * (total - n - 1); j++) {
            System.out.print(" ");
        }
    }

    private static void printRightTriangle(int n) {
        for(int j=n; j>=0; j--) {
            System.out.print(j + 1);
        }
    }
}