/*

Implement a stack that has the following methods:

push(val), which pushes an element onto the stack
pop(), which pops off and returns the topmost element of the stack. If there are no elements in the stack, then it should throw an error or return null.
max(), which returns the maximum value in the stack currently. If there are no elements in the stack, then it should throw an error or return null.
Each method should run in constant time.

*/
import java.util.*;
class MinStack {
	
	
	class Node{
		int val;
		int min;
		public Node(int val,int min){
			this.val=val;
			this.min=min;
			
		}
		
	}
	
	Stack<Node> s=new Stack<Node>();
	public void push(int x) {
		if(s.isEmpty()){
			s.push(new Node(x,x));
		}else{
			int min=Math.min(s.peek().min,x);
			s.push(new Node(x,min));
		}	
	}
	public int pop() {
	
			return s.pop().val;
	}
	public int top() {
		
			return s.peek().val;
	}
	public int getMin() {
		
			return s.peek().min;	
	}
}


class Main {
	
	

	public static void main (String[] args) {
	MinStack s=new MinStack();
	s.push(-5);
	s.push(16);
	s.push(2);
	s.push(0);
	System.out.println(s.getMin());
	System.out.println(s.pop());
	System.out.println(s.top());
	System.out.println(s.getMin());
	}
}
