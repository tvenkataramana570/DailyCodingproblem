/*
This problem was asked by Facebook.

Given a array of numbers representing the stock prices of a company in chronological order, 

write a function that calculates the maximum profit you could have made from buying and selling that stock once. 

You must buy before you can sell it.

For example, given [9, 11, 8, 5, 7, 10], you should return 5, 

since you could buy the stock at 5 dollars and sell it at 10 dollars.

*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
    	    Integer a[]=new Integer[]{9, 11, 8, 5, 7, 10};
    	    Collections.reverse(Arrays.asList(a));
		    System.out.println(buy_and_sell(a));
	}
	public static int buy_and_sell(Integer a[]){
	    int current_max=0,max_profit=0;
	    
	    for(int i=0;i<a.length;i++){
	        current_max=Math.max(current_max,a[i]);
	        int potential_profit=current_max-a[i];
	        max_profit=Math.max(max_profit,potential_profit);
	    }
	    return max_profit;
	}
}


