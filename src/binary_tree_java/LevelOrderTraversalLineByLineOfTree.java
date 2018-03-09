package binary_tree_java;

public class LevelOrderTraversalLineByLineOfTree {
    /* tree :
                    1
                /       \
               2          3
             /   \       /  \
            4    5    null  null
           /\     \
          6 null  null

          Line by line LOT should be:
          1
          2 3
          4 5
          6
    */

    public static void main(String[] args) {
        BinaryTree tree = BinaryTree.inflateSampleTree();

        traverseTreeInLevelOrderLineByLine(tree);
    }

    private static void traverseTreeInLevelOrderLineByLine(BinaryTree tree) {
        Queue queue = new Queue(20);

        Node tempNode = tree.root;
        queue.enqueue(tempNode);    //first node we insert so that queue is not empty when we enter the loop

        while (!queue.isEmpty()){

            int size = queue.getSize();

            for(int i=queue.getFront(); i<size; i++) {  //traverse only current level elements

                if(tempNode==null)
                    return;

                queue.dequeue();    //dequeue node to be printed
                System.out.print(tempNode.getValue() + " ");    //print value of element being dequeued
                queue.enqueue(tempNode.left);   //enqueue left and right children of the node that was dequeued
                queue.enqueue(tempNode.right);

                tempNode = queue.getFrontNode();
            }

            System.out.println();   //new line
        }

    }
}
