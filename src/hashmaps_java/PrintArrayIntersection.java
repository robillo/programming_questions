package hashmaps_java;

import java.util.HashMap;
import java.util.Scanner;

public class PrintArrayIntersection {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int[] a = new int[m];
        for(int i=0; i<m; i++) {
            a[i] = in.nextInt();
        }
        int n = in.nextInt();
        int[] b = new int[n];
        for(int i=0; i<n; i++) {
            b[i] = in.nextInt();
        }

        intersection(a, b);
    }

    public static void intersection(int[] arr1, int[] arr2){
        HashMap<Integer, Integer> firstCountMap = new HashMap<>();
        HashMap<Integer, Integer> secondCountMap = new HashMap<>();
        for (int anArr11 : arr1) {
            firstCountMap.merge(anArr11, 1, (a, b) -> a + b);
        }
        for (int anArr21 : arr2) {
            secondCountMap.merge(anArr21, 1, (a, b) -> a + b);
        }
        if(arr1.length > arr2.length)
            for (int anArr2 : arr2) {
                if (firstCountMap.get(anArr2) != null)
                    System.out.println(anArr2);
            }
        else
            for (int anArr1 : arr1) {
                if (secondCountMap.get(anArr1) != null)
                    System.out.println(anArr1);
            }
    }
}
