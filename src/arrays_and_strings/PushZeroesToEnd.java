package arrays_and_strings;

import java.util.Scanner;

public class PushZeroesToEnd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        pushZerosAtEnd(a);
        for(int i=0; i<n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void pushZerosAtEnd(int[] arr){
        int[] a2 = new int[arr.length];
        int index = 0;
        for (int i=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                a2[index] = arr[i];
                index++;
            }
        }
        for (int i=index; i<a2.length; i++) {
            a2[i] = 0;
        }
        System.arraycopy(a2, 0, arr, 0, arr.length);
    }
}
