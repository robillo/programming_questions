package test;

import java.util.HashMap;
import java.util.Scanner;

public class EqualSumPair {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<a.length; i++) {
            a[i] = in.nextInt();
        }

        System.out.println(findPairs(a));
    }

    public static boolean findPairs(int[] a){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<a.length; i++) {
            int p = a[i];
            for(int j=i+1; j<a.length; j++) {
                if(map.get(p + a[j]) != null) {
                    return true;
                }
                else {
                    map.put(p + a[j], p + a[j]);
                }
            }
        }
        return false;
    }
}
