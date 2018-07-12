package robillo.binary_tree_java;

import java.util.Scanner;

public class PrintNodesAtKthDistanceFromRoot {
    /* tree : k = 2 (distance from root = 2 => 0, 1, 2); print : 4 5
                    1
                /       \
               2          3
             /   \       /  \
            4    5    null  null
           /\     \
          6 null  null
    */

    private static int distance_k = 2;

    public static void main(String[] args) {

        BinaryTree tree = BinaryTree.inflateSampleTree();

        Scanner in = new Scanner(System.in);
        distance_k = in.nextInt();

        printKDistanceNodes(tree.root, distance_k);

        InorderTreeTraversal.inorderTraversal(tree.root);
    }

    private static void printKDistanceNodes(Node node, int levelNumber) {
        if(node == null)
            return;

        if(distance_k == levelNumber - 1)
            System.out.println(node.getValue());

        printKDistanceNodes(node.left, levelNumber+1);
        printKDistanceNodes(node.right, levelNumber+1);
    }
}

