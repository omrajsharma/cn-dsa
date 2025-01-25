import java.util.ArrayList;
import java.util.Scanner;

public class GenericTrees {

    static class TreeNode {
        int data;
        ArrayList<TreeNode> children;

        public TreeNode(int data) {
            this.data = data;
            this.children = new ArrayList<>();
        }
    }

    public static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + ": ");

        for (TreeNode child : root.children) {
            System.out.print(child.data + " ");
        }

        System.out.println();

        for (TreeNode child : root.children) {
            printTree(child);
        }
    }

    public static TreeNode takeInputRecusively(Scanner sc) {
        System.out.println("Enter node data: ");
        int data = sc.nextInt();
        TreeNode root = new TreeNode(data);

        System.out.println("Enter node children: ");
        int childrenCount = sc.nextInt();

        for (int i = 0; i < childrenCount; i++) {
            TreeNode child = takeInputRecusively(sc);
            root.children.add(child);
        }

        return root;
    }

    public static int heightOfTree(TreeNode root) {
        if (root == null) {
            return -1;
        }

        int height = -1;
        for (TreeNode child : root.children) {
            height = Math.max(height, heightOfTree(child));
        }

        return height + 1;
    }

    public static int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int count = 1;

        for (TreeNode child : root.children) {
            count += countNodes(child);
        }

        return count;
    }

    /**
     * Sum of Nodes
     * Level Wise Input
     */

    public static void main(String[] args) {
        System.out.println("Generic Trees");

        Scanner sc = new Scanner(System.in);

        TreeNode root = takeInputRecusively(sc);

        printTree(root);

        System.out.println("Height of tree: " + heightOfTree(root));
        System.out.println("Count of nodes: " + countNodes(root));
    }

}
