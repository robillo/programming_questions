package robillo.binary_tree_java;

import java.util.Scanner;

public class LongestSpanSameSumTwoBinaryArrays {

    static int[] a, b;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();

        a = new int[size];
        b = new int[size];

        for(int i=0; i<a.length; i++){
            a[i] = in.nextInt();
        }

        for(int i=0; i<b.length; i++){
            b[i] = in.nextInt();
        }

        //Naive solution (Complexity: O(n^2)
        int longest_span = 0;
        int span;
        for(int i=0; i<size; i++){
            if(a[i] == b[i]){
                span = 1;
            }
            else{
                continue;
            }
            int j = i+1;
            while (j<size && a[j] == b[j]){
                span++;
                j++;
            }
            if(longest_span < span) longest_span = span;
        }

        System.out.println("Longest span is: " + longest_span);
    }
}
