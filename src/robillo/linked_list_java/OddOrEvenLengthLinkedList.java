package robillo.linked_list_java;

import java.util.Scanner;

public class OddOrEvenLengthLinkedList {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt(); //5, say

        //taking input from user for "count" number of input nodes
        Node root = new Node(in.nextInt());
        inputNodes(root, count-1);  //5-1 = 4

        Node head = root;

        //counting number of nodes
        int numNodes = 0;
        while (head!=null){
            numNodes++;
            head = head.next;
        }
        if ((numNodes % 2 == 0)) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    private static void inputNodes(Node node, int count) {
        if(count>0) { //executes for 4, 3, 2, 1
            node.next = new Node((new Scanner(System.in)).nextInt());
            inputNodes(node.next, count-1);
        }
    }
}
