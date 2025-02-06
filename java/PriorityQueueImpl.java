import java.util.Arrays;

public class PriorityQueueImpl {
    private int[] heap;
    private int size;
    private int capacity;

    public PriorityQueueImpl(int capacity) {
        this.capacity = capacity;
        this.heap = new int[capacity];
        this.size = 0;
    }

    private void resize() {
        capacity *= 2;
        int[] newHeap = new int[capacity];
        for (int i = 0; i < size; i++) {
            newHeap[i] = heap[i];
        }
        heap = newHeap;
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    private int left(int i) {
        return 2 * i + 1;
    }

    private int right(int i) {
        return 2 * i + 2;
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void insert(int value) {
        if (size == capacity) {
            resize();
        }
        heap[size] = value;
        int current = size;
        size++;

        while (current > 0 && heap[parent(current)] > heap[current]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void display() {
        System.out.print("Priority Queue : ");
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public int peek() {
        if (size == 0) {
            throw new RuntimeException("Priority Queue is empty");
        }
        return heap[0];
    }

    public static void main(String[] args) {

        PriorityQueueImpl priorityQueue = new PriorityQueueImpl(5);
        priorityQueue.insert(30);
        priorityQueue.insert(10);
        priorityQueue.insert(20);
        priorityQueue.insert(50);
        priorityQueue.insert(40);
        priorityQueue.insert(5);

        priorityQueue.display();
    }
}
