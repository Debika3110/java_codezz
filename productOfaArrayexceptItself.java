import java.util.Arrays;

//The Product of Array Except Self problem asks us to return an array where each element is the product of all elements in the original array except the element at that index. The challenge is to solve this without using division and in O(n) time complexity.
//
//Optimized Solution (without using division):
//This solution uses two passes over the array:
//
//In the first pass, we calculate the product of all elements to the left of each element.
//In the second pass, we calculate the product of all elements to the right of each element and multiply it with the corresponding left product.
public class productOfaArrayexceptItself {
    public static int[] product(int[]nums){
        int n=nums.length;
        int []ans=new int[n];
        ans[0]=1;
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]*nums[i-1];
        }
        int surffix=1;
        for(int j=n-1;j>=0;j--){
            ans[j]=ans[j]*surffix;
            surffix=surffix*nums[j];
        }
        return ans;
    }

    public static void main(String[] args) {
        int []nums={1,2,3,4};
        int []ans=product(nums);
        System.out.println(Arrays.toString(ans));
    }
}
