package robillo.arrays_and_strings;

import java.util.Scanner;

public class Sort012 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        sort012(a);
        for(int i=0; i<n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void sort012(int[] arr){
        int zeroes = 0, ones = 0, twos = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 0) zeroes++;
            else if(arr[i] == 1) ones++;
            else twos++;
        }
        for(int i=0; i<zeroes; i++) {
            arr[i] = 0;
        }
        for(int i=zeroes; i<zeroes + ones; i++) {
            arr[i] = 1;
        }
        for(int i=zeroes + ones; i<zeroes + ones + twos; i++) {
            arr[i] = 2;
        }
    }
}
