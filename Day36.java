/*

Given the root to a binary search tree, find the second largest node in the tree.

*/

class Node {

	int data;
	Node left, right;

	Node(int d)
	{
		data = d;
		left = right = null;
	}
}

class Main {
    
	Node root;

	Main()
	{
		root = null;
	}

	public void insert(int data)
	{
		this.root = this.insertRec(this.root, data);
	}
	Node insertRec(Node node, int data)
	{
		if (node == null) {
			this.root = new Node(data);
			return this.root;
		}

		if (data < node.data) {
			node.left = this.insertRec(node.left, data);
		} else {
			node.right = this.insertRec(node.right, data);
		}
		return node;
	}
	public class count{
	    int c=0;
	}
	// Function to find 2nd largest element
	void secondLargestNode(Node node,count cn)
	{
		if (node == null || cn.c >= 2)
			return;
		this.secondLargestNode(node.right,cn);
		
		cn.c++;
		
		if (cn.c == 2) {
			System.out.print("2nd largest element is "+
											node.data);
			return;
		}
		this.secondLargestNode(node.left,cn);
	}

	// Function to find 2nd largest element
	void secondLargest(Node node)
	{
	    count cn=new count();
		this.secondLargestNode(this.root,cn);
	}

	// Driver function
	public static void main(String[] args)
	{
		Main tree = new Main();
			                                                        /*             50
		                                                                    
		                                                                       30	 70
		                                                                
	                                                                       20 40 60 80                */
		
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		tree.secondLargest(tree.root);
	}
}
