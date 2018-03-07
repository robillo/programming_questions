package binary_tree_java;

public class LeafNodesBinaryTree {

    /* leaves : 6 5 3 ; num leaves: 1 + 1 + 1 = 3
                    1
                /       \
               2          3
             /   \       /  \
            4    5    null  null
           /     \
          6      null
    */

    private static int numLeaves = 0;

    public static void main(String[] args) {

        BinaryTree tree = BinaryTree.inflateSampleTree();

        traversePreorderAndCountLeaves(tree.root);

        System.out.println("Number of leaves in this tree: " + numLeaves);
    }

    private static void traversePreorderAndCountLeaves(Node root) {
        if(root==null)
            return;
        if(root.left == null && root.right == null) //leaf node condition
            numLeaves++;

        traversePreorderAndCountLeaves(root.left);
        traversePreorderAndCountLeaves(root.right);
    }
}
