/*
Given a word and a string S, find all starting indices in S which are anagrams of word.

For example, given that word is “ab”, and S is “abxaba”, return 0, 3, and 4.
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    ArrayList<Integer> res=new ArrayList<Integer>();
	    String word=sc.nextLine();
	    String s=sc.nextLine();
	    String x="";
	    for(int i=0;i<(s.length()-word.length())+1;i++){
	        x=s.substring(i,i+word.length());
	        if(anagram(x,word)) res.add(i);
	    }
		System.out.println(res);
	}
	public static boolean anagram(String x,String y){
	    char a1[]=x.toCharArray();
	    char a2[]=y.toCharArray();
	    Arrays.sort(a1);
	    Arrays.sort(a2);
	    return Arrays.equals(a1,a2);
	}
}
