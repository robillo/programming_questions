package robillo.binary_tree;

public class CheckIfTreeBalanced {

    public static void main(String[] args) {
        BinaryTree tree = BinaryTree.inflateSampleTree();

        int diff = checkDiff(tree.root, 0);

        if(diff <= 1) System.out.println("TRUE");
        else System.out.println("FALSE");
    }

    private static int checkDiff(Node root, int level) {
        if(root == null) return level;
        if(root.left == null && root.right == null) return level;

        int a = checkDiff(root.left, level+1);
        int b = checkDiff(root.right, level+1);

        if(Math.abs(a-b) > 1) return Integer.MAX_VALUE;

        return Math.abs(a-b);
    }
}
