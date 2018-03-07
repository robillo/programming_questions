package binary_tree_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Queue {

    int front;
    int capacity = 0; //to limit the number of elements to be inserted in the queue
    List<Node> queue = new ArrayList<>();

    public Queue(int capacity) {
        this.capacity = capacity;
        front = 0;
    }

    public void enqueue(Node item) {
        if(isFull())
            return;
        queue.add(queue.size(), item);
    }

    public void dequeue() {
        if(isEmpty())
            return;
        if(queue.size()>front){
            Integer val = queue.remove(front).getValue();
            if(val==0){
                front++;
            }
        }
    }

    int getFront() {
        return front;
    }

    int getRear() {
        return queue.size()-1;
    }

    Node getFrontNode() {
        if(queue.size()>0) return queue.get(front);
        else return null;
    }

    Node getRearNode() {
        return queue.get(queue.size()-1);
    }

    private boolean isFull() {
        return (queue.size() == capacity);
    }

    public boolean isEmpty() {
        return (queue.size() == 0);
    }

    public Object[] getArrayValues() {
        return queue.toArray();
    }
}
