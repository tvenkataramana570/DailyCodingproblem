/*

The power set of a set is the set of all its subsets. Write a function that, given a set, generates its power set.

For example, given the set {1, 2, 3}, it should return {{}, {1}, {2}, {3}, {1, 2}, {1, 3}, {2, 3}, {1, 2, 3}}.

*/
import java .util.*;

public class Main{
	
	static void printPowerSet(int []set,int n)
	{
		long ps = (long)Math.pow(2, n);
		int i, j;
		for(i = 0; i < ps; i++)
		{
			for(j = 0; j < n; j++)
			{
				if((i & (1 << j)) > 0)
					System.out.print(set[j]);
			}
			
			System.out.println();
		}
	}
	
	// Driver program to test printPowerSet
	public static void main (String[] args)
	{
		int []a = {1,2,3};
		printPowerSet(a, a.length);
	}
}
