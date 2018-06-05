package recursion_java;

import java.util.Scanner;

public class ReplaceCharacter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char c1 = in.next().charAt(0);
        char c2 = in.next().charAt(0);

        System.out.println(replaceCharacter(s, c1, c2));
    }

    public static String replaceCharacter(String input, char c1, char c2) {
        return replaceCharacterOccurence(input, c1, c2, input.length()-1);
    }

    public static String replaceCharacterOccurence(String s, char c1, char c2, int n) {
        if(s.charAt(n) == c1) {
            char[] temp = s.toCharArray();
            temp[n] = c2;
            s = String.valueOf(temp);
        }
        if(n == 0) return s;
        return replaceCharacterOccurence(s, c1, c2, n-1);
    }
}
