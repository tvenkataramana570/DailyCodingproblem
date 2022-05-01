/*
cons(a, b) constructs a pair, and car(pair) and cdr(pair) 
returns the first and last element of that pair. 
For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
		System.out.println(car(cons(a,b))+" "+cdr(cons(a,b)));
	}
	public static int [] cons(int a,int b){
	    int x[]=new int[]{a,b};
	    return x;
	}
	public static int car(int x[]){
	    return x[0];
	}
	public static int cdr(int x[]){
	    return x[1];
	}
}
