package robillo.recursion_java;

import java.util.Arrays;
import java.util.Scanner;

public class AllIndices {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        int x = in.nextInt();

        System.out.println(Arrays.toString(allIndices(a, x)));
    }

    public static int[] allIndices(int input[], int x) {
        int[] t = new int[input.length];
        for(int i=0; i<t.length; i++) {
            t[i] = -1;
        }
        return findAllIndices(input, x, 0, t, 0);
    }

    public static int[] findAllIndices(int[] a, int x, int n, int[] t, int count) {
        if(n == a.length) {
            int index = 0;
            for(int i=0; i<t.length; i++) {
                if(t[i] == -1) {
                    index = i;
                    break;
                }
            }
            int[] p = new int[index];
            System.arraycopy( t, 0, p, 0, index );

            return p;
        }
        if(a[n] == x) {
            t[count] = n;
            count++;
        }
        return findAllIndices(a, x, n+1, t, count);
    }
}
