package robillo.binary_tree;

public class HalfNodesBinaryTree {

    /* half nodes : ony one half node: 4 ;
                    1
                /       \
               2          3
             /   \       /  \
            4    5    null  null
           /\     \
          6 null  null
    */

    private static int numHalves = 0;

    public static void main(String[] args) {

        BinaryTree tree = BinaryTree.inflateSampleTree();

        traversePreorderAndCountHalves(tree.root);

        System.out.println("Number of half nodes in this tree: " + numHalves);
    }

    private static void traversePreorderAndCountHalves(Node root) {
        if(root==null)
            return;
        if((root.left == null && root.right != null) || (root.left != null && root.right == null)) //half node condition
            numHalves++;

        traversePreorderAndCountHalves(root.left);
        traversePreorderAndCountHalves(root.right);
    }
}
