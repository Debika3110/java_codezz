package recursion_problems;

import java.util.*;
/*
Given an array arr of non-negative integers and an integer target, the task is to count all subsets of the array whose sum is equal to the given target.

Examples:

Input: arr[] = [5, 2, 3, 10, 6, 8], target = 10
Output: 3
Explanation: The subsets {5, 2, 3}, {2, 8}, and {10} sum up to the target 10.
Input: arr[] = [2, 5, 1, 4, 3], target = 10
Output: 3
Explanation: The subsets {2, 1, 4, 3}, {5, 1, 4}, and {2, 5, 3} sum up to the target 10.
Input: arr[] = [5, 7, 8], target = 3
Output: 0
Explanation: There are no subsets of the array that sum up to the target 3.
 */
public class perfectSum_usingRecursion {
    public static void sum(int[]arr,int index,int target,List<List<Integer>>result,List<Integer>temp){
        if(index==arr.length){
            //int count=0;
            int sum=0;
            for(int i:temp){
                sum+=i;
            }
            if(sum==target){
                result.add(new ArrayList<>(temp));
            }
            return;
        }
        sum(arr,index+1,target,result,temp);
        temp.add(arr[index]);
        sum(arr,index+1,target,result,temp);
        temp.remove(temp.size()-1);

    }
    public static void main(String[] args) {
        int arr[]={0,1};
        int target=1;
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        int sum=0;
        sum(arr,0,target,result,temp);
        System.out.println(result.size());
        for(List<Integer> i:result){
            System.out.println(i);
        }

    }
}
