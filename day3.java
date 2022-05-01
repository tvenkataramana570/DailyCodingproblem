/*
Given the root to a binary tree, implement serialize(root), which serializes the tree into a string, and deserialize(s), which deserializes the string back into the tree.
*/
import java.util.*;
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}

class Main {
	TreeNode root;

	
	public static String serialize(TreeNode root)
	{
		if (root == null) {
			return null;
		}
		Stack<TreeNode> s = new Stack<>();
		s.push(root);

		List<String> l = new ArrayList<>();
		while (!s.isEmpty()) {
			TreeNode t = s.pop();
			
			if (t == null) {
				l.add("#");
			}
			else {
				
				l.add("" + t.val);
				s.push(t.right);
				s.push(t.left);
			}
		}
		return String.join(",", l);
	}

	static int t;
	
	public static TreeNode deserialize(String data)
	{
		if (data == null)
			return null;
		t = 0;
		String[] arr = data.split(",");
		return helper(arr);
	}

	public static TreeNode helper(String[] arr)
	{
		if (arr[t].equals("#"))
			return null;
		
		TreeNode root
			= new TreeNode(Integer.parseInt(arr[t]));
		t++;
		root.left = helper(arr);
		t++;
		root.right = helper(arr);
		return root;
	}

	static void inorder(TreeNode root)
	{
		if (root != null) {
			inorder(root.left);
			System.out.print(root.val + " ");
			inorder(root.right);
		}
	}

	public static void main(String args[])
	{
		Main tree = new Main();
		tree.root = new TreeNode(20);//                                             20
		tree.root.left = new TreeNode(8);//                                       8    22
		tree.root.right = new TreeNode(22);//                                    4 12 
		tree.root.left.left = new TreeNode(4);//                                  10 14
		tree.root.left.right = new TreeNode(12);//       serialised string: 20,8,4,#,#,12,10,#,#,14,#,#,22,#,#                      
		tree.root.left.right.left = new TreeNode(10);
		tree.root.left.right.right = new TreeNode(14);// deserialised inorder: 4 8 10 12 14 20 22             

		String serialized = serialize(tree.root);
		System.out.println("Serialized view of the tree:");
		System.out.println(serialized);
		System.out.println();
		
		TreeNode t = deserialize(serialized);

		System.out.println("Inorder Traversal of the tree from serialized String:");
		inorder(t);
	}
}
