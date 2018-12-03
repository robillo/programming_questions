package robillo.sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int array[] = {64, 34, 25, 12, 22, 11, 90};
        selectionSort(array);
        System.out.println("Sorted array is:");
        printArray(array);
    }

    private static void selectionSort(int[] array) {
        int n = array.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (array[j] < array[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    private static void printArray(int[] array) {
        for (int item : array) System.out.print(item + " ");
        System.out.println();
    }
}
