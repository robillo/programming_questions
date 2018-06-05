package hashmaps_java;

import java.util.*;

public class VerticalOrder {

    public static void main(String[] args) {

        /*level order tree: (root, left1 right1, left1 right1 left2 right2, ..)
        1 2 3 4 5 6 7 -1 8 -1 -1 -1 -1 -1 -1 -1 -1
        => tree is:
                   1
                2     3
             4    56    7
          -    8 _ _ _  _ _  _
        */

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        root.left = new BinaryTreeNode<>(2);
        root.right = new BinaryTreeNode<>(3);
        root.left.left = new BinaryTreeNode<>(4);
        root.left.right = new BinaryTreeNode<>(5);
        root.right.left = new BinaryTreeNode<>(6);
        root.right.right = new BinaryTreeNode<>(7);
        root.left.left.right = new BinaryTreeNode<>(8);

        printBinaryTreeVerticalOrder(root);
    }

    public static void printBinaryTreeVerticalOrder(BinaryTreeNode<Integer> root){

        HashMap<Integer, List<Integer>> map = new HashMap<>();
        WrapInt min = new WrapInt(0), max = new WrapInt(0);

        mapValuesToColumns(root, 0, map, min, max);

        for(int i=min.integer; i<=max.integer; i++) {
            if(map.get(min.integer) != null) {
                List<Integer> list = map.get(i);
                for(Integer p : list) {
                    System.out.print(p + " ");
                }
                System.out.println();
            }
        }
    }

    static void mapValuesToColumns(BinaryTreeNode<Integer> root, int column, HashMap<Integer, List<Integer>> map, WrapInt min, WrapInt max) {
        if(root == null) {
            return;
        }

        if(min.integer > column) min.integer = column;

        if(max.integer < column) max.integer = column;

        if(map.get(column) == null) {
            List<Integer> list = new LinkedList<>();
            list.add(root.data);
            map.put(column, list);
        }
        else map.get(column).add(root.data);

        mapValuesToColumns(root.left, column-1, map, min, max);
        mapValuesToColumns(root.right, column+1, map, min, max);
    }

    static class BinaryTreeNode<T> {
        T data;
        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;

        public BinaryTreeNode(T data) {
            this.data = data;
        }
    }

    static class WrapInt {
        Integer integer;
        WrapInt(Integer integer) {
            this.integer = integer;
        }
    }
}
