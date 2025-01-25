import java.util.NoSuchElementException;

public class QueueExample {
    private Node front;
    private Node rear;
    private int size;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear != null) {
            rear.next = newNode;
        }
        rear = newNode;
        if (front == null) {
            front = rear;
        }
        size++;
    }

    public int dequeue() {
        if(isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        int data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }

    public int peek() {
        if(isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return front.data;
    }

    /**
     * IMPLEMENT STACKS AND QUEUE USING ARRAY LIST
     * - Classes
     * - Stick to the data strcuture
     */

    public static void main(String[] args) {
        System.out.println("Queue");

        QueueExample queue = new QueueExample();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element: " + queue.peek());

        System.out.println("Dequed element: " + queue.dequeue());
        System.out.println("Dequed element: " + queue.dequeue());
        System.out.println("Dequed element: " + queue.dequeue());
        System.out.println("Dequed element: " + queue.dequeue());
        System.out.println("Dequed element: " + queue.dequeue());
        System.out.println("Dequed element: " + queue.dequeue());
    }
}
