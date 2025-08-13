package java_advanced_01.day14.collection;

import java.util.ArrayList;

public class MyStack<T> {
    private ArrayList<T> stack = new ArrayList<T>();

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(T t) {
        stack.add(t);
    }

    public T pop() {
        if (stack.isEmpty()) return null;
        return stack.remove(stack.size()-1);
    }

    public static void main(String[] args) {
        MyStack<Integer> ms = new MyStack<>();

        ms.push(1);
        ms.push(11);
        ms.push(111);
        ms.push(1111);

        System.out.println(ms.pop());
        System.out.println(ms.pop());
        System.out.println(ms.pop());
        System.out.println(ms.pop());
        System.out.println(ms.pop());

    }


}
