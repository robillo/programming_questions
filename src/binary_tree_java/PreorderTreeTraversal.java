package binary_tree_java;

public class PreorderTreeTraversal {

    /* Traversal will be (left right root) : 1 2 4 6 7 3
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

        traversePreorder(tree.root);
    }

    private static void traversePreorder(Node root) {
        if(root==null)
            return;
        System.out.println(root.getValue());
        traversePreorder(root.left);
        traversePreorder(root.right);
    }
}
