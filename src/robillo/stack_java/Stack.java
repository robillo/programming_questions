package robillo.stack_java;

//Linked List implemented as a stack

import java.util.ArrayList;
import java.util.List;

public class Stack {


    int top;
    int capacity = 0; //to limit the number of elements to be inserted in the stack
    List<Integer> stack = new ArrayList<>();

    public Stack(int capacity) {
        this.capacity = capacity;
        top = -1;
    }

    public void push(int item) {
        if(isFull())
            return;
        stack.add(item);
        top++;
    }

    public void pop() {
        if(isEmpty())
            return;
        if(stack.size()>= top){
            stack.remove(top);
            top--;
        }
    }

    public int getTop() {
        return top;
    }

    public int getRear() {
        return stack.size()-1;
    }

    public int getTopValue() { return stack.get(top); }

    private boolean isFull() {
        return (stack.size() == capacity);
    }

    public boolean isEmpty() { return (stack.size() == 0); }

    public Object[] getArrayValues() { return stack.toArray(); }

    public int getStackSize() {
        return stack.size();
    }
}
