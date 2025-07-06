import java.util.Arrays;

public class sortArraysOfZerosOnesTwos {
    public static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void sort(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 2, 0, 1, 1, 2, 1, 0};
        sort(nums);  // Sort the array
        System.out.println("The sorted array is: " + Arrays.toString(nums));
    }
}
