package robillo.binary_tree_java;

import java.util.HashMap;
import java.util.Scanner;

public class SecondMostFreqCharInString {

    //Overall complexity: O(n) + O(n) = O(n)

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        char[] input_char = input.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        //O(n)
        for (char anInput_char : input_char) {
            if (map.containsKey(anInput_char)) {
                map.put(anInput_char, map.get(anInput_char) + 1);
            } else {
                map.put(anInput_char, 1);
            }
        }
        Integer[] a = map.values().toArray(new Integer[map.size()]);
        int max = -1;
        int index = 0;
        int prevIndex = 0;

        //O(n)

        for(int i=0; i<map.size(); i++){
            if(a[i]>max){
                max = a[i];
                prevIndex = index;
                index = i;
            }
        }
        System.out.println("Second max frequent character is " + (map.keySet().toArray())[prevIndex]);
    }
}
