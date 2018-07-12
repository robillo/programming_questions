package robillo.linked_list_java;

public class Node {

    private int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }

    int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}