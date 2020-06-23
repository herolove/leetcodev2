package org.example.leetcode;

import java.util.Stack;

/**
 * @Description TODO
 * @Author zhangtao02
 * @Date 2020/6/15
 **/
public class MinStack {
    Stack<Integer> stackA;
    Stack<Integer> stackB;

    public MinStack() {
        stackA = new Stack<>();
        stackB = new Stack<>();
    }

    public void push(int x) {
        stackA.add(x);
        if (stackB.isEmpty()) {
            stackB.add(x);
            return;
        }
        if (x < stackB.peek()) {
            stackB.add(x);
        }
    }

    public void pop() {
        Integer e = stackA.pop();
        if (e.equals(stackB.peek())) {
            stackB.pop();
        }
    }

    public int top() {
        return stackA.peek();
    }

    public int min() {
        return stackB.peek();
    }
}
