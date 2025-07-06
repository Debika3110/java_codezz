public class removeDuplicate{
    public static int remove(int[]nums){
        if (nums.length == 0) {
            return 0; // If array is empty, return 0
        }
        int dupli=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[dupli]){
                dupli++;
                nums[dupli]=nums[i];
            }

        }
        return dupli+1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int length=remove(nums);
        for (int i = 0; i < length; i++) {
            System.out.print("["+nums[i]+",]");
        }
    }
}
