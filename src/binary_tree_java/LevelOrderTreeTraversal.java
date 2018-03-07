package binary_tree_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LevelOrderTreeTraversal {

    private static List<Integer> traversedItems = new ArrayList<>();

    public static void main(String[] args) {
        BinaryTree tree = BinaryTree.inflateSampleTree();

        traverseTreeInLevelOrder(tree);
    }

    private static void traverseTreeInLevelOrder(BinaryTree tree) {
        Queue queue = new Queue(20);

        Node tempNode = tree.root;
        queue.enqueue(tempNode);

        while(!queue.isEmpty()){
            System.out.println(queue.getFrontNode().getValue());
            if(tempNode.left!=null) queue.enqueue(tempNode.left);
            if(tempNode.right!=null) queue.enqueue(tempNode.right);

            queue.dequeue();
            tempNode = queue.getFrontNode();
        }

    }
}
