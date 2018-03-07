package queue_java;

import java.util.ArrayList;
import java.util.List;

public class Queue {

    int front, rear, size;
    int capacity = 0; //to limit the number of elements to be inserted in the queue
    List<Integer> queue = new ArrayList<>();

    public Queue(int capacity) {
        this.capacity = capacity;
        size = 0;
        rear = -1;
        front = 0;
    }

    public void enqueue(int item) {
        if(isFull())
            return;
        if(queue.size()>rear){
            rear++;
            size++;
            queue.add(rear, item);
        }
        else {
            rear++;
            size++;
            queue.add(queue.size(), item);
        }
    }

    public void dequeue() {
        if(isEmpty())
            return;
        if(queue.size()>front){
            Integer val = queue.remove(front);
            if(val==0){
                front++;
                size--;
            }
        }
    }

    int getFront() {
        return front;
    }

    int getRear() {
        return rear;
    }

    int getFrontNode() { return queue.get(front); }

    int getRearNode() { return queue.get(rear); }

    private boolean isFull() {
        return (queue.size() > capacity);
    }

    private boolean isEmpty() { return (queue.size() == 0); }

    public Object[] getArrayValues() { return queue.toArray(); }
}
