package robillo.hashmaps_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LongestConsecutiveSubsequence {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(longestSubsequence(a));
    }

    public static ArrayList<Integer> longestSubsequence(int[] arr){
        int[] oldArray = new int[arr.length];
        System.arraycopy(arr, 0, oldArray, 0, arr.length);
        Arrays.sort(arr);
        int finalCount = 0, finalIndex = 0;
        for(int i=0; i<arr.length; i++) {
            int count = 1;
            int index = i;
            int temp = arr[i];
            for(int j=i+1; j<arr.length; j++) {
                if(temp == arr[j] - 1) {
                    count++;
                    i++;
                    temp = arr[j];
                }
            }
            if(finalCount < count) {
                finalCount = count;
                finalIndex = index;
            }
        }
        List<Integer> list = new ArrayList<>();
        if(finalCount == 1) {
            List<Integer> mList = new ArrayList<>();
            mList.add(oldArray[0]);
            return (ArrayList<Integer>) mList;
        }
        for(int i = finalIndex; i<finalIndex + finalCount; i++) {
            list.add(arr[i]);
        }
        return (ArrayList<Integer>) list;
    }
}
