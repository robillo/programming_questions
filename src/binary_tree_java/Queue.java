package binary_tree_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Queue {

    int front, rear, size;
    int capacity; //to limit the number of elements to be inserted in the queue
    List<Node> queue = new ArrayList<>();

    public Queue(int capacity) {
        this.capacity = capacity;
        front = size = 0;
        rear = -1;
    }

    public void enqueue(Node item) {
        if(isFull())
            return;
        rear++;
        size++;
        queue.add(rear, item);
    }

    public void dequeue() {
        if(isEmpty())
            return;
        queue.remove(front);
        rear--;
        size--;
    }

    int getFront() {
        return queue.get(front).getValue();
    }

    int getRear() {
        return queue.get(rear).getValue();
    }

    Node getFrontNode() {
        if (rear==-1) return null;
        return queue.get(rear);
    }

    Node getRearNode() {
        if (size==0) return null;
        return queue.get(rear);
    }

    private boolean isFull() {
        return (size == capacity);
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public int[] getArrayValues() {
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = queue.get(i).getValue();
        }
        return arr;
    }
}
