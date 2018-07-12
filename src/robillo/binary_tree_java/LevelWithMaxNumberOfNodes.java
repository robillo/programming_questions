package robillo.binary_tree_java;

public class LevelWithMaxNumberOfNodes {

    private static int levelWithMaxNodes = 0;
    private static int countMaxLevelNodes = 0;

    private static int levelNumber = 0;

    public static void main(String[] args) {

        BinaryTree tree = BinaryTree.inflateSampleTree();

        computeLevelWithMaxNodes(tree.root);

        System.out.println("Level with max number of nodes is " + levelWithMaxNodes);
    }

    private static void computeLevelWithMaxNodes(Node root) {
        Queue queue = new Queue(20);

        Node tempNode = root;
        queue.enqueue(tempNode);    //first node we insert so that queue is not empty when we enter the loop

        while (!queue.isEmpty()) {

            int countLevelNodes = queue.getSize();

            if(countLevelNodes >countMaxLevelNodes) {
                countMaxLevelNodes = countLevelNodes;
                levelWithMaxNodes = levelNumber;
            }

            for(int i = queue.getFront(); i < countLevelNodes; i++) {

                if(tempNode==null)
                    return;

                queue.dequeue();    //dequeue node to be printed

                queue.enqueue(tempNode.left);   //enqueue left and right children of the node that was dequeued
                queue.enqueue(tempNode.right);

                tempNode = queue.getFrontNode();
            }

            levelNumber ++;
        }
    }
}
