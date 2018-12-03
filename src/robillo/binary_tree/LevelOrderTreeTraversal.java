package robillo.binary_tree;

public class LevelOrderTreeTraversal {

    public static void main(String[] args) {

        /*
                    1
                /       \
               2          3
             /   \       /  \
            4    5    null  null
           /     \
          6      null
         */

        BinaryTree tree = BinaryTree.inflateSampleTree();

        System.out.println("Tree traversal in same line:");
        traverseTreeInLevelOrder(tree);

        System.out.println();
        System.out.println();
        System.out.println("Tree traversal level by level:");

        traverseTreeInLevelOrderAnother(tree);
    }

    private static void traverseTreeInLevelOrder(BinaryTree tree) {
        Queue queue = new Queue(20);

        Node tempNode = tree.root;
        queue.enqueue(tempNode);

        while(!queue.isEmpty()){
            System.out.print(queue.getFrontNode().getValue() + " ");
            if(tempNode.left!=null) queue.enqueue(tempNode.left);
            if(tempNode.right!=null) queue.enqueue(tempNode.right);

            queue.dequeue();
            tempNode = queue.getFrontNode();
        }

    }
    private static void traverseTreeInLevelOrderAnother(BinaryTree tree) {
        Queue queue = new Queue(20);

        Node tempNode = tree.root;
        queue.enqueue(tempNode);

        while(!queue.isEmpty()){

            int size = queue.getSize();

            for(int i=0; i<size; i++) {
                System.out.print(queue.getFrontNode().getValue() + " ");

                if(tempNode.left!=null) queue.enqueue(tempNode.left);
                if(tempNode.right!=null) queue.enqueue(tempNode.right);

                queue.dequeue();
                tempNode = queue.getFrontNode();
            }

            System.out.println();
        }

    }
}
