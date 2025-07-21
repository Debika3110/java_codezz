import java.util.ArrayList;
import java.util.List;
/*
Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.



Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 */

public class subset_generation {
    public static ArrayList<ArrayList<Integer>> subset(int []num){
        ArrayList<ArrayList<Integer>> result =new ArrayList<>();
        ArrayList<Integer> sublist=new ArrayList<>();
        backtrack(0,num,sublist,result);
        return result;
    }
    public static void backtrack(int index,int[]nums,ArrayList<Integer>sublist,ArrayList<ArrayList<Integer>>result){
        result.add(new ArrayList<>(sublist));
        for(int i=0;i<nums.length;i++){
            sublist.add(nums[i]);
            backtrack(i+1,nums,sublist,result);
            sublist.remove(sublist.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        ArrayList<ArrayList<Integer>> result = subset(nums);
        System.out.println(result);
    }
}
