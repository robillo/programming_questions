package hashmaps_java;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class PairSumToZero {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }

        pairSum(a, n);
    }

    public static void pairSum(int[] input, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> valueCount = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    if (input[i] + input[j] == 0) {
                        map.put(input[i], input[j]);
                        if (valueCount.get(input[i]) == null) {
                            valueCount.put(input[i], 1);
                        } else {
                            valueCount.put(input[i], valueCount.get(input[i]) + 1);
                        }
                    }
                }
            }
        }
        Set<Integer> keySet = map.keySet();
        for (Object val : keySet.toArray()) {
            if (map.get((int)val) != null) {
                int p = valueCount.get((int)val) / 2;
                for (int i = 0; i <= p; i++) {
                    if ((Integer) val < map.get(val))
                        System.out.println(val + " " + map.get(val));
                    else
                        System.out.println(map.get(val) + " " + val);
                }
                map.remove(map.get((int)val), val);
            }
        }
    }
}
