package robillo.test_2;

import java.util.Scanner;

public class PrintParenthesis {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        printWellFormedParanthesis(n);
    }

    public static void printWellFormedParanthesis(int n){

        // Write your code here
        char[] str = new char[2*n];
        if(n > 0) _printParenthesis(str, 0, n, 0, 0);
    }

    private static void _printParenthesis(char str[], int pos, int n, int open, int close) {
        if(close == n) {
            // print the possible combinations
            for (char aStr : str) System.out.print(aStr);
            System.out.println();
//            return;
        }
        else {
            if(open > close) {
                str[pos] = '}';
                _printParenthesis(str, pos+1, n, open, close+1);
            }
            if(open < n) {
                str[pos] = '{';
                _printParenthesis(str, pos+1, n, open+1, close);
            }
        }
    }
}
