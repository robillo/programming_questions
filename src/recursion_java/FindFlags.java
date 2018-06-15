package recursion_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindFlags {

    static char A = 'W', B = 'B', C = 'R';
    static int num;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        System.out.println(find_Ways(num));
    }

    public static long find_Ways(int n) {
        String[] list = findWays(n);
        if(list != null) return list.length;
        else return 0;
    }

    public static String[] findWays(int n) {
        if(n == 0) return null;

        String[] prevArray = findWays(n - 1);

        String[] newArray;

        if(prevArray == null) {
            newArray = new String[2];
            newArray[0] = A + "";
//            newArray[1] = B + "";  //Blue strip can't be placed at start
            newArray[1] = C + "";
        }
        else {
            List<String> mList = new ArrayList<>();
            for (String aPrevArray : prevArray) {
                char c = aPrevArray.charAt(aPrevArray.length() - 1);
                if (c == A) {
                    if(n != num) mList.add(aPrevArray + B); //blue can't be at last
                    mList.add(aPrevArray + C);
                } else if (c == B) {
                    if(aPrevArray.charAt(aPrevArray.length()-2) == A) mList.add(aPrevArray + C);
                    else mList.add(aPrevArray + A);
                } else if (c == C) {
                    mList.add(aPrevArray + A);
                    if(n != num) mList.add(aPrevArray + B); //blue can't be at last
                }
            }
            newArray = new String[mList.size()];
            for(int i=0; i<mList.size(); i++) {
                newArray[i] = mList.get(i);
            }
        }
        return newArray;
    }
}
