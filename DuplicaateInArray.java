//Using a HashSet is indeed a straightforward approach to solving the "Find the Duplicate Number" problem.
// In this method, we will iterate through the array and store each number we encounter in a HashSet.
// If we come across a number that is already in the HashSet, we have found our duplicate.

import java.util.HashSet;
import java.util.Scanner;

public class DuplicaateInArray {
    public static int duplicate(int []nums){
        HashSet<Integer> seen=new HashSet<>();
        for(int i:nums){
            if(seen.contains(nums[i])){
                return nums[i];
            }
            seen.add(nums[i]);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter your array size:");
        int n=sc.nextInt();
        System.out.println("enter your array:");
        int [] nums=new int[n];
        for (int i = 0; i < n; i++){
            nums[i]=sc.nextInt();
        }
        int ans=duplicate(nums);
        System.out.println("The duplicate numbers are:"+ans);
    }
}
