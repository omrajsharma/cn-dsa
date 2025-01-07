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
         * - print in reverse order
         * - merge two sorted linked lists
         */
    }

    static class DoublyNode {
        int data;
        DoublyNode next;
        DoublyNode prev;
        public DoublyNode(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    static class DoublyLinkedList {
        DoublyNode head;

        public DoublyLinkedList() {
            this.head = null;
        }

        public void add(int data) {
            DoublyNode newNode = new DoublyNode(data);

            if (head == null) {
                head = newNode;
            } else {
                DoublyNode current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
                newNode.prev = current;
            }
        }

        public void display() {
            DoublyNode current = head;
            while (current != null) {
//                System.out.print("|" + (current.prev != null ? current.prev.data : "null") + "|" + current.data + "|" + (current.next != null ? current.next.data : "null") + "|" + " -> ");
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }

        public void displayReverse() {
            if (head == null) {
                System.out.println("List is empty");
            }

            DoublyNode current = head;
            while (current.next != null) {
                current = current.next;
            }

            while (current != null) {
                System.out.print("|" + current.data + "|" + " -> ");
                current = current.prev;
            }
            System.out.println("null");
        }

        public void delete(int data) {
            if (head == null) {
                System.out.println("List is empty");
            }
            if (head.data == data) {
                head = head.next;
                if (head != null) head.prev = null;
                return;
            }

            DoublyNode current = head;

            while (current != null && current.data != data) {
                current = current.next;
            }

            if (current != null) {
                if (current.next != null) current.prev.next = current.next;
                if (current.next != null) current.next.prev = current.prev;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.print("Original Linked list: ");
        list.display();

//        System.out.println(list.search(10));

        list.head = reverse(list.head);
        System.out.print("Reversed Linked list: ");
        list.display();

        System.out.println(findMiddle(list.head).data);

        System.out.println("\n");

        DoublyLinkedList dList = new DoublyLinkedList();
        dList.add(1);
        dList.add(2);
        dList.add(3);
        dList.add(4);
        dList.add(5);

        dList.display();

        dList.displayReverse();
    }

    // middle of the linked list
    private static Node findMiddle(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        return reverseList(head, null);
    }

    private static Node reverseList(Node current, Node prev) {
        if (current == null) {
            return prev;
        }
        Node next = current.next;
        current.next = prev;
        return reverseList(next, current);
    }
}
