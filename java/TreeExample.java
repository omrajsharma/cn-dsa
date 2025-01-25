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

        public void inorder(Node node) {
            if (node != null) {
                inorder(node.left);
                System.out.print(node.data + " ");
                inorder(node.right);
            }
        }

        public void preorder(Node node) {
            if (node != null) {
                System.out.print(node.data + " ");
                preorder(node.left);
                preorder(node.right);
            }
        }

        public void postorder(Node node) {
            if (node != null) {
                postorder(node.left);
                postorder(node.right);
                System.out.print(node.data + " ");
            }
        }

        public void mirrorTree(Node node) {
            if (node != null) {
                Node temp = node.left;
                node.left = node.right;
                node.right = temp;

                mirrorTree(node.left);
                mirrorTree(node.right);
            }
        }

        // height of the tree
        public int calculateHeight(Node node) {
            if (node == null) {
                return -1;
            }
            int leftHeight = calculateHeight(node.left);
            int rightHeight = calculateHeight(node.right);

            return Math.max(leftHeight, rightHeight) + 1;
        }

        public void levelOrder(Node node) {
            if (node == null) {
                return;
            }

            Queue<Node> queue = new LinkedList<>();
            queue.add(node);

            while (!queue.isEmpty()) {
                Node current = queue.poll();

                System.out.print(current.data + " ");

                if (current.left != null) {
                    queue.add(current.left);
                }

                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }

        // diameter of the tree
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
         *
         */

        tree.insert(4);
        tree.insert(2);
        tree.insert(6);
        tree.insert(1);
        tree.insert(3);
        tree.insert(5);
        tree.insert(7);

        // inorder traversal - 1 2 3 4 5 6 7
        System.out.println("Inorder Traversal Example");
        tree.inorder(tree.root);
        System.out.println();

        // preorder traversal - 4 1 2 3 5 6 7
        System.out.println("Preorder Traversal Example");
        tree.preorder(tree.root);
        System.out.println();
    }
}
