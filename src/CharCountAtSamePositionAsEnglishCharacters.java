import java.util.Scanner;

public class CharCountAtSamePositionAsEnglishCharacters {

    //complexity O(n)

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        int count = 0;
        char[] a = input.toCharArray();
        for(int i=0; i<a.length; i++){
            int temp = (int) a[i];
            if((temp>=97 && temp<=122) && ((temp-97)==i)){
                count++;
            }
            else if((temp>=65 && temp<=90) && ((temp-65)==i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
