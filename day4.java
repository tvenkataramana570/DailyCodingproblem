/*
Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int c=1;
		for(int i=0;i<n;i++){
		    if(a[i]<=0){
		        continue;
		    }
		    if(a[i]==c) c++;
		    else{
		        break;
		    }
		}
		System.out.println(c);
	}
}
