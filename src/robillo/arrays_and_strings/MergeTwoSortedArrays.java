package robillo.arrays_and_strings;

import java.util.Scanner;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int[] arr1 = new int[m];
        for(int i=0; i<m; i++) {
            arr1[i] = in.nextInt();
        }

        int n = in.nextInt();
        int[] arr2 = new int[n];
        for(int i=0; i<n; i++) {
            arr2[i] = in.nextInt();
        }

        int[] res = merge(arr1, arr2);
        for (int re : res) {
            System.out.print(re + " ");
        }
    }

    public static int[] merge(int arr1[], int arr2[]) {
        int m = arr1.length-1;
        int n = arr2.length-1;
        int[] merge = new int[arr1.length + arr2.length];
        int m0 = 0, n0 = 0, count = 0;
        while (m0<=m && n0<=n) {
            if(arr1[m0] <= arr2[n0]) {
                merge[count] = arr1[m0];
                m0++;
            }
            else if(arr1[m0] > arr2[n0]) {
                merge[count] = arr2[n0];
                n0++;
            }
            count++;
        }
        if(m0<=m) {
            while (m0<=m) {
                merge[count] = arr1[m0];
                m0++;
                count++;
            }
        }
        else if(n0<=n) {
            while (n0<=n) {
                merge[count] = arr2[n0];
                n0++;
                count++;
            }
        }
        return merge;
    }
}
