package robillo.queue_java;

import java.util.Arrays;

public class QueueTest {

    static Queue queue = new Queue(9); //capacity limit

    public static void main(String[] args) {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println(Arrays.toString(queue.getArrayValues()));

        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);      //won't be inserted because of capacity limit

        System.out.println(Arrays.toString(queue.getArrayValues()));

        queue.dequeue();
        queue.dequeue();

        System.out.println(Arrays.toString(queue.getArrayValues()));

        queue.enqueue(11);
        queue.enqueue(12);

        System.out.println(Arrays.toString(queue.getArrayValues()));

        queue.dequeue();

        System.out.println(Arrays.toString(queue.getArrayValues()));

        queue.dequeue();

        System.out.println(Arrays.toString(queue.getArrayValues()));

        System.out.println("Starting Node: " + queue.getFrontNode());
        System.out.println("Ending Node: " + queue.getRearNode());
    }
}
