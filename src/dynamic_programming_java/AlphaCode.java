package dynamic_programming_java;

import java.util.*;

public class AlphaCode {

    /*
    Alice and Bob need to send secret messages to each other and are discussing ways to encode their messages:
    Alice: “Let’s just use a very simple code: We’ll assign ‘A’ the code word 1, ‘B’ will be 2, and so on down to ‘Z’ being assigned 26.”

    Bob: “That’s a stupid code, Alice. Suppose I send you the word ‘BEAN’ encoded as 25114. You could decode that in many different ways!”

    Alice: “Sure you could, but what words would you get? Other than ‘BEAN’, you’d get ‘BEAAD’, ‘YAAD’, ‘YAN’, ‘YKD’ and ‘BEKD’. I think you would be able to figure out the correct decoding. And why would you send me the word ‘BEAN’ anyway?”

    Bob: “OK, maybe that’s a bad example, but I bet you that if you got a string of length 5000 there would be tons of different decodings and with that many you would find at least two different ones that would make sense.”

    Alice: “How many different decodings?”

    Bob: “Jillions!”
    For some reason, Alice is still unconvinced by Bob’s argument, so she requires a program that will determine how many decodings there can be for a given string using her code.
    Input
    Input will consist of multiple input sets. Each set will consist of a single line of at most 5000 digits representing a valid encryption (for example, no line will begin with a 0). There will be no spaces between the digits. An input line of ‘0’ will terminate the input and should not be processed.
    Output
    For each input set, output the number of possible decodings for the input string. Print your answer taking modulo "10^9+7"
     */

    private static HashMap<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> strings = new ArrayList<>();
        String s = in.nextLine();
        strings.add(s);

        while (s != null && s.length() != 1 && s.charAt(0) != 0) {
            s = in.nextLine();
            strings.add(s);
        }

        strings.remove(strings.size()-1);

        for(String str : strings) {
            System.out.println(returnAlphaCodeCount(str));

//            int[] a = new int[str.length()];
//
//            for(int i=0; i<str.length(); i++)
//                a[i] = (int) str.charAt(i);
//
//            int[] arr = new int[str.length()+1];
//
//            System.out.println(numCodesNonDp(a, a.length));
        }
    }

    public static int numCodesNonDp(int[] a, int size) {
        if(size == 1) {
            return 1;
        }
        if(size == 0) {
            return 1;       //emply string
        }
        int output = numCodesNonDp(a, size - 1);     //reduce from last

        if(a[size-2] * 10 + a[size-1] <=26)
            output += numCodesNonDp(a, size - 2);

        return output;
    }

    public static int numCodesDp(int[] a, int size, int[] arr) {
        if(size == 1) {
            return 1;
        }
        if(size == 0) {
            return 1;       //emply string
        }

        if(arr[size] > 0)
            return arr[size];

        int output = numCodesDp(a, size - 1, arr);     //reduce from last

        if(a[size-2] * 10 + a[size-1] <=26)
            output += numCodesDp(a, size - 2, arr);

        arr[size] = output;
        return arr[size];
    }

    public static int numCodesDpIterative(int[] a, int size) {
        int[] op = new int[size+1];
        op[0] = 1;
        op[1] = 1;

        for(int i=2; i<size; i++) {
            op[i] = op[i-1];

            if(a[i-2]*10 + a[i-1] <= 26)
                op[i] += op[i-2];
        }

        return op[size-1];
    }

    public static int returnAlphaCodeCount(String s) {

        if(map.containsKey(s)) return map.get(s);

        if(s.length() == 0) {
            map.put(s, 0);
            return 0;
        }
        if(s.length() == 1) {
            if(s.charAt(0) <= 0) {
                map.put(s, 0);
                return 0;
            }
            else {
                map.put(s, 1);
                return 1;
            }
        }
        if(s.length() == 2) {
            if(s.substring(0, 1).equals("0") || s.substring(1, 2).equals("0")) {
                map.put(s, 0);
                return 0;
            }

            int count = 0;
            count+=returnAlphaCodeCount(s.substring(1));
            int sub = Integer.valueOf(s);
            if(sub > 0 && sub < 27) {
                map.put(s, count+1);
                return count+1;
            }
            else {
                map.put(s, count);
                return count;
            }
        }


        int subCount = 0;
        String subs = s.substring(0, 2);
        int sub = Integer.valueOf(subs);
        if(sub > 0 && sub < 27) {
            subCount+=returnAlphaCodeCount(s.substring(2));
        }
        else if (subs.substring(0, 1).equals("0") || subs.substring(1, 2).equals("0")) {
            map.put(s, 0);
            return 0;
        }

        //else
        subCount += returnAlphaCodeCount(s.substring(1));

        map.put(s, subCount);
        return subCount;
    }

}
