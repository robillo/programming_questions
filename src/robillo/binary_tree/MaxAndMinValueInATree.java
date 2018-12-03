package robillo.binary_tree;

public class MaxAndMinValueInATree {

    private static int max = -1, min = 100;

    public static void main(String[] args) {
        BinaryTree tree = BinaryTree.inflateSampleTree();

        computeMaxAndMin(tree.root);

        System.out.println("Max and Min values respectively are: " + max + " " + min);
    }

    private static void computeMaxAndMin(Node root) {
        if(root == null)
            return;

        if(root.getValue()>max)
            max = root.getValue();
        if(root.getValue()<min)
            min = root.getValue();

        computeMaxAndMin(root.left);
        computeMaxAndMin(root.right);
    }
}
