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
        int n = arr.length;
        int[] longest = new int[n];
        for(int i=0; i<n; i++) {
            int zeroes = 0, ones = 0;
            for(int j=i; j<n; j++) {
                if(arr[j] == 0) zeroes++;
                else ones++;
                if(zeroes == ones && 2*zeroes > longest[i]) longest[i] = 2*zeroes;
            }
        }
        int maxLength = 0;
        for(int i=0; i<n; i++) {
            if(maxLength < longest[i]) maxLength = longest[i];
        }
        return maxLength;
    }
}
