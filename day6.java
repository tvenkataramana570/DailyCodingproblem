import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int a[][]=new int[][]{{10,15,30},{12,15,20},{17,20,32}};//output:[10,12,15,15,12,20,20,30,32]
		int n=a.length;
		int b[]=new int[3*n];
		int k=0;
		//ArrayList<Integer> c =new ArrayList<Integer>();
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        b[k]=a[i][j];
		        k++;
		        //c.add(a[i][j]);
		    }
		}
		Arrays.sort(b);
		for(int i=0;i<b.length;i++){
		    System.out.print(b[i]+" ");
		}
		//Collections.sort(c);
		//System.out.print(c);
	}
}
