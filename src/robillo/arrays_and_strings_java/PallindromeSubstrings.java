package robillo.arrays_and_strings_java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PallindromeSubstrings {

    static final int MAX = 256;

    // Returns factorial of n
    static long fact(int n)
    {
        long res = 1;

        for (int i = 2; i <= n; i++)
            res = res * i;

        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        System.out.print(countPalindromeSubstrings(s));
    }

    private static int countPalindromeSubstrings(String s) {
        int count = 0;
        int unique = 0;
        HashMap<Character, Integer> characterCountHashMap = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            if(characterCountHashMap.get(s.charAt(i)) == null) {
                characterCountHashMap.put(s.charAt(i), 1);
                unique++;
            }
            else {
                characterCountHashMap.put(s.charAt(i), characterCountHashMap.get(s.charAt(i)) + 1);
            }
            count++;
        }

        int otherCount = countSubstrings(s);
        int extras = count - unique;

        return otherCount + count - unique;
    }


    public static int countSubstrings(String s) {
        //map<string, int> m;
        TreeMap<String , Integer> m = new TreeMap<>();
        int n = s.length();

        // table for storing results (2 rows for odd-
        // and even-length palindromes
        int[][] R = new int[2][n+1];

        // Find all sub-string palindromes from the
        // given input string insert 'guards' to
        // iterate easily over s
        s = "@" + s + "#";

        for (int j = 0; j <= 1; j++)
        {
            int rp = 0;   // length of 'palindrome radius'
            R[j][0] = 0;

            int i = 1;
            while (i <= n)
            {
                //  Attempt to expand palindrome centered
                // at i
                while (s.charAt(i - rp - 1) == s.charAt(i +
                        j + rp))
                    rp++;  // Incrementing the length of
                // palindromic radius as and
                // when we find vaid palindrome

                // Assigning the found palindromic length
                // to odd/even length array
                R[j][i] = rp;
                int k = 1;
                while ((R[j][i - k] != rp - k) && (k < rp))
                {
                    R[j][i + k] = Math.min(R[j][i - k],
                            rp - k);
                    k++;
                }
                rp = Math.max(rp - k,0);
                i += k;
            }
        }

        // remove 'guards'
        s = s.substring(1, s.length()-1);

        // Put all obtained palindromes in a hash map to
        // find only distinct palindromess
        m.put(s.substring(0,1), 1);
        for (int i = 1; i < n; i++)
        {
            for (int j = 0; j <= 1; j++)
                for (int rp = R[j][i]; rp > 0; rp--)
                    m.put(s.substring(i - rp - 1,  i - rp - 1
                            + 2 * rp + j), 1);
            m.put(s.substring(i, i + 1), 1);
        }

        // printing all distinct palindromes from
        // hash map
//        System.out.println("Below are " + (m.size())
//                + " palindrome sub-strings");

        int count = 0;

        for (Map.Entry<String, Integer> ii:m.entrySet()) {
            count++;
//            System.out.println(ii.getKey());
        }
        return count;
    }
}
