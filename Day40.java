/*

Given an array of integers where every integer occurs three times except for one integer, which only occurs once, 
find and return the non-duplicated integer.

For example, given [6, 1, 3, 3, 3, 6, 6], return 1. Given [13, 19, 13, 13], return 19.

*/
import java.io.*;
import java.util.*;

class Main {
	
	static int singlenumber(int a[],int N)
	{
		
		Map<Integer, Integer> hp= new HashMap<Integer, Integer>();
			
		
		for(int i = 0; i < N;i++)
		{
			if(hp.containsKey(a[i]))
				hp.put(a[i],hp.get(a[i])+1);
			else hp.put(a[i],1);
		}
		
		for(Map.Entry<Integer, Integer> m : hp.entrySet())
		{
			if(m.getValue()==1)
			{
				return m.getKey();
			}
		}
		return -1;
		
	}
	
	// Driver code
	public static void main (String[] args) {
	int a[]={13, 19, 13, 13};
	
	int N= a.length;
		System.out.println(+singlenumber(a,N));
	}
}
