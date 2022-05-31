/*

Given an array of strictly the characters 'R', 'G', and 'B', segregate the values of the array so that all the Rs come first, the Gs come second, and the Bs come last. You can only swap elements of the array.

Do this in linear time and in-place.

For example, given the array ['G', 'B', 'R', 'R', 'B', 'R', 'G'], it should become ['R', 'R', 'R', 'G', 'G', 'B', 'B'].

*/
    

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    char a[]={'G', 'B', 'R', 'R', 'B', 'R', 'G'};
	    int n=a.length;
		System.out.println(Arrange(a,n));
	}
	public static ArrayList<Character> Arrange(char a[],int n){
	    ArrayList<Character> x=new ArrayList<>();
	    int l=0;
	    int m=0;
	    int h=n-1;
	    while(l<=h){
	        if(a[m]=='R'){
	            char t=a[l];
	            a[l]=a[m];
	            a[m]=t;
	            l+=1;
	            m+=1;
	        }
	        else if(a[m]=='G'){
	            m+=1;
	        }
	        else{
	            char t=a[m];
	            a[m]=a[h];
	            a[h]=t;
	            h-=1;
	        }
	    }
	    for(char c:a){
	        x.add(c);
	    }
	    return x;
	}
}
