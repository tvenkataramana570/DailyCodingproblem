/* 

Good morning! Here's your coding interview problem for today.

This problem was asked by Google.

Given pre-order and in-order traversals of a binary tree, write a function to reconstruct the tree.

For example, given the following preorder traversal:

[a, b, d, e, c, f, g]

And the following inorder traversal:

[d, b, e, a, f, c, g]

You should return the following tree:

    a
   / \
  b   c
 / \ / \
d  e f  g

*/
class Node {
	char data;
	Node left, right;

	Node(char item)
	{
		data = item;
		left = right = null;
	}
}

class Main {
	Node root;
	static int preIndex = 0;

	Node buildTree(char in[], char pre[], int inStrt, int inEnd)
	{
		if (inStrt > inEnd)
			return null;

		/* Pick current node from Preorder traversal using preIndex
		and increment preIndex */
		Node tNode = new Node(pre[preIndex++]);

		/* If this node has no children then return */
		if (inStrt == inEnd)
			return tNode;

		/* Else find the index of this node in Inorder traversal */
		int inIndex = search(in, inStrt, inEnd, tNode.data);

		/* Using index in Inorder traversal, construct left and
		right subtress */
		tNode.left = buildTree(in, pre, inStrt, inIndex - 1);
		tNode.right = buildTree(in, pre, inIndex + 1, inEnd);

		return tNode;
	}

	int search(char arr[], int strt, int end, char value)
	{
		int i;
		for (i = strt; i <= end; i++) {
			if (arr[i] == value)
				return i;
		}
		return i;
	}

	/* This function is here just to test buildTree() */
	void printInorder(Node node)
	{
		if (node == null)
			return;

		/* first recur on left child */
		printInorder(node.left);

		/* then print the data of node */
		System.out.print(node.data + " ");

		/* now recur on right child */
		printInorder(node.right);
	}

	public static void main(String args[])
	{
		Main tree = new Main();
		char in[] = new char[] { 'D', 'B', 'E', 'A', 'F', 'C', 'G' };
		char pre[] = new char[] { 'A', 'B', 'D', 'E', 'C', 'F', 'G' };
		int len = in.length;
		Node root = tree.buildTree(in, pre, 0, len - 1);

		System.out.println("Inorder traversal of constructed tree is : ");
		tree.printInorder(root);
	}
}
