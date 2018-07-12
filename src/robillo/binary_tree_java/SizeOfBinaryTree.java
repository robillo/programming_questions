package robillo.binary_tree_java;

public class SizeOfBinaryTree {

    //size of binary tree = nuber of nodes in tree = count of number of nodes incremented at traversal

    private static int nodeCount = 0;

    public static void main(String[] args) {

        BinaryTree tree = BinaryTree.inflateSampleTree();

        traversePreorderAndCountNodes(tree.root);

        System.out.println("Size of this tree: " + nodeCount);
    }

    private static void traversePreorderAndCountNodes(Node root) {
        if(root==null)
            return;

        nodeCount++;
        traversePreorderAndCountNodes(root.left);
        traversePreorderAndCountNodes(root.right);
    }
}
