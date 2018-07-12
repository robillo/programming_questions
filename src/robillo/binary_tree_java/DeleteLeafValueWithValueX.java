package robillo.binary_tree_java;

import java.util.Scanner;

public class DeleteLeafValueWithValueX {

    /* let leaf = 3 => value to be deleted (lead) = 3
                    1
                /       \
               2          3 <= to be deleted
             /   \       /  \
            4    5    null  null
           /     \
          6      null
    */

    private static int numLeaves = 0;
    private static int valueX;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        valueX = in.nextInt();

        BinaryTree tree = BinaryTree.inflateSampleTree();

        traversePreorderAndDeleteLeafX(tree.root);

    }

    private static void traversePreorderAndDeleteLeafX(Node root) {
        if(root==null)
            return;
        if(root.left == null && root.right == null && root.getValue() == valueX) {
            //leaf node condition
            System.out.println("deleted value is: " + root.getValue());
            root = null;
            return;
        }

        traversePreorderAndDeleteLeafX(root.left);
        traversePreorderAndDeleteLeafX(root.right);
    }
}
