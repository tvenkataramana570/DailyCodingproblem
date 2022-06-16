/*

This problem was asked by Facebook.

Given a function that generates perfectly random numbers between 1 and k (inclusive), 

where k is an input, write a function that shuffles a deck of cards represented as an array using only swaps.

It should run in O(N) time.

*/


class Main{
    public static void main(String[] args){
        char a[]=new char[]{'a','b','c'};
        System.out.println(shuffle(a));
    }
    public static char[] shuffle(char a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int j = (int)Math.floor(Math.random()*(n-i)+i);
            char t=a[i];
            a[i]=a[j];
            a[j]=t;
        }
        return a;// every time we get different output.
    }
}
