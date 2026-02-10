import java.util.Scanner;
import java.util.Stack;
public class Node {

            // ---------- Node ----------

                int data;
                Node left, right;
                Node(int d) { 
                    this.data = d;
                    left = right = null;
                }


            static Scanner sc = new Scanner(System.in);

            // ---------- Build Tree (Pre-order Input) ----------
            static Node buildTree() {
                int x = sc.nextInt();
                if (x == -1) {
                    return null;
                }
                Node temp = new Node(x);
                System.out.print("Enter the left child of " + x + ": ");
                temp.left = buildTree();
                System.out.print("Enter the right child of " + x + ": ");
                temp.right = buildTree();
                return temp;
            }

            // ---------- DFS (Recursive) Traversals ----------
            static void preorderRecursive(Node root) {
                if (root == null) return;
                System.out.print(root.data + " ");
                preorderRecursive(root.left);
                preorderRecursive(root.right);
            }

            static void inorderRecursive(Node root) {
                if (root == null) return;
                inorderRecursive(root.left);
                System.out.print(root.data + " ");
                inorderRecursive(root.right);
            }

            static void postorderRecursive(Node root) {
                if (root == null) return;
                postorderRecursive(root.left);
                postorderRecursive(root.right);
                System.out.print(root.data + " ");
            }

            // ---------- DFS (Iterative with Stack) ----------
            // Pre-order Iterative
            static void preorderIterative(Node root) {
                Stack<Node> s1 = new Stack<>();
                Node cur = root;

                while (cur != null || !s1.isEmpty()) {
                    while (cur != null) {
                        s1.push(cur);
                       System.out.print(cur.data + " ");
                        cur = cur.left;
                    }

                    cur = s1.pop();

                    cur = cur.right;
                }
            }

            // In-order Iterative
            static void inorderIterative(Node root) {
                Stack<Node> s1 = new Stack<>();
                Node cur = root;

                while (cur != null || !s1.isEmpty()) {
                    while (cur != null) {
                        s1.push(cur);
                        cur = cur.left;
                    }

                    cur = s1.pop();
                    System.out.print(cur.data + " ");

                    cur = cur.right;
                }
            }

            // Post-order Iterative using two stacks
            static void postorderIterative(Node root) {
                if (root == null) return;

                Stack<Node> s1 = new Stack<>();
                Stack<Node> s2 = new Stack<>();

                s1.push(root);
                while (!s1.isEmpty()) {
                    Node cur = s1.pop();
                    s2.push(cur);

                    if (cur.left != null) s1.push(cur.left);
                    if (cur.right != null) s1.push(cur.right);
                }

                while (!s2.isEmpty()) {
                    System.out.print(s2.pop().data + " ");
                }
            }

            // ---------- BFS Traversal ----------
            static void bfs(Node root) {
                if (root == null) return;

                // BFS uses a queue, so Stack is not suitable here
                java.util.Queue<Node> q = new java.util.LinkedList<>();
                q.add(root);

                while (!q.isEmpty()) {
                    Node cur = q.remove();
                    System.out.print(cur.data + " ");
                    if (cur.left != null) q.add(cur.left);
                    if (cur.right != null) q.add(cur.right);
                }
            }

             static void search(Node root,int val) {
                if (root == null) return;
                Node temp = root;
                if(temp.data==val) 
                { 
                    System.out.print("found");
                    return;
                }
                search(temp.left,val);
                search(temp.right,val);
            }

             static int height(Node root){
                Node temp = root;
                if(root==null) return 0;
                if(temp.left==null && temp.right==null) return 0;
                return 1 + Math.max(height(temp.left),height(temp.right)+1);

             }



            // ---------- Main ----------
            public static void main(String[] args) {

                    Node root = null;
                int choice;

                do {
                    System.out.println("\n--- Binary Tree Operations ---");
                    System.out.println("1. Build Tree");
                    System.out.println("2. Pre-order (Recursive)");
                    System.out.println("3. In-order (Recursive)");
                    System.out.println("4. Post-order (Recursive)");
                    System.out.println("5. Pre-order (Iterative)");
                    System.out.println("6. In-order (Iterative)");
                    System.out.println("7. Post-order (Iterative)");
                    System.out.println("8. BFS (Level-order)");
                    System.out.println("9. Search Node");
                    System.out.println("10. Tree Height");
                    System.out.println("0. Exit");
                    System.out.print("Enter your choice: ");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println("Enter tree data in pre-order format (-1 for null): ");
                            root = buildTree();
                            break;

                        case 2:
                            System.out.print("Pre-order (Recursive): ");
                            preorderRecursive(root);
                            System.out.println();
                            break;

                        case 3:
                            System.out.print("In-order (Recursive): ");
                            inorderRecursive(root);
                            System.out.println();
                            break;

                        case 4:
                            System.out.print("Post-order (Recursive): ");
                            postorderRecursive(root);
                            System.out.println();
                            break;

                        case 5:
                            System.out.print("Pre-order (Iterative): ");
                            preorderIterative(root);
                            System.out.println();
                            break;

                        case 6:
                            System.out.print("In-order (Iterative): ");
                            inorderIterative(root);
                            System.out.println();
                            break;

                        case 7:
                            System.out.print("Post-order (Iterative): ");
                            postorderIterative(root);
                            System.out.println();
                            break;

                        case 8:
                            System.out.print("BFS (Level-order): ");
                            bfs(root);
                            System.out.println();
                            break;

                        case 9:
                            System.out.print("Enter value to search: ");
                            int val = sc.nextInt();
                            search(root, val);
                            System.out.println();
                            break;

                        case 10:
                            System.out.println("Height: " + height(root));
                            break;

                        case 0:
                            System.out.println("Exiting program.");
                            break;

                        default:
                            System.out.println("Invalid choice. Try again.");
                    }
                } while (choice != 0);

                sc.close();
            }



}