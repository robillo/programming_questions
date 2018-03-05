package queue_java;

import java.util.ArrayList;
import java.util.List;

public class Queue {

    int front, rear, size;
    int capacity = 0; //to limit the number of elements to be inserted in the queue
    List<Integer> queue = new ArrayList<>();

    Queue(int capacity) {
        this.capacity = capacity;
        front = -1;
        rear = -1;
        size = 0;
    }

    void enqueue(int item) {
        if(isFull())
            return;
        rear++;
        size++;
        queue.add(item);
    }

    void dequeue() {
        if(isEmpty())
            return;
        queue.remove(rear);
        rear--;
        size--;
    }

    int getFront() {
        return front;
    }

    int getRear() {
        return rear;
    }

    private boolean isFull() {
        return (size == capacity);
    }

    private boolean isEmpty() {
        return (size == 0);
    }

    Object[] getArrayValues() {
        return queue.toArray();
    }
}
