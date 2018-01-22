import java.util.Scanner;

public class DividingStringInNEqualParts {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String input = in.next();
        int n = in.nextInt();

        int size = input.length();
        int part_size = size/n;

        if(size%n!=0){
            System.out.println("String cannot be divided into equal parts");
        }
        else {
            for(int i=0; i<size; i++){
                if(i%part_size==0){
                    System.out.println(input.substring(i, i+part_size));
                }
            }
        }
    }
}
