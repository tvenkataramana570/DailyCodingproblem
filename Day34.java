/*

Given a string, find the palindrome that can be made by inserting the fewest number of characters as possible anywhere in the word. If there is more than one palindrome of minimum length that can be made, return the lexicographically earliest one (the first one alphabetically).

For example, given the string "race", you should return "ecarace", since we can add three letters to it (which is the smallest amount to make a palindrome). There are seven other palindromes that can be made from "race" by adding three letters, but "ecarace" comes first alphabetically.

As another example, given the string "google", you should return "elgoogle".

                                      TRACING

                        r+ace+r               e+rac+e 
                        
                    a+ce+a   e+ac+e        r+ac+r   c+ra+c
                  
                   cec  ece aca  cac      ace cac   rar  ara
                                                    ecarace  

*/
import java.util.*;
class Main{
    public static void main(String args[]){
        System.out.println(make_palindrome("google"));
        System.out.println(make_palindrome("race"));
    }
    public static boolean is_palindrome(String s){
        StringBuilder s2=new StringBuilder(s);
        s2=s2.reverse();
        return s==s2.toString();
    }
    public static String make_palindrome(String st){
        int n=st.length();
        if(st.length()==1) return st;
        else if(is_palindrome(st)) return st;
        try{
            if(st.charAt(0)==st.charAt(n-1)){
            return st.charAt(0)+make_palindrome(st.substring(1,n-1))+st.charAt(n-1);
        }
        else{
            String one = st.charAt(0)+make_palindrome(st.substring(1))+st.charAt(0);
            //System.out.println(one);
            String two = st.charAt(n-1)+make_palindrome(st.substring(0,n-1))+st.charAt(n-1);
            //System.out.println(two);
            if(one.length()<two.length()) return one;
            else if(one.length()>two.length()) return two;
            else if(one.compareTo(two)<0) return one;
            else return two;
        }
        }
        catch(StringIndexOutOfBoundsException e){
            //System.out.println(e.getMessage());
        }
        return "";
    }
}
