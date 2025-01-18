import java.util.LinkedList;
import java.util.Queue;

public class TreeExample {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static class BinaryTree {
        Node root;

        public BinaryTree() {
            root = null;
        }

        public void insert(int data) {
            root = insertRecord(root, data);
        }

        private Node insertRecord(Node root, int data) {
            if (root == null) {
                root = new Node(data);
                return root;
            }
            if (data < root.data) {
                root.left = insertRecord(root.left, data);
            } else if (data > root.data) {
                root.right = insertRecord(root.right, data);
            }
            return root;
        }

        // In-order traversal: Left -> Root -> Right
        public void inOrder(Node node) {
            if (node != null) {
                inOrder(node.left);
                System.out.print(node.data + " ");
                inOrder(node.right);
            }
        }

        // Pre-order traversal: Root -> Left -> Right
        public void preOrder(Node node) {
            if (node != null) {
                System.out.print(node.data + " ");
                preOrder(node.left);
                preOrder(node.right);
            }
        }

        // Post-order traversal: Left -> Right -> Root
        public void postOrder(Node node) {
            if (node != null) {
                postOrder(node.left);
                postOrder(node.right);
                System.out.print(node.data + " ");
            }
        }

        // Level-order traversal: Level by level
        public void levelOrder(Node root) {
            if (root == null) {
                return;
            }

            Queue<Node> queue = new LinkedList<>();
            queue.add(root); // Start with the root

            while (!queue.isEmpty()) {
                Node current = queue.poll(); // Dequeue the current node
                System.out.print(current.data + " "); // Process the current node

                // Enqueue left child if it exists
                if (current.left != null) {
                    queue.add(current.left);
                }

                // Enqueue right child if it exists
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }

        // Method to calculate the height of the tree
        public int calculateHeight(Node node) {
            if (node == null) {
                return -1; // Base case: height of an empty tree is -1
            }

            // Recursively calculate height of left and right subtrees
            int leftHeight = calculateHeight(node.left);
            int rightHeight = calculateHeight(node.right);

            // Return the maximum of left and right heights plus 1 (for the current node)
            return Math.max(leftHeight, rightHeight) + 1;
        }

        // Method to mirror the tree
        public void mirrorTree(Node node) {
            if (node == null) {
                return;
            }

            // Swap the left and right children
            Node temp = node.left;
            node.left = node.right;
            node.right = temp;

            // Recursively mirror the left and right subtrees
            mirrorTree(node.left);
            mirrorTree(node.right);
        }
    }

    public static void main(String[] args) {
        System.out.println("Tree Example");

        BinaryTree tree = new BinaryTree();

        /**
         *         4
         *       /   \
         *      2     6
         *     / \   / \
         *    1   3 5   7
         */

        tree.insert(4);
        tree.insert(2);
        tree.insert(6);
        tree.insert(1);
        tree.insert(3);
        tree.insert(5);
        tree.insert(7);

        // Perform and print tree traversals
        System.out.print("In-order Traversal: ");
        tree.inOrder(tree.root); // Should output: 1 2 3 4 5 6 7
        System.out.println();

        System.out.print("Pre-order Traversal: ");
        tree.preOrder(tree.root); // Should output: 4 2 1 3 6 5 7
        System.out.println();

        System.out.print("Post-order Traversal: ");
        tree.postOrder(tree.root); // Should output: 1 3 2 5 7 6 4
        System.out.println();

        // Perform and print level-order traversal
        System.out.print("Level-order Traversal: ");
        tree.levelOrder(tree.root); // Should output: 4 2 6 1 3 5 7

        // Calculate and print the height of the tree
        int height = tree.calculateHeight(tree.root);
        System.out.println("Height of the tree: " + height); // Should output: 2

        // Original tree in-order traversal
        System.out.print("In-order before mirroring: ");
        tree.inOrder(tree.root);
        System.out.println();

        // Mirror the tree
        tree.mirrorTree(tree.root);

        // Mirrored tree in-order traversal
        System.out.print("In-order after mirroring: ");
        tree.inOrder(tree.root);
        System.out.println();
    }
}
