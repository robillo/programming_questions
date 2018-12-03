package robillo.dynamic_programming;

import java.util.Scanner;

public class LootHouses {

    /*
        A thief wants to loot houses.
        He knows the amount of money in each house. He cannot loot two consecutive houses.
        Find the maximum amount of money he can loot.
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++) a[i] = in.nextInt();

        System.out.println(getMaxMoney(a, n));
    }

    public static int getMaxMoney(int arr[], int n){
        int[] sumFromLast = new int[arr.length];

        for(int i=n-1; i>=0; i-=2)
            sumFromLast[i]+=arr[i];

        for(int i=n-2; i>=0; i-=2)
            sumFromLast[i]+=arr[i];

        int sum = 0;

        if(n == 0) return arr[0];

        for(int i=0; i<n-2; i+=2) {
            if(sumFromLast[i] > sumFromLast[i+1]) sum+=sumFromLast[i];
            else {
                sum+=sumFromLast[i+1];
                i++;
            }
        }

        return sum;
    }

    public static int maxLoot(int hval[], int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return hval[0];
        if (n == 2)
            return Math.max(hval[0], hval[1]);

        // dp[i] represent the maximum value stolen
        // so far after reaching house i.
        int[] dp = new int[n];

        // Initialize the dp[0] and dp[1]
        dp[0] = hval[0];
        dp[1] = Math.max(hval[0], hval[1]);

        // Fill remaining positions
        for (int i = 2; i<n; i++)
            dp[i] = Math.max(hval[i] + dp[i-2], dp[i-1]);

        return dp[n-1];
    }
}
