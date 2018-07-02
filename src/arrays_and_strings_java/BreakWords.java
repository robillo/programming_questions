package arrays_and_strings_java;

import java.util.Scanner;

public class BreakWords {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        System.out.print(breakWords(s));
    }

    public static String breakWords(String input){
        StringBuilder builder = new StringBuilder();
        for(String s : input.trim().split(" ")) {
            if(s.length()%2 == 0 && s.length()>=4) {
                builder.append(s.substring(0, s.length()/2));
                builder.append(" ");
                builder.append(s.substring(s.length()/2, s.length()));
                builder.append(" ");
            }
            else {
                builder.append(s);
                builder.append(" ");
            }
        }
        return builder.toString();
    }
}
