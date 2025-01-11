import java.util.EmptyStackException;

// LIFO - last in first out
public class StackExample {
    private Node top;
    private int size;

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int pop() {
        if (isEmpty()) {
//            System.out.println("Stack is empty");
//            return -1;
            throw new EmptyStackException();
        }
        int data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public static void main(String[] args) {
        /**
         * 1. Push - O(1)
         * 2. Pop - O(1)
         * 3. isEmpty - O(1)
         * 4. size - O(1)
         * 5. peek - O(1)
         *
         * if size doesn't exist then size - O(n)
         *
         * Assignment
         * - size() without size variable
         * - reversing the stack
         * - empty() - O(1) top -> null
         */

        System.out.println();
        System.out.println("Stack Example");
        System.out.println();

        StackExample stackExample = new StackExample();
        stackExample.push(1);
        stackExample.push(2);
        stackExample.push(3);
        stackExample.push(4);
        stackExample.push(5);
        stackExample.push(6);
        stackExample.push(7);
        stackExample.push(8);
        stackExample.push(9);
        stackExample.push(0);

        stackExample.pop();
        stackExample.pop();
        stackExample.pop();
        stackExample.pop();
        stackExample.push(8);
        stackExample.push(9);
        stackExample.push(0);
        stackExample.pop();
        stackExample.pop();

        System.out.println(stackExample.peek());

        System.out.println("Top element : " + stackExample.peek());
        System.out.println("Size of the stack : " + stackExample.size());
        System.out.println("Popped element : " + stackExample.pop());

        System.out.println("Top element : " + stackExample.peek());

        System.out.println("Size of the stack : " + stackExample.size());

    }
}
