/*

Given a list of integers S and a target number k, write a function that returns a subset of S that adds up to k. 

If such a subset cannot be made, then return null.

Integers can appear more than once in the list. You may assume all numbers in the list are positive.

For example, given S = [12, 1, 61, 5, 9, 2] and k = 24, return [12, 9, 2, 1] since it sums up to 24.

*/

import java.util.*;
class Main {
    
    public static void main(String args[]){
        int a[]=new int[]{12, 1, 61, 5, 9, 2};
        int k=24;
        System.out.println(combinationSum(a,k));
    }
    public static void findComb(int arr[], int n, int i, int target, 
                                List<Integer> comb, List<List<Integer>> list){
        if(i == n){
            if(target == 0){
                list.add(new ArrayList<>(comb));
            }
            return;
        }
        
        if(target >= arr[i]){
            comb.add(arr[i]);
            findComb(arr, n, i, target - arr[i], comb, list);
            comb.remove(Integer.valueOf(arr[i]));
        }
        
        findComb(arr, n, i + 1, target, comb, list);
    }
    
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        findComb(candidates, candidates.length, 0, target, new ArrayList<>(), list);
        return list;
    }
}
