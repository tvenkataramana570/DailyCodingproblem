/*
There's a staircase with N steps, and you can climb 1 or 2 steps at a time. Given N, write a function that returns the number of unique ways you can climb the staircase. The order of the steps matters.
For example, if N is 4, then there are 5 unique ways:
1, 1, 1, 1
2, 1, 1
1, 2, 1
1, 1, 2
2, 2
What if, instead of being able to climb 1 or 2 steps at a time, you could climb any number from a set of positive integers X? For example, if X = {1, 3, 5}, you could climb 1, 3, or 5 steps at a time. Generalize your function to take in X.
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int n=sc.nextInt();
	    int size=sc.nextInt();
	    int a[]=new int[size];
	    for(int i=0;i<size;i++){
	        a[i]=sc.nextInt();
	    }
		System.out.println(staircase(n,a));
	}
	public static int staircase(int n,int a[]){
	    if(n<0) return 0;
	    else if(n==0) return 1;
	    else return sum(n,a);
	}
	public static int sum(int n,int a[]){
	    int s=0;
	    for(int i=0;i<a.length;i++){
	        s+=staircase(n-a[i],a);
	    }
	    return s;
	}
}
