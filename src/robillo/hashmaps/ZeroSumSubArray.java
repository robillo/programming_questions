package robillo.hashmaps;

import java.util.Scanner;

public class ZeroSumSubArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(subarraySumTo0(a));
    }

    public static boolean subarraySumTo0(int[] input) {
        int n = input.length;
        for(int i=0; i<n; i++) {
            int sum = 0;
            for(int j=i; j<n; j++) {
                sum += input[j];
                if(sum == 0) return true;
            }
        }
        return false;
    }
}
