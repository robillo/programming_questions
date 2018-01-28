package linked_list_java;

import java.util.Scanner;

public class LinkedList {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //number of nodes for input data
        int nodeCount = in.nextInt();

        //root node value
        Node root = new Node(in.nextInt());

        //taking inputs of all nodes except root from user
        inputNode(root, in, nodeCount-1);

        //printing all nodes in linked list including root
        printNodes(root);
    }

    private static void inputNode(Node node, Scanner in, int count) {

        //we have input node values for all node count
        if(count==0) return;

        node.next = new Node(in.nextInt());
        count--;
        inputNode(node.next, in, count);
    }

    private static void printNodes(Node root) {

        //list ends
        if(root.next==null){
            System.out.println(root.getData());
            return;
        }

        System.out.println(root.getData());
        printNodes(root.next);
    }
}
