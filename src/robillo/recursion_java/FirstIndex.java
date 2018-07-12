package robillo.recursion_java;

import java.util.Scanner;

public class FirstIndex {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        int x = in.nextInt();

        System.out.println(firstIndex(a, x));
    }

    public static int firstIndex(int input[], int x) {
        return firstIndexFind(input, x, 0);
    }

    public static int firstIndexFind(int[] a, int x, int n) {
        if(n == a.length) return -1;
        if(a[n] == x) return n;
        return firstIndexFind(a, x, n+1);
    }
}
