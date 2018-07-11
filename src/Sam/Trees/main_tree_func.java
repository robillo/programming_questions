package Sam.Trees;

import java.security.PublicKey;
import java.util.Scanner;

public class main_tree_func {
        static void main(String[] agrs){
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        binary_node node= new binary_node(data);
        prepare_tree prep = new prepare(node);
        print_tree printT = new print_tree();
        printT.print(prep);


    }
}
