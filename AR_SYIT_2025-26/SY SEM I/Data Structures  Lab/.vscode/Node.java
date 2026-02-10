
    import java.util.Scanner;
	import java.util.Stack;

	public class Node {

	    //Node
	  
	        int data;
	        Node left, right;
	        Node(int d) { 
	            this.data = d;
	            left = right = null;
	        }
	

	    static Scanner sc = new Scanner(System.in);

	    //Build Tree (Pre-order Input)
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

	    //DFS with Recursive
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

	    // Pre-order
	    static void preorderIterative(Node root) {
	        Stack<Node> s1 = new Stack<>();
			s1.push(root);
			while(!s1.isEmpty())
			{
				Node cur = s1.pop();
				System.out.println(cur.data+ " ");

				if(cur.right != null)
				{
					s1.push(cur.right);
				}

				if(cur.left != null)
				{
					s1.push(cur.left);
				}

			}
	    }

	    // Inorder
	    static void inorderIterative(Node root) {
	        Stack<Node> S = new Stack<>();
	       Node current = root;

		   while(current != null)
		   {
				S.push(current);
				current = current.left;
			}

			current = S.pop();
			System.out.println(current.data+ " ");
			current = current.right;
	    }

	    // Post order
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
	     static void displayTree(Node root, int space) {
	    	    if (root == null) return;

	    	    space += 5; // Increase distance between levels

	    	    displayTree(root.right, space); // Right child first

	    	    System.out.println();
	    	    for (int i = 5; i < space; i++)
	    	        System.out.print(" ");
	    	    System.out.println(root.data);

	    	    displayTree(root.left, space); // Then left child
	    	}


	    //Main
	    public static void main(String[] args) {
	        System.out.println("Enter tree data in pre-order format (-1 for null): ");
	        Node root = buildTree();

	        System.out.print("\nPre-order (recursive): "); 
	        preorderRecursive(root);

	        System.out.print("\nIn-order (recursive): "); 
	        inorderRecursive(root);

	        System.out.print("\nPost-order (recursive): ");
	         postorderRecursive(root);

	        System.out.print("\nPre-order (iterative): "); 
	        preorderIterative(root);

	        System.out.print("\nIn-order (iterative): ");
	         inorderIterative(root);

	        System.out.print("\nPost-order (iterative): ");
	         postorderIterative(root);

	        System.out.print("\nBFS (level-order): "); bfs(root);
	        System.out.println();

	        search(root,20);
	        System.out.println();
	        System.out.println("Height:"+height(root));
	        System.out.println("Tree:");
	        displayTree(root,0);

	        sc.close();
	    }
	}