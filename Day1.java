/*
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
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
	    int k=sc.nextInt();
	    //int a[]=new int[]{10, 15, 3, 7};
	    //int n=a.length;
	    //int k=17;
	    checkPair(a,a.length,k);
	}
	public static void checkPair(int a[],int n,int k){
	        boolean res=false;
	        for(int i=0;i<n;i++){
	            for(int j=i+1;j<n;j++){
	                if(a[i]+a[j]==k){
	                    res=true;
	                    break;
	                }
	            }
	        }
	    System.out.println(res);
	    }
}
