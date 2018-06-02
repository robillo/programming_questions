package hashmaps_java;

import java.util.Scanner;

public class NearestRepetition {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(minDistance(a));
    }

    public static int minDistance(int[] arr){
        int min = arr.length;
        int n = arr.length;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(j!=i && arr[i] == arr[j]) {
                    if(min>Math.abs(i-j)) min = Math.abs(i-j);
                }
            }
        }
        return min;
    }
}
