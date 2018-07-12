package Sam.Trees;

import java.security.PublicKey;
import java.util.Scanner;

public class main_tree_func {
        public static void main(String[] agrs){

        prepare_tree prep = new prepare_tree();
        binary_node<Integer> head=prep.prepare();
        print_tree printT = new print_tree();
        printT.print(head);


    }
}
