package robillo.greedy_programming_java;

import robillo.stack_java.ArrayStack;

public class MaxEqualSumPossibleInThreeStacks {

    public static void main(String[] args) {
        ArrayStack a1 = new ArrayStack(5);
        ArrayStack a2 = new ArrayStack(3);
        ArrayStack a3 = new ArrayStack(4);

        inflateStacksWithValues(a1, a2, a3);

        System.out.println(findMaxEqualSumInStacks(a1, a2, a3));
    }

    private static void inflateStacksWithValues(ArrayStack a1, ArrayStack a2, ArrayStack a3) {
        a1.pushItem(1);
        a1.pushItem(1);
        a1.pushItem(1);
        a1.pushItem(2);
        a1.pushItem(3);

        a2.pushItem(2);
        a2.pushItem(3);
        a2.pushItem(4);

        a3.pushItem(1);
        a3.pushItem(4);
        a3.pushItem(5);
        a3.pushItem(2);
    }

    private static int findMaxEqualSumInStacks(ArrayStack a1, ArrayStack a2, ArrayStack a3) {
        int maxPossibleEqualSum = 0;

        do {
            if(a1.sum() == a2.sum() && a1.sum() == a3.sum()) {
                maxPossibleEqualSum = a1.sum();
                break;
            }
            else {
                if(a1.sum() > a2.sum() && a1.sum() > a3.sum()) {
                    a1.popItem();
                }
                else if(a2.sum() > a1.sum() && a2.sum() > a3.sum()) {
                    a2.popItem();
                }
                else if(a3.sum() > a1.sum() && a3.sum() > a2.sum()) {
                    a3.popItem();
                }
            }
        }while (a1.top() != -1 || a2.top() != -1 || a3.top() != -1);

        return maxPossibleEqualSum;
    }
}
