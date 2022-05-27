/*

You are given an array of non-negative integers that represents a two-dimensional elevation map where each element is unit-width wall and the integer is the height. Suppose it will rain and all spots between two walls get filled up.

Compute how many units of water remain trapped on the map in O(N) time and O(1) space.

For example, given the input [2, 1, 2], we can hold 1 unit of water in the middle.

Given the input [3, 0, 1, 3, 0, 5], we can hold 3 units in the first index, 2 in the second, and 3 in the fourth index (we cannot hold 5 since it would run off to the left), so we can trap 8 units of water.

*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int a[]={3, 0, 1, 3, 0, 5};
	    int n=a.length;
		System.out.println(maxWater(a,n));
	}
	public static int maxWater(int[] arr, int n){
	    int res = 0;
        for(int i = 1; i < n - 1; i++)
        {
         
            // Find maximum element on its left
            int left = arr[i];
            for(int j = 0; j < i; j++)
            {
                left = Math.max(left, arr[j]);
            }
 
            // Find maximum element on its right
            int right = arr[i];
            for(int j = i + 1; j < n; j++)
            {
                right = Math.max(right, arr[j]);
            }
 
            // Update maximum water value
            res += Math.min(left, right) - arr[i];
        }
        return res;
	}
}
