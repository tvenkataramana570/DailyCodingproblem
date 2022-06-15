/*

This problem was asked by Microsoft.

Suppose an arithmetic expression is given as a binary tree. Each leaf is an integer and each internal node is one of '+', '−', '∗', or '/'.

Given the root to such a tree, write a function to evaluate it.

For example, given the following tree:

    *
   / \
  +    +
 / \  / \
3  2  4  5
You should return 45, as it is (3 + 2) * (4 + 5).

*/
class Node {
	String data;
	Node left, right;

	Node(String item)
	{
		data = item;
		left = right = null;
	}
}

class Main {

	public static int evaluate(Node root){
	    if(root.data=="+") return evaluate(root.left) + evaluate(root.right);
	    else if(root.data=="-") return evaluate(root.left) - evaluate(root.right);
	    else if(root.data=="*") return evaluate(root.left) * evaluate(root.right);
	    else if(root.data=="/") return evaluate(root.left) / evaluate(root.right);
	    else return Integer.parseInt(root.data);
	}

	public static void main(String args[])
	{
		Node root=new Node("*");
	    root.left=new Node("+");
	    root.right=new Node("+");
	    root.left.left=new Node("3");
	    root.left.right=new Node("2");
	    root.right.left=new Node("4");
	    root.right.right=new Node("5");
		System.out.println("Solution of the tree : "+evaluate(root));
	}
}
