/*
Given an array of integers and a number k, where 1 <= k <= length of the array, compute the maximum values of each subarray of length k.

For example, given array = [10, 5, 2, 7, 8, 7] and k = 3, we should get: [10, 7, 8, 8], since:

10 = max(10, 5, 2)
7 = max(5, 2, 7)
8 = max(2, 7, 8)
8 = max(7, 8, 7)
Do this in O(n) time and O(k) space. You can modify the input array in-place and you do not need to store the results. You can simply print them out as you compute them.

*/
public class Main
{
    static void printKMax(int arr[], int n, int k)
    {
        int j, max,m=0;
 
        for (int i = 0; i <= n - k; i++) {
 
            max = arr[i];
 
            for (j = 1; j < k; j++) {
                if (arr[i + j] > max)
                    max = arr[i + j];
            }
            if(m<max) m=max;
        }
        System.out.print(m);
    }
 
    
    public static void main(String args[])
    {
        int arr[] = { 10, 5, 2, 7, 8, 7 };
        int k = 3;
        printKMax(arr, arr.length, k);
    }
}
