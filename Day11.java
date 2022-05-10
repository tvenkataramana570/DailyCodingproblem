/*
Implement an autocomplete system. That is, given a query string s and a set of all possible query strings, 
return all strings in the set that have s as a prefix.

For example, given the query string de and the set of strings [dog, deer, deal], return [deer, deal].
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    ArrayList<String> a1=new ArrayList<>();
	    String[] a=new String[]{"dog","deer","deal"};
		String s="de";
		for(int i=0;i<a.length;i++){
		    String s1=a[i].substring(0,s.length());
		    if(s1.equals(s)) a1.add(a[i]);
		}
		System.out.println(a1);
	}
}
