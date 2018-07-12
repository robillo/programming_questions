package robillo.binary_tree_java;

import java.util.Scanner;

public class CountWordsInString {

    //complexity : O(n) (looping through string only once)

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        int word_count = 0;

        int i=0;
        while (i<(input.length()-1)){
            int c = input.charAt(i);
            int c2 = input.charAt(i+1);

            if(((65<=c && c<=90)||(97<=c && c<=122)) && (c2==' ' || c2=='\n' || c2=='\t')){
                word_count++;
            }
            i++;
        }

        //if last letter is not spaced
        int c = input.charAt(input.length()-1);
        if((65<=c && c<=90)||(97<=c && c<=122)) word_count++;


        System.out.println("No. of words in string are: " + word_count);
    }
}
