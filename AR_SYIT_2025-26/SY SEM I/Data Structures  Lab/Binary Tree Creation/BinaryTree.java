class Node
{
	int data;
	Node left;
	Node right;

	public Node(int data)
	{
		this.data = data;
	}
}

public class BinaryTree
{
	Node root;

	public void insert(int data)
	{
		root = insertRec(root, data);
	}

	public Node insertRec(Node root, int data)
	{
		if(root == null)
			root = new Node(data);

		else if(data < root.data)
			root.left = insertRec(root.left, data);

		else if(data < root.data)
			root.right = insertRec(root.right, data);

		return root;
	}


	//inorder travesal recursive
	/*public Node inorder()
	{
		root = inorderRec(root);
	}*/

	public void inorderRec(Node root)
	{
		if(root != null)
		{
			inorderRec(root.left);
			System.out.print(root.data + " ");
			inorderRec(root.right);
		}
	}


	// pre order traversal recursive
	/*public Node preorder()
	{
		root = preorderRec(root);
	}*/

	public void preorderRec(Node root)
	{
		if(root != null)
		{
			System.out.print(root.data + " ");
			preorderRec(root.left);
			preorderRec(root.right);
		}
	}


	// post order traversal recursive
	/*public Node postorder()
	{
		root = postorderRec(root);
	}*/

	public void postorderRec(Node root)
	{
		if(root != null)
		{
			postorderRec(root.left);
			postorderRec(root.right);
			System.out.print(root.data + " ");
		}
	}


	public static void main(String args[])
	{
		BinaryTree tree = new BinaryTree();

		tree.insert(12);
		tree.insert(5);
		tree.insert(22);
		tree.insert(2);
		tree.insert(34);
		tree.insert(66);
		tree.insert(17);
		tree.insert(10);
		tree.insert(90);
		tree.insert(3);

		tree.inorderRec();
		tree.preorderRec();
		tree.postorderRec();
	}
}