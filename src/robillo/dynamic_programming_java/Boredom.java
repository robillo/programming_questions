package robillo.dynamic_programming_java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Boredom {

    /*
        Gary is bored and wants to play an interesting but tough game .
        So he figured out a new board game called "destroy the neighbours" .
        In this game there are N integers on a board.
        In one move, he can pick any integer x from the board and then all the integers with value x+1 or x-1 gets destroyed .
        This move will give him x points.
        He plays the game until the board becomes empty .
        But as he want show this game to his friend Steven,
        he wants to learn techniques to maximise the points to show off .
        Can you help Gary in finding out the maximum points he receive grab from the game?
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++)
            a[i] = in.nextInt();

        System.out.println(solve(n, a));
    }

    public static int solve(int n, int A[]) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        int[] distinct = new int[A.length];

        for(int i=0; i<distinct.length; i++)
            distinct[i] = Integer.MAX_VALUE;

        //calculating frequency for all terms
        int pos = 0;
        for(int a : A) {
            frequency.merge(a, 1, (a1, b) -> a1 + b);
            if(frequency.get(a) == 1) {
                distinct[pos] = a;
                pos++;
            }
        }

        Arrays.sort(distinct);

        int sum = 0;
        int curr = -1;
        for(int i=1; i<pos; i++) {
            if(distinct[i] == curr+1) {
                distinct[i] = -1;   //and skip
            }
            else if(distinct[i-1] == distinct[i] - 1) {
                if(distinct[i-1]*frequency.get(distinct[i-1]) > distinct[i]*frequency.get(distinct[i])) {
                    curr = distinct[i-1];
                    sum += distinct[i-1]*frequency.get(distinct[i-1]);
                    distinct[i] = -1;
                }
                else {
                    curr = distinct[i];
                    sum += distinct[i]*frequency.get(distinct[i]);
                    distinct[i-1] = -1;
                }
            }
            else if(distinct[i-1] == -1) {
                curr = distinct[i];
                if(distinct[i] > 0) sum += distinct[i]*frequency.get(distinct[i]);
            }
            else {
                curr = distinct[i-1];
                sum += distinct[i-1]*frequency.get(distinct[i-1]);
            }
        }

        return sum;
    }
}
