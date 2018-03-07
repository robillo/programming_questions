package binary_tree_java;

public class InorderTreeTraversal {

    /* Traversal will be (left right root) : 6 4 2 5 1 3
                    1
                /       \
               2          3
             /   \       /  \
            4    5    null  null
           / \    \
          6  null  null
    */

    public static void main(String[] args) {
        BinaryTree tree = BinaryTree.inflateSampleTree();

        inorderTraversal(tree.root);
    }

    public static void inorderTraversal(Node root) {
        if(root == null)
            return;
        inorderTraversal(root.left);
        System.out.println(root.getValue());
        inorderTraversal(root.right);
    }
}
