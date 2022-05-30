/*

The edit distance between two strings refers to the minimum number of character 
insertions, deletions, and substitutions required to change one string to the other. 
For example, the edit distance between “kitten” and “sitting” is three: 
substitute the “k” for “s”, substitute the “e” for “i”, and append a “g”.

Given two strings, compute the edit distance between them.

*/
class Main{
    public static void main(String args[]){
        String s1="kitten";
        String s2="sitting";
        System.out.println(edit_distance(s1,s2));
    }
    public static int edit_distance(String s1,String s2){
        int d;
        int n1=s1.length();
        int n2=s2.length();
        if(n1>n2){
            d=n1-n2;
            //System.out.println(s1.substring(d));
        }
        else if(n2>n1){
            d=n2-n1;
            //System.out.println(s2.substring(d));
        }
        else d=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)) d++;
        }
        return d;
    }
}
