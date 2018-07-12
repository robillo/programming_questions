package robillo.arrays_and_strings_java;

import java.util.HashMap;
import java.util.Scanner;

public class LargestUniqueSubstring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        System.out.print(findLargestUniqueSubstring(s));
    }

    public static String findLargestUniqueSubstring(String str){
        int loopCount = str.length();
        HashMap<Integer, Integer> indexMapSize = new HashMap<>();
        for(int i=0; i<loopCount; i++) {
            HashMap<Character, Integer> characterMapCount = new HashMap<>();
            int count = 0;
            for(int j=i; j<loopCount; j++) {
                if(characterMapCount.get(str.charAt(j)) == null) {
                    count++;
                    characterMapCount.put(str.charAt(j), 1);
                }
                else {
                    indexMapSize.putIfAbsent(i, count);
                    break;
                }
            }
            indexMapSize.putIfAbsent(i, count);
        }

        int index = 0;
        int max = 0;
        for(int i=0; i<loopCount; i++) {
            if(indexMapSize.get(i) != null && indexMapSize.get(i)>max) {
                max = indexMapSize.get(i);
                index = i;
            }
        }

        return str.substring(index, index+max);
    }
}
