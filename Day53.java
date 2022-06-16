/*

This problem was asked by Apple.

Implement a queue using two stacks. Recall that a queue is a FIFO (first-in, first-out) 

data structure with the following methods: enqueue, 

which inserts an element into the queue, and dequeue, which removes it.

*/
import java.util.*;
public class Main
{
    static Stack<Integer> stack1 = new Stack<Integer>();
	static Stack<Integer> stack2 = new Stack<Integer>();
	public static void main(String[] args) {
	    System.out.println("*********ENQUEUE**********");
		enqueue(1);
		enqueue(2);
	    enqueue(3);
	    System.out.println("stack1 "+stack1);
		System.out.println("*********DEQUEUE**********");
		dequeue();
	}
	public static void enqueue(int x){
	    stack1.push(x);
	}
	public static void dequeue(){
	    int n=stack1.size();
	    for(int i=0;i<n;i++){
	        stack2.push(stack1.pop());
	    }
	    System.out.println("stack1 "+stack2);
	    for(int i=0;i<n;i++){
	        System.out.println(stack2.pop());
	    }
	}
}
