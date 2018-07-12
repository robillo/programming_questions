package robillo.binary_tree_java;

public class ReplaceNodeWithDepthInBinaryTree {

    /* initial tree
                    1
                /       \
               2          3
             /   \       /  \
            4    5    null  null
           /\     \
          6 null  null
    */
    /* replaced tree inorder traversal : 4 3 2 3 1 2
                    1
                /       \
               2          2
             /   \       /  \
            3    3    null  null
           /\     \
          4 null  null
    */

    private static int levelNumber = 1;

    public static void main(String[] args) {

        BinaryTree tree = BinaryTree.inflateSampleTree();

        createReplacedTree(tree.root, levelNumber);

        InorderTreeTraversal.inorderTraversal(tree.root);
    }

    private static void createReplacedTree(Node node, int levelNumber) {
        if(node == null)
            return;

        node.setValue(levelNumber);

        createReplacedTree(node.left, levelNumber+1);
        createReplacedTree(node.right, levelNumber+1);
    }
}
