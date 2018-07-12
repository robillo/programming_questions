package robillo.dynamic_programming_java;

import java.util.Scanner;

@SuppressWarnings("WeakerAccess")
public class MaximumSumSubArray {

    /*
        To find out maximum sum sub-array in a given int array
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++) a[i] = in.nextInt();

        System.out.println(retMaxSumSubArray(a));
    }

    public static int retMaxSumSubArray(int[] a) {
        int[] sum = new int[a.length];
        sum[0] = a[0];

        for(int i=1; i<a.length; i++) {
            sum[i] += a[i];
            if(sum[i-1] > 0) sum[i] += sum[i-1];
        }

        int max = sum[0];
        for(int item : sum) if(item > max) max = item;

        return max;
    }
}
