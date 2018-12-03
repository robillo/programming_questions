package robillo.binary_search_tree;

import java.util.Scanner;

public class SearchBst {

    public static void main(String[] args) {
        BinaryTree tree = BinaryTree.inflateSampleTree();
        Node root = tree.root;

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        searchBst(n, root);
    }

    private static void searchBst(int n, Node root) {
        if(root == null) {
            System.out.println("search value not found");
            return;
        }

        if(root.getValue() == n) {
            System.out.println("search value found");
            return;
        }

        if(n < root.getValue()) {
            searchBst(n, root.left);
        }
        else {
            searchBst(n, root.right);
        }
    }
}
