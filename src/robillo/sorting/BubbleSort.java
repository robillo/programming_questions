package robillo.sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int array[] = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(array);
        System.out.println("Sorted array is:");
        printArray(array);
    }

    private static void bubbleSort(int[] array) {
        int n = array.length;
        for(int i=0; i<n-1 ; i++) {         //leaving the last one, which will sort by itself
            for(int j=0; j<n-i-1; j++) {    //first it ends at second last, then third last, ...
                //swap
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
    }

    private static void printArray(int[] array) {
        int n = array.length;
        for (int item : array) System.out.print(item + " ");
        System.out.println();
    }
}
