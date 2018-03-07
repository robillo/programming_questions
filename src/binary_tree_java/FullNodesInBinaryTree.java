package binary_tree_java;

public class FullNodesInBinaryTree {
    /* full nodes : 1, 2 (count = 2) ;
                    1
                /       \
               2          3
             /   \       /  \
            4    5    null  null
           /\     \
          6 null  null
    */

    private static int numFullNodes = 0;

    public static void main(String[] args) {

        BinaryTree tree = BinaryTree.inflateSampleTree();

        traversePreorderAndCountHalves(tree.root);

        System.out.println("Number of full nodes in this tree: " + numFullNodes);
    }

    private static void traversePreorderAndCountHalves(Node root) {
        if(root==null)
            return;
        if(root.left != null && root.right != null) //full node condition
            numFullNodes++;

        traversePreorderAndCountHalves(root.left);
        traversePreorderAndCountHalves(root.right);
    }
}
