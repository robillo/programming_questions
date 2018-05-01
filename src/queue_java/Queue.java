package queue_java;

import java.util.ArrayList;
import java.util.List;

public class Queue {

    int front;
    int capacity = 0; //to limit the number of elements to be inserted in the queue
    List<Integer> queue = new ArrayList<>();

    public Queue(int capacity) {
        this.capacity = capacity;
        front = -1;
    }

    public void enqueue(int item) {
        if(isFull())
            return;
        queue.add(0, item);
        front++;
    }

    public void dequeue() {
        if(isEmpty())
            return;
        if(queue.size()>=front){
            queue.remove(front);
            front--;
        }
    }

    public int getFront() {
        return front;
    }

    public int getRear() {
        return queue.size()-1;
    }

    public int getFrontNode() { return queue.get(front); }

    public int getRearNode() { return queue.get(queue.size()-1); }

    private boolean isFull() {
        return (queue.size() == capacity);
    }

    public boolean isEmpty() { return (queue.size() == 0); }

    public Object[] getArrayValues() { return queue.toArray(); }

    public int getQueueSize() {
        return queue.size();
    }
}
