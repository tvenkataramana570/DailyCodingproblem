/*
Suppose you are given a table of currency exchange rates, represented as a 2D array. Determine whether there is a possible arbitrage: that is, whether there is some sequence of trades you can make, 
starting with some amount A of any currency, so that you can end up with some amount greater than A of that currency.

There are no transaction costs and you can trade fractional quantities.
*/
public class Main
{
	public static void main(String[] args) {
	    double a[][]=new double[][]{ {1, 1.30, 1.6}, {0.68, 1, 1.1}, {0.6, 0.9, 1} };
	    int n=a.length;
		System.out.println(arbitrage(a,n));
	}
	public static boolean arbitrage(double a[][],int n){
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	            a[i][j]=Math.log(a[i][j]);
	        }
	    }
	    int src=0;
	    double min_dist[]=new double[n];
	    min_dist[src]=0;
	    for(int i=0;i<n-1;i++){
	        for(int j=0;j<n;j++){
	            for(int k=0;k<n;k++){
	                if (min_dist[k] > min_dist[j] + a[j][k])
                    min_dist[k] = min_dist[j] + a[j][k];
	            }
	        }
	    }
	    for(int j=0;j<n;j++){
	        for(int k=0;k<n;k++){
	            if (min_dist[k] > min_dist[j] + a[j][k])
	            return true;
	        }
	    }
	    return false;
	}
}
