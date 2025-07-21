/*
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
two approches:- 1. Burate force  2.Two pointer

 */

import java.util.*;
import java.util.Scanner;
//================================burate force approch=====================================
public class TwoSumProblem_in_array {
    static int[] sum(int arr[],int num){
        int n=arr.length;
        int arr1[]=null;
       // List<Integer> ls=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((arr[i]+arr[j])==num){
                   return new int[]{i,j};
                }
            }
        }
        return new int[]{-1};

    }
    //===============================Two pointer Approch===================================
    static int[] sum1(int []arr,int target){
        int low=0;
        int high=arr.length-1;
        if(high<0) return new int[]{-1,-1};
        while(low<high){
            int currentSum=arr[low]+arr[high];
            if(currentSum==target){
                return new int[]{low,high};
            } else if (currentSum>target) {
                high--;

            }else{
                low++;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        System.out.println("enter the array");
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the sum no. :- ");
        int num=sc.nextInt();
        //System.out.println(Arrays.toString(sum(arr,num)));
        System.out.println(Arrays.toString(sum1(arr,num)));
    }

}
