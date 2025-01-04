public class LinkedListExample {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        public void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }

        public boolean search(int data) {
            Node current = head;
            while (current != null) {
                if (current.data == data) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }

        public void delete(int data) {
            if (head == null) {
                System.out.println("List is empty");
            }
            if (head.data == data) {
                head = head.next;
                return;
            }
            Node current = head;
            while (current.next != null && current.next.data != data) {
                current = current.next;
            }
            if (current.next == null) {
                System.out.println("List is empty");
            } else {
                current.next = current.next.next;
            }
        }

        /**
         * Time complexity
         *
         * Assignment
         * - insert in the middle
         * - search at ith position
         * - insert at ith position
         * - update at ith position
         * - delete at ith position
         */
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.print("Linked list: ");
        list.display();

        System.out.println(list.search(10));

        System.out.println("\n\n");
    }
}
