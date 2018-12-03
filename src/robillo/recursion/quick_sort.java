package robillo.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class quick_sort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }

        quickSort(a);

        System.out.println(Arrays.toString(a));
    }

    public static void quickSort(int[] input) {
        quickSortRecursive(input, 0, input.length-1);
    }

    public static void quickSortRecursive(int[] a, int si, int fi) {
        if(si < fi) {
            int c = partition(a, si, fi);
            quickSortRecursive(a, si, c-1);
            quickSortRecursive(a, c+1, fi);
        }
    }

    static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
}
