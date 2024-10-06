//Approach:
//Use two pointers, left and right, initialized at the start and the end of the array, respectively.
//Maintain two variables, left_max and right_max, to store the maximum height encountered so far from the left and right pointers.
//Compare the height at the left and right pointers:
//If the height at left is less than or equal to the height at right, then water can be trapped based on the left_max. Update left_max and move the left pointer to the right.
//If the height at right is less than the height at left, then water can be trapped based on the right_max. Update right_max and move the right pointer to the left.
//Continue this process until the two pointers meet.



public class Trapping_rain_Water {
    public static int waterStore(int[]height){
        int n=height.length;
        int left_max=0;
        int right_max=0;
        int l=0;
        int r=n-1;
        int ans=0;
        while(l<r){
            if(height[l]>left_max){
                left_max=Math.max(height[l],left_max);
            }
            if(height[r]>right_max){
                right_max=Math.max(height[r],right_max);
            }
            if(left_max<right_max){
                ans+=left_max-height[l];
                l++;
            }
            else{
                ans+=right_max-height[r];
                r--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1}; // Example input
        int result = waterStore(height);
        System.out.println("Total water trapped: " + result);
    }
}
