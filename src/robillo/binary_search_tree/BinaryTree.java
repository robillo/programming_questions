package robillo.binary_search_tree;

public class BinaryTree {

    public Node root;

    private BinaryTree() {
        root = null;
    }

    private BinaryTree(int n) {

    }

    public static void main(String[] args) {
        BinaryTree tree = inflateSampleTree();

        //print
        System.out.println(tree.root.getValue());
        System.out.println(tree.root.left.getValue());
        System.out.println(tree.root.right.getValue());
    }

    static BinaryTree inflateSampleTree() {
        BinaryTree tree = new BinaryTree();

        //zero level
        tree.root = new Node(5);
        /* following is the tree after above statement
              5
            /   \
          null  null*/

        //first level
        tree.root.left = new Node(4);
        tree.root.right = new Node(6);
        /* 2 and 3 become left and right children of 1
               5
             /    \
            4       6
          /    \    /  \
        null null null null*/

        //second level
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(3);

        /* 4 and 5 becomes left and right children of 2 resp.
                    5
                /       \
               4          6
             /   \       /  \
            2    3    null  null
           /     \
          null      null
         */

        return tree;
    }

    public Node getRoot() {
        return root;
    }
}
