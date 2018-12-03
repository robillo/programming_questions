package robillo.recursion;

import java.util.Scanner;

public class CheckNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        int x = in.nextInt();

        System.out.println(checkNumber(a, x));
    }

    public static boolean checkNumber(int input[], int x) {
        return checkNumberExists(input, x, input.length - 1);
    }

    public static boolean checkNumberExists(int[] a, int x, int n) {
        return n >= 1 && (a[n] == x || checkNumberExists(a, x, n - 1));
    }
}
