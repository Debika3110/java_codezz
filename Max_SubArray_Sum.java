/*
Example 1:

Input: arr = [-2,1,-3,4,-1,2,1,-5,4]

Output: 6

Explanation: [4,-1,2,1] has the largest sum = 6.

 */

public class Max_SubArray_Sum {
    public static int subArray(int[]arr){
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        int n=arr.length;
        int s=-1;
        int e=-1;
        int start=0;
        for(int i=0;i<n;i++){
            if(sum==0){
                start=i;
            }
            sum+=arr[i];
            if(sum>maxi){
                maxi=sum;
                s=start;
                e=i;
            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.print("[ ");
        for(int i=s;i<e;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");
        return maxi;
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(subArray(arr));
    }
}
