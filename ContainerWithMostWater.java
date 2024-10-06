//Problem Statement:
//You are given an array of integers height[] where each element represents the height of a line drawn at that position.
// You need to find two lines that, together with the x-axis, form a container that holds the most water.
//
//Two-Pointer Approach:
//The two-pointer technique works by starting with two pointers, one at the beginning (left) and one at the end (right) of the array.
// The idea is to calculate the area formed by the lines at left and right, then adjust the pointers based on the height comparison.
//
//Key Observations:
//The area formed by lines at left and right is determined by the shorter of the two heights.
//By moving the pointer of the shorter height inward, we have a chance to find a taller line, which may increase the area.
//The process is repeated until the two pointers meet.
public class ContainerWithMostWater {
    public static int container(int[] height) {
        int n = height.length;
        int leftpointer = 0;  // Start from the leftmost point
        int rightpointer = n - 1;  // Start from the rightmost point
        int maxWater = 0;  // To store the maximum water area

        while (leftpointer < rightpointer) {
            // Calculate the width between the two pointers
            int width = rightpointer - leftpointer;

            // Calculate the height using the shorter of the two lines
            int length = Math.min(height[leftpointer], height[rightpointer]);

            // Calculate the current water area
            int currentWater = width * length;

            // Update maxWater if the current area is greater than the previous max
            maxWater = Math.max(currentWater, maxWater);

            // Move the pointer with the shorter height using a ternary operator
            if (height[leftpointer] < height[rightpointer]) {
                leftpointer++;
            } else {
                rightpointer--;
            }
        }

        return maxWater;  // Return the maximum water area
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = container(height);
        System.out.println("Maximum water that can be contained: " + result);  // Output: 49
    }
}
