package recursion_problems;/*
Given a set of m distinct positive integers and a value 'N'. The problem is to count the total number of ways we can form 'N' by doing sum of the array elements. Repetitions and different arrangements are allowed.

Examples :



Input: arr = {1, 5, 6}, N = 7
Output: 6
Explanation: The different ways are:
1+1+1+1+1+1+1
1+1+5
1+5+1
5+1+1
1+6
6+1
 */

public class waysTogetSum_usingRecursion {
    public static int sum(int[]arr,int sum){
        if(sum==0){
            return 1;
        }
        if(sum<0 ){
            return 0;
        }

        int ans=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i] == 0) continue;
            ans+=sum(arr,sum-arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[]arr={0,1};
        //sum(arr,0,6);
        System.out.println(sum(arr,7));
    }
}
