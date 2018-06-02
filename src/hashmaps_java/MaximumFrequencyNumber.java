package hashmaps_java;

import java.util.HashMap;
import java.util.Scanner;

public class MaximumFrequencyNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(maxFrequencyNumber(a));
    }

    public static int maxFrequencyNumber(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            if(map.get(arr[i]) == null)
                map.put(arr[i], 1);
            else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        int max = -1;
        int maxCountElement = -1;
        for(int i=0; i<arr.length; i++) {
            if(map.get(arr[i]) != null && max < map.get(arr[i])) {
                max = map.get(arr[i]);
                maxCountElement = arr[i];
            }
        }
        return maxCountElement;
    }
}
