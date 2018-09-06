package robillo.mauryasameer.trees_java;

public class TreeMain {

    public static void main(String[] agrs){

        BinaryNode<Integer> head= PrepareTree.prepare();
        PrintTree.print(head);

    }
}
