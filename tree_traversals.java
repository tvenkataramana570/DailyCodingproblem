import java.util.*;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
        left=right=null;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Node root=null;
	    root=new Node(5);//                     5
	    root.left=new Node(3);//              3   6
	    root.right=new Node(6);//           10 12
	    root.left.left=new Node(10);//    pre-order:  5 3 10 12 6
	    root.left.right=new Node(12);//   in-order:   10 3 12 5 6
		System.out.print("pre-order: ");//post-order  10 12 3 6 5
		preorder(root);//                 level-order 5 3 6 10 12
		System.out.println();//           left-view   5 3 10
		System.out.print("in-order: ");// right-view  5 6 12
		inorder(root);//                  top-view    10 3 5 6
		System.out.println();
		System.out.print("post-order: ");
		postorder(root);
		System.out.println();
		System.out.print("level-order: ");
		levelorder(root);
		System.out.println();
		System.out.print("left-view: ");
		leftview(root);
		System.out.println();
		System.out.print("right-view: ");
		rightview(root);
		System.out.println();
		System.out.print("top-view: ");
		topview(root);
	}
	public static void preorder(Node root){
	    if(root==null){
	        return;
	    }
	    System.out.print(root.val+" ");
	    preorder(root.left);
	    preorder(root.right);
	}
	public static void inorder(Node root){
	    if(root==null){
	        return;
	    }
	    inorder(root.left);
	    System.out.print(root.val+" ");
	    inorder(root.right);
	}
	public static void postorder(Node root){
	    if(root==null){
	        return;
	    }
	    postorder(root.left);
	    postorder(root.right);
	    System.out.print(root.val+" ");
	}
	public static void levelorder(Node root){
	    Queue<Node> q=new LinkedList<Node>();
	    q.add(root);
	    while(!q.isEmpty()){
	        Node temp=q.poll();
	        System.out.print(temp.val+" ");
	        if(temp.left!=null) q.add(temp.left);
	        if(temp.right!=null) q.add(temp.right);
	    }
	}
	public static void leftview(Node root){
	    Queue<Node> q=new LinkedList<Node>();
	    q.add(root);
	    while(!q.isEmpty()){
	        int n=q.size();
	        for(int i=0;i<n;i++){
	            Node temp=q.poll();
	            if(i==0) System.out.print(temp.val+" ");
	            if(temp.left!=null) q.add(temp.left);
	            if(temp.right!=null) q.add(temp.right);
	        }
	    }
	}
	public static void rightview(Node root){
	    Queue<Node> q=new LinkedList<Node>();
	    q.add(root);
	    while(!q.isEmpty()){
	        int n=q.size();
	        for(int i=0;i<n;i++){
	            Node temp=q.poll();
	            if(i==n-1) System.out.print(temp.val+" ");
	            if(temp.left!=null) q.add(temp.left);
	            if(temp.right!=null) q.add(temp.right);
	        }
	    }
	}
	public static void topview(Node root){
	    class QueueObj {
            Node node;
            int hd;
 
            QueueObj(Node node, int hd)
            {
                this.node = node;
                this.hd = hd;
            }
        }
        Queue<QueueObj> q = new LinkedList<QueueObj>();
        Map<Integer, Node> topViewMap
            = new TreeMap<Integer, Node>();
 
        if (root == null) {
            return;
        }
        else {
            q.add(new QueueObj(root, 0));
        }
        while (!q.isEmpty()) {
            QueueObj tmpNode = q.poll();
            if (!topViewMap.containsKey(tmpNode.hd)) {
                topViewMap.put(tmpNode.hd, tmpNode.node);
            }
 
            if (tmpNode.node.left != null) {
                q.add(new QueueObj(tmpNode.node.left,
                                   tmpNode.hd - 1));
            }
            if (tmpNode.node.right != null) {
                q.add(new QueueObj(tmpNode.node.right,
                                   tmpNode.hd + 1));
            }
        }
        for (Map.Entry<Integer, Node> entry :
             topViewMap.entrySet()) {
            System.out.print(entry.getValue().val+" ");
        }
	}
}
