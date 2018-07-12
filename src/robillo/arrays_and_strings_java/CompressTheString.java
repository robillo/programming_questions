package robillo.arrays_and_strings_java;

import java.util.Scanner;

public class CompressTheString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        System.out.print(compress(s));
    }

    public static String compress(String inputString) {
        StringBuilder builder = new StringBuilder();
        char referenceChar = inputString.charAt(0);
        int referenceCharCount = 1;
        for(int i=1; i<inputString.length(); i++) {
            if(inputString.charAt(i) == referenceChar) {
                referenceCharCount++;
            }
            else {
                builder.append(referenceChar);
                if(referenceCharCount>1) builder.append(referenceCharCount);
                referenceChar = inputString.charAt(i);
                referenceCharCount = 1;
            }
        }
        if(referenceCharCount == 1)
            builder.append(referenceChar);
        return builder.toString();
    }
}
