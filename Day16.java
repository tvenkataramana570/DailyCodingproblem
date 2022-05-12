/*
You run an e-commerce website and want to record the last N order ids in a log. Implement a data structure to accomplish this, with the following API:

record(order_id): adds the order_id to the log
get_last(i): gets the ith last element from the log. i is guaranteed to be smaller than or equal to N.
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number of ids");
	    int n=sc.nextInt();
	    int order[]=new int[n];
	    for(int i=0;i<n;i++){
	        System.out.println("enter the id "+(i+1));
	        order[i]=sc.nextInt();
	    }
	    System.out.println("enter the index x");
	    int x=sc.nextInt();
		System.out.println("The xth element from the last is "+get_order(x,order,n));
	}
	public static int get_order(int i,int order[],int n){
	    return order[n-i];
	}
}
