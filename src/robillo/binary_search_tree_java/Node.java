package robillo.binary_search_tree_java;

public class Node {

    private int value;
    public Node left, right;

    public Node(int value) {
        this.value = value;
        left = null;
        right = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
