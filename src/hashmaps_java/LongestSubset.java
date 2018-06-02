package hashmaps_java;

import java.util.Scanner;

public class LongestSubset {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(max(a));
    }

    public static int max(int[] arr){
        int ones = 0;
        int zeroes = 0;
        int n = arr.length;
        for(int a : arr) {
            if(a == 0) zeroes++;
            else  ones++;
        }
        if(zeroes > ones) return 2*ones;
        else return 2*zeroes;
    }
}
