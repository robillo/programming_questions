package test;

import java.util.HashMap;
import java.util.Scanner;

public class FindSmallestSubstring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String large = in.nextLine();
        String small = in.nextLine();

        System.out.println(findMinSubstringContainingString(large, small));
    }

    public static String findMinSubstringContainingString(String large, String small){
        String smallest = null;
        HashMap<Character, Integer> smallMap = new HashMap<>();
        int count = 0;
        for(char c : small.toCharArray()) {
            count++;
            smallMap.merge(c, 1, (a, b) -> a + b);
        }

        for(int i=0; i<large.length(); i++) {

            if(smallMap.get(large.charAt(i)) != null) {
                for(int j = i; j < large.length(); j++) {
                    String s = large.substring(i, j);

                    HashMap<Character, Integer> mapCopy = new HashMap<>(smallMap);

                    int secondCount = 0;

                    for(char c : s.toCharArray()) {
                        if(mapCopy.get(c) != null && mapCopy.get(c) != 0) {
                            mapCopy.put(c, mapCopy.get(c) - 1);
                            secondCount++;
                        }
                    }

                    if(secondCount == count) {
                        if(smallest == null || smallest.length() > s.length()) smallest = s;
                    }
                }
            }
        }
        return smallest;
    }
}
