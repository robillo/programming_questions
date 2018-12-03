package robillo.binary_tree;

import java.util.Scanner;

public class SumOfNodesAtKthLevelOfTree {
    /* tree : k = 2 (level = 2 => 2, 3); sumNodes : 2 + 3 = 5
                    1
                /       \
               2          3
             /   \       /  \
            4    5    null  null
           /\     \
          6 null  null
    */

    private static int sumNodes = 0;
    private static int level;

    public static void main(String[] args) {

        BinaryTree tree = BinaryTree.inflateSampleTree();

        Scanner in = new Scanner(System.in);
        level = in.nextInt();

        calculateSumKthLevelNodes(tree.root, 1);        //starting from root which is at level 1

        System.out.println("Sum of nodes at kth level from root is : " + sumNodes);
    }

    private static void calculateSumKthLevelNodes(Node node, int levelNumber) {
        if(node == null)
            return;

        if(levelNumber == level)
            sumNodes += node.getValue();

        calculateSumKthLevelNodes(node.left, levelNumber+1);
        calculateSumKthLevelNodes(node.right, levelNumber+1);
    }
}
