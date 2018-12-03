package robillo.arrays_and_strings;

import java.util.Arrays;
import java.util.Scanner;

public class CountPlatforms {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] a = new int[n];
        int[] d = new int[n];

        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }

        for(int i=0; i<n; i++) {
            d[i] = in.nextInt();
        }

        System.out.print(platformsNeeded(a, d));
    }

    public static int platformsNeeded(int arr[], int dep[]){
        int n = arr.length;
        // Sort arrival and departure arrays
        Arrays.sort(arr);
        Arrays.sort(dep);

        // plat_needed indicates number of platforms
        // needed at a time
        int plat_needed = 1, result = 1;
        int i = 1, j = 0;

        // Similar to merge in merge sort to process
        // all events in sorted order
        while (i < n && j < n)
        {
            // If next event in sorted order is arrival,
            // increment count of platforms needed
            if (arr[i] <= dep[j])
            {
                plat_needed++;
                i++;

                // Update result if needed
                if (plat_needed > result)
                    result = plat_needed;
            }

            // Else decrement count of platforms needed
            else
            {
                plat_needed--;
                j++;
            }
        }

        return result;
    }
}
