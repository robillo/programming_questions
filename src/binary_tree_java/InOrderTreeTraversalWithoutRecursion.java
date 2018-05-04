package binary_tree_java;

import java.util.ArrayList;
import java.util.List;

public class InOrderTreeTraversalWithoutRecursion {

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

        System.out.println("Tree traversal:");

        inOrderTreeTraversal(tree.root);

    }

    private static void inOrderTreeTraversal(Node root) {
        Node currNode = root;
        Stack stack = new Stack(10);

        boolean isDone = false;

        do {
            if(currNode != null) {
                stack.push(currNode);
                currNode = currNode.left;
            }
            else {
                if (!stack.isEmpty()) {
                    currNode = stack.getTopValue();
                    stack.pop();
                    System.out.print(currNode.getValue() + " ");
                    currNode = currNode.right;
                }
                else {
                    isDone = true;
                }
            }
        } while (!isDone);

    }

    public static class Stack {

        int top;
        int capacity = 0; //to limit the number of elements to be inserted in the stack
        List<Node> stack = new ArrayList<>();

        Stack(int capacity) {
            this.capacity = capacity;
            top = -1;
        }

        void push(Node item) {
            if(isFull())
                return;
            stack.add(item);
            top++;
        }

        public void pop() {
            if(isEmpty())
                return;
            if(stack.size()>= top){
                stack.remove(top);
                top--;
            }
        }

        public int getTop() {
            return top;
        }

        public int getRear() {
            return stack.size()-1;
        }

        public Node getTopValue() { return stack.get(top); }

        private boolean isFull() {
            return (stack.size() == capacity);
        }

        public boolean isEmpty() { return (stack.size() == 0); }

        public Object[] getArrayValues() { return stack.toArray(); }

        public int getStackSize() {
            return stack.size();
        }
    }
}
