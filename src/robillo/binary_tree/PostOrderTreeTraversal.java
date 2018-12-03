package robillo.binary_tree;

public class PostOrderTreeTraversal {

    /* Traversal will be (left right root) : 6 4 5 2 3 1
                    1
                /       \
               2          3
             /   \       /  \
            4    5    null  null
           /     \
          6      null
    */

    public static void main(String[] args) {
        BinaryTree tree = BinaryTree.inflateSampleTree();

        postorderTraversal(tree.root);
    }

    private static void postorderTraversal(Node root) {
        if (root == null)
            return;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.println(root.getValue());
    }
}
