package DailyWork.MinStack;

import java.util.Stack;

/**
 * 155.最小栈
 * 方法1:辅助栈
 * 方法2:出入栈每次操作两个数, 一个为元素, 另一个为min基准上的变动,反向操作得到当前最小值
 */
public class MinStack {

    Stack stack;
    Stack minStack;
    int min;

    public MinStack() {
        stack = new Stack();
        minStack = new Stack();
    }

    public void push(int x) {
        stack.add(x);
        if (minStack.isEmpty()) {
            minStack.add(x);
        } else {
            int peek = (int)minStack.peek();
            min = Math.min(peek, x);
            minStack.add(min);
        }
    }

    public void pop() {
        minStack.pop();
        stack.pop();
    }

    public int top() {
        return (int) stack.peek();
    }

    public int getMin() {
        return (int) minStack.peek();
    }

}
