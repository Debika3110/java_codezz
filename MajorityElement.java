import java.util.Arrays;

public class MajorityElement {
    public static int major(int[]nums){
        int freq=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(freq==0){
                ans=nums[i];
            }
            if(nums[i]==ans){
                freq++;
            }
            else{
                freq--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[]nums={1,2,3,1,1};
       int ans= major(nums);
        System.out.println(ans);
    }
}
