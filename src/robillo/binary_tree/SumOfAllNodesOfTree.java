package robillo.binary_tree;

public class SumOfAllNodesOfTree {

    /* sum of nodes: 1 + 2 + 3 + 4 + 5 + 6 = 21
                    1
                /       \
               2          3
             /   \       /  \
            4    5    null  null
           /     \
          6      null
    */

    static int sum = 0;

    public static void main(String[] args) {
        BinaryTree tree = BinaryTree.inflateSampleTree();

        calculateSum(tree.root);

        System.out.println("Sum of all nodes is: " + sum);
    }

    private static void calculateSum(Node root) {
        if(root == null)
            return;
        sum += root.getValue();
        calculateSum(root.left);
        calculateSum(root.right);
    }
}
