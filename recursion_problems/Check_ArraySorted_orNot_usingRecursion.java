package recursion_problems;/*
Given an array of integers, write a recursive function to check if the array is sorted in non-decreasing order.

Return true if the array is sorted, otherwise return false.

Example 1:
Input:
arr = [1, 2, 3, 4, 5]
n = 5

Output: true

Explanation: Each element is greater than or equal to the previous one.

Example 2:
Input:
arr = [1, 2, 3, 6, 5]
n = 5

Output: false

Explanation: 5 < 6, so the array is not sorted in non-decreasing order.

Example 3:
Input:
arr = [7]
n = 1

Output: true

Explanation: Single-element arrays are considered sorted.

Constraints:

1 <= arr.length <= 10^4
-10^9 <= arr[i] <= 10^9
 */


public class Check_ArraySorted_orNot_usingRecursion {
    static boolean isSorted(int[]arr,int n){
        //int n=arr.length;
        if(n==1 || n==0) return true;
        if(arr[n-1]<arr[n-2]){
            return false;
        }
        return isSorted(arr,n-1);

    }

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        System.out.println(isSorted(arr,arr.length));
    }
}
