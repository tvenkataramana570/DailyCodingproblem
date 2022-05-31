/*
Run-length encoding is a fast and simple method of encoding strings. The basic idea is to represent repeated successive characters as a single count and character. For example, the string "AAAABBBCCDAA" would be encoded as "4A3B2C1D2A".

Implement run-length encoding and decoding. You can assume the string to be encoded have no digits and consists solely of alphabetic characters. You can assume the string to be decoded is valid.

*/


public class Main
{
	public static void main(String[] args) {
	    String x=encode("AAAABBBCCDAA");
		System.out.println(x);
		System.out.println(decode(x));
	}
	public static String encode(String s){
	    String res="";
	    char c_ch=s.charAt(0);
	    int c_count=1;
	    for(int i=1;i<s.length();i++){
	        if(s.charAt(i)==c_ch) c_count++;
	        else{
	            res+=String.valueOf(c_count)+c_ch;
	            c_ch=s.charAt(i);
	            c_count=1;
	        }
	    }
	    res+=String.valueOf(c_count)+c_ch;
	    return res;
	}
	public static String decode(String s1){
	    String r="";
	    int c=0;
	    for(int i=0;i<s1.length();i++){
	        if((int)s1.charAt(i)>48&&(int)s1.charAt(i)<=57){
	            c=Integer.parseInt(s1.charAt(i)+"");
	        }
	        else{
	            r+=freq(c,s1.charAt(i));
	            c=0;
	        }
	    }
	    return r;
	}
	public static String freq(int c,char ch){
	    String x1="";
	    for(int i=0;i<c;i++){
	        x1+=ch;
	    }
	    return x1;
	}
}
