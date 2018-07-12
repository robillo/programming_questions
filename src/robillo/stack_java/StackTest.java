package robillo.stack_java;

import java.util.Arrays;

public class StackTest {

    static Stack stack = new Stack(9);

    public static void main(String[] args) {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(Arrays.toString(stack.getArrayValues()));

        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);      //won't be inserted because of capacity limit

        System.out.println(Arrays.toString(stack.getArrayValues()));

        stack.pop();
        stack.pop();

        System.out.println(Arrays.toString(stack.getArrayValues()));

        stack.push(11);
        stack.push(12);

        System.out.println(Arrays.toString(stack.getArrayValues()));

        stack.pop();

        System.out.println(Arrays.toString(stack.getArrayValues()));

        stack.pop();

        System.out.println(Arrays.toString(stack.getArrayValues()));

    }
}
