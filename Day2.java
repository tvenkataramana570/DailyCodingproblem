/*
Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    ArrayList<Integer> in=new ArrayList<Integer>();
	    ArrayList<Integer> out=new ArrayList<Integer>();
	    int n=sc.nextInt();
	    for(int i=0;i<n;i++){
	        in.add(sc.nextInt());
	    }
	    int mul=1;
	    for(int i=0;i<n;i++){
	        mul*=in.get(i);
	    }
	    for(int i=0;i<n;i++){
	        out.add(mul/in.get(i));
	    }
	    System.out.println(in);
		System.out.println(out);
	}
}
