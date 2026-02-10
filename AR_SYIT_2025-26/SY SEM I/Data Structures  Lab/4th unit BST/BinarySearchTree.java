import java.util.LinkedList;
import java.util.Queue;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class BinarySearchTree {
    Node root;

    // Constructor
    BinarySearchTree() {
        root = null;
    }

    // INSERT
    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) return new Node(key);

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    // SEARCH
    boolean search(int key) {
        return searchRec(root, key);
    }

    boolean searchRec(Node root, int key) {
        if (root == null) return false;
        if (key == root.key) return true;
        return key < root.key
                ? searchRec(root.left, key)
                : searchRec(root.right, key);
    }

    // DELETE
    void delete(int key) {
        root = deleteRec(root, key);
    }

    Node deleteRec(Node root, int key) {
        if (root == null) return root;

        if (key < root.key)
            root.left = deleteRec(root.left, key);

        
        else if (key > root.key)
            root.right = deleteRec(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.key = minValue(root.right);
            root.right = deleteRec(root.right, root.key);
        }
        return root;
    }

    int minValue(Node root) {
        int min = root.key;
        while (root.left != null) {
            root = root.left;
            min = root.key;
        }
        return min;
    }

    // INORDER Traversal (Left, Root, Right)
    void inorder() {
        System.out.print("Inorder: ");
        inorderRec(root);
        System.out.println();
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    // PREORDER Traversal (Root, Left, Right)
    void preorder() {
        System.out.print("Preorder: ");
        preorderRec(root);
        System.out.println();
    }

    void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    // POSTORDER Traversal (Left, Right, Root)
    void postorder() {
        System.out.print("Postorder: ");
        postorderRec(root);
        System.out.println();
    }

    void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.key + " ");
        }
    }

    // LEVEL-ORDER Traversal (Breadth-First Search)
    void levelOrder() {
        System.out.print("Level-order: ");
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            System.out.print(temp.key + " ");

            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);
        }
        System.out.println();
    }

    // MAIN method to test the BST
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // Insert nodes
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int val : values)
            tree.insert(val);

        // Traversals
        tree.inorder();     // Output: 20 30 40 50 60 70 80
        tree.preorder();    // Output: 50 30 20 40 70 60 80
        tree.postorder();   // Output: 20 40 30 60 80 70 50
        tree.levelOrder();  // Output: 50 30 70 20 40 60 80

        // Search test
        System.out.println("Search 60: " + tree.search(60)); // true
        System.out.println("Search 90: " + tree.search(90)); // false

        // Delete some nodes
        tree.delete(20); // leaf
        tree.delete(30); // node with one child
        tree.delete(50); // node with two children

        // Traversals after deletion
        System.out.println("\nAfter deletion:");
        tree.inorder();    
        tree.preorder();   
        tree.postorder();  
        tree.levelOrder(); 
    }
}