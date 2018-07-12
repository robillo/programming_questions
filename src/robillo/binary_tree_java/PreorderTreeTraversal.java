package robillo.binary_tree_java;

import java.util.ArrayList;
import java.util.List;

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

        List<Integer> list = new ArrayList<>();

        preOrderAllPaths(tree.root, list, 0);

//        traversePreorder(tree.root);
    }

    private static void preOrderAllPaths(Node root, List<Integer> a, int pos) {
        if(root == null) return;

        a.add(pos, root.getValue());

        if(root.left == null && root.right == null) {
            int count = 0;
            for(Object item : a.toArray()) {
                System.out.print(item + " ");
                count++;
                if(count > pos) break;
            }
            System.out.println();
            return;
        }

        preOrderAllPaths(root.left, a, pos+1);
        preOrderAllPaths(root.right, a, pos+1);
    }

    private static void traversePreorder(Node root) {
        if(root==null)
            return;
        System.out.println(root.getValue());
        traversePreorder(root.left);
        traversePreorder(root.right);
    }
}
