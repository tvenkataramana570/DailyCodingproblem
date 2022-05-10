/*
Given a list of integers, write a function that returns the largest sum of non-adjacent numbers. Numbers can be 0 or negative.

For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. [5, 1, 1, 5] should return 10, since we pick 5 and 5.
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int a[]=new int[]{5,1,1,5};
		System.out.println(findMaximumNonAdjacentSum(a));
	}
	public static int findMaximumNonAdjacentSum(int arr[]) {
	    int len = arr.length;
        if(len == 0 ) return 0;
        if(len ==1 ) return arr[0];
        int[] sum = new int[len];
        sum[len-1] = arr[len-1];
        sum[len-2] = Math.max(arr[len-1], arr[len-2]);
  
        for(int i=len-3;i>=0;i--){
            sum[i] = Math.max(arr[i] + sum[i+2], sum[i+1]);
        }
        return sum[0];
	}
}
