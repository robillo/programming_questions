package stack_java;

public class ArrayStack {

    private int[] a;
    private int top = -1, size = 0;

    public ArrayStack(int size) {
        this.size = size;
        a = new int[size];
    }

    public int top() {
        return top;
    }

    public int pushItem(int val) {
        if(top < size) {
            top++;
            a[top] = val;
            return 1;
        }
        else return -1;
    }

    public int popItem() {
        if(top >= 0) {
            a[top] = 0;
            top--;
            return 1;
        }
        else return -1;
    }

    public int getTopItem() {
        if(top != -1 && top < size)
            return a[top];
        else return -1;
    }

    public int sum() {
        int sum = 0;
        for(int i=0; i<a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
