/****************************************************************************************************************************************
This problem was asked by Amazon.
An sorted array of integers was rotated an unknown number of times.
Given such an array, find the index of the element in the array in faster than linear time. If the element doesn't exist in the array, 
return null.
For example, given the array [13, 18, 25, 2, 8, 10] and the element 8, return 4 (the index of 8 in the array).
You can assume all the integers in the array are unique.
****************************************************************************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    
	    int arr[]=new int[]{13, 18, 25, 2, 8, 10};
	    int k=8;
	    int n=arr.length;
		System.out.println(find_index(arr,0,n-1,k));
	}
	public static int find_index(int[] arr,int low,int high,int key){
    	if(low>high)
    		return -1;
    	int mid = (low+high)/2;
    	if(arr[mid]==key)
    		return mid;
    	if(arr[low]<=arr[mid]){
    		if(key>=arr[low] && key<=arr[mid])
    			return find_index(arr,low,mid-1,key);
    		return find_index(arr,mid+1,high,key);
    	}
    	if(key>=arr[mid] && key<=arr[high])
    		return find_index(arr,mid+1,high,key);
    	return find_index(arr,low,mid-1,key);
    }
}
