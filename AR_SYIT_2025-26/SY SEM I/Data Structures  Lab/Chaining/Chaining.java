import java.util.*;
public class Chaining
{
	public static void main(String args[])
	{
		int v = 5;
		List<List<Node>> hash = new LinkedList<>();
		for(int i = 0; i < v; i++)
		{
			hash.add(new LinkedList<>());
		}

		int[] keys = {11, 29, 45, 58, 145, 254, 336, 821, 1244, 2187, 4444, 5243};

		for(int key : keys)
		{
			int idx = key % v;
			hash.get(idx).add(new Node(key));
		}

		System.out.println("Index : Keys");

		for(int i = 0; i < v; i++)
		{
			System.out.print(i+ "     : ");
			for(Node node : hash.get(i))
			{
				System.out.print(node.key+ " ");
			}

			System.out.println();
		}

	}
}
class Node
{
	int key;
	Node(int key)
	{
		this.key = key;
	}
}