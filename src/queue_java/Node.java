package queue_java;

public class Node {

    private int value;
    private Node front;
    private Node rear;

    public Node(int value) {
        this.value = value;
        front = null;
        rear = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
