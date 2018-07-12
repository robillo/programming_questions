package robillo.recursion_java;

import java.util.Scanner;

public class SumOfArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }

        System.out.println(sum(a));
    }

    public static int sum(int input[]) {

        int len = input.length - 1;
        return sumArray(input, len);
    }

    public static int sumArray(int[] a, int n) {
        if(n < 0) return 0;
        return a[n] + sumArray(a, n-1);
    }
}
