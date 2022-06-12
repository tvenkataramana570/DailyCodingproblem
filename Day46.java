/*

This problem was asked by Amazon.

Given a string, find the longest palindromic contiguous substring. If there are more than one with the maximum length, return any one.

For example, the longest palindromic substring of "aabcdcb" is "bcdcb". The longest palindromic substring of "bananas" is "anana".

*/
public class Main
{
	public static void main(String[] args) {
	    String s="banana";
		System.out.println(longestSubstring(s));
	}
	public static String longestSubstring(String s){
	    int max=0;
	    String maxStr="";
	    for(int i=0;i<s.length()-1;i++){
	        for(int j=i+1;j<s.length();j++){
	            String x=s.substring(i,j+1);
	            //System.out.println(x);
	            if(ispal(x)){
	                if(max<x.length()){
	                    max=x.length();
	                    maxStr=x;
	                }
	            }
	        }
	    }
	    return maxStr;
	}
	public static boolean ispal(String a){
	    StringBuilder sb=new StringBuilder(a);
	    StringBuilder rev=sb.reverse();
	    if(a.equals(rev.toString())) return true;
	    else return false;
	}
}

