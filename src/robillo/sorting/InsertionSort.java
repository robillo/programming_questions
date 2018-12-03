package robillo.sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int array[] = {64, 34, 25, 12, 22, 11, 90};
        insertionSort(array);
        System.out.println("Sorted array is:");
        printArray(array);
    }

    private static void insertionSort(int[] array) {
        int n = array.length;
        for(int i=1; i<n ; ++i) {       //i starts from 1
            int key = array[i];
            int j = i-1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && array[j] > key)
            {
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = key;
        }
    }

    private static void printArray(int[] array) {
        for (int item : array) System.out.print(item + " ");
        System.out.println();
    }
}
