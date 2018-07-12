package robillo.hashmaps_java;

import java.util.HashMap;
import java.util.Scanner;

public class PairWithDifferenceK {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        int k = in.nextInt();

        findPairsDifferenceK(a, k);
    }

    public static void findPairsDifferenceK(int[] input, int k){
        int n = input.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> valueCount = new HashMap<>();
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(j!=i) {
                    if(Math.abs(input[i] - input[j]) == k) {
                        map.put(input[i], input[j]);
                        if(valueCount.get(input[i]) == null) {
                            valueCount.put(input[i], 1);
                        }
                        else {
                            valueCount.put(input[i], valueCount.get(input[i]) + 1);
                        }
                    }
                }
            }
        }
        Object[] linear = map.keySet().toArray();
        Object[] reverse = new Object[map.size()];
        for(int i=0; i<linear.length; i++) {
            reverse[i] = linear[linear.length-i-1];
        }
        for(Object val : reverse) {
            if(map.get((int)val) != null) {
                int p = valueCount.get((int)val);
                for(int i=0; i<(p+1)/2; i++) {
                    if((Integer) val < map.get(val))
                        System.out.println(val + " " + map.get(val));
                    else
                        System.out.println(map.get(val) + " " + val);
                }
                map.remove(map.get((int)val), val);
            }
        }
    }
}
