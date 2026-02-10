/*
*/
import java.util.Scanner;

class Node {
    char ch;
    int freq;
    Node left, right;

    Node(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
        left = right = null;
    }

    // For internal nodes
    Node(int freq, Node left, Node right) {
        this.ch = '-'; // placeholder
        this.freq = freq;
        this.left = left;
        this.right = right;
    }
}

public class HuffmanArray {

    static Node[] nodes = new Node[100];
    static int size = 0;

    // Insert node into array
    static void insertNode(Node node) {
        nodes[size++] = node;
    }

    // Remove and return node with minimum frequency
    static Node extractMin() {
        int minIndex = 0;
        for (int i = 1; i < size; i++) {
            if (nodes[i].freq < nodes[minIndex].freq)
                minIndex = i;
        }
        Node minNode = nodes[minIndex];
        for (int i = minIndex; i < size - 1; i++) {
            nodes[i] = nodes[i + 1];
        }
        size--;
        return minNode;
    }

    // Build Huffman Tree
    static Node buildHuffmanTree() {
        while (size > 1) {
            Node left = extractMin();
            Node right = extractMin();

            Node merged = new Node(left.freq + right.freq, left, right);
            insertNode(merged);
        }
        return nodes[0]; // Root of the tree
    }

    // Generate codes by traversing the tree
    static void printCodes(Node root, String code) {
        if (root == null)
            return;

        if (root.left == null && root.right == null && root.ch != '-') {
            System.out.println(root.ch + ": " + code);
            return;
        }

        printCodes(root.left, code + "0");
        printCodes(root.right, code + "1");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of characters: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter character and frequency: ");
            char ch = sc.next().charAt(0);
            int freq = sc.nextInt();
            insertNode(new Node(ch, freq));
        }

        Node root = buildHuffmanTree();
        System.out.println("\nHuffman Codes:");
        printCodes(root, "");
    }
}