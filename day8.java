/**
A unival tree (which stands for "universal value") is a tree where all nodes under it have the same value.
Given the root to a binary tree, count the number of unival subtrees.
For example, the following tree has 5 unival subtrees:
   0
  / \
 1   0
    / \
   1   0
  / \
 1   1
 */ 
class TreeNode {
    public int val;
    public TreeNode left; 
    public TreeNode right;

    public TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
 }
class Main{
    public static int unival_subtrees_count(TreeNode tree){
        int count = 0;
        if (tree.left==null && tree.right==null)
            return 1;
        if (tree.left.val==tree.right.val)
            count += 1;
        if (tree.left!=null)
            count += unival_subtrees_count(tree.left);
        if (tree.right!=null)
            count += unival_subtrees_count(tree.right);      
        return count; 
    }

    public static void main(String [] args){
        TreeNode tree = 
        new TreeNode(0,
            new TreeNode(1, null, null), new TreeNode(0, 
                new TreeNode(1, new TreeNode(1, null, null), 
                    new TreeNode(1, null, null)), new TreeNode(0, null, null)));
        System.out.println(unival_subtrees_count(tree));
    }
}
