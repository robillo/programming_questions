package robillo.patterns;

import java.util.Scanner;

public class cnPatternNine {

    /*
            1
           23
          345
         4567
        56789
    */

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
            printSpaces(i, n);
            printLeftTriangle(i);
            System.out.println();
        }
    }

    private static void printSpaces(int n, int total) {
        for(int j=0; j<(total - n - 1); j++) {
            System.out.print(" ");
        }
    }

    private static void printLeftTriangle(int n) {
        for(int j=0; j<=n; j++) {
            System.out.print(n + j + 1);
        }
    }
}
