package arrays_and_strings;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicateInArray {

    /*
     Given an array of integers of size n which contains numbers from 0 to n - 2.
     Each number is present at least once.
     That is, if n = 5, numbers from 0 to 3 is present in the given array at least once and one number is present twice.
     You need to find and return that duplicate number present in the array.
     Assume, duplicate number is always present in the array.
     Line 1 : Size of input array
     Line 2 : Array elements (separated by space)
    */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        System.out.println("Input integers between 0 and " + (n-2));
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(duplicate(a));
    }

    public static int duplicate(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();    //create a map with key as element and value as count of this element
        for(int i=0; i<arr.length; i++) {
            map.put(arr[i], map.get(arr[i])==null ? 1 : map.get(arr[i])+1);     //increment count of element at this position
        }
        for(int i=0; i<arr.length; i++) {
            //check if count on an element is equal to two (duplicate element)
            if(map.get(arr[i]) == 2) {
                return arr[i];
            }
        }
		return -1;
    }
}
