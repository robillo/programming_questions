package robillo.dynamic_programming;

import java.util.Scanner;

@SuppressWarnings("WeakerAccess")
public class LongestIncreasingSubsequence {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] lis = new int[n];

        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
            lis[i] = 1;
        }

        System.out.println(lis(a, lis));
    }

    public static int lis(int[] a, int[] lis) {
        for(int i=1; i<a.length; i++) {
            int j=0;
            while (j<i) {
                if(a[j] < a[i]) lis[i] = Math.max(lis[i], lis[j]+1);
                j++;
            }
        }

        int max = 1;

        for(int num : lis)
            if(num > max) max = num;

        return max;
    }
}
