//Problem Statement:
//Given an unsorted array of integers nums, find the length of the longest consecutive elements sequence.
//
//Optimized Solution Approach:
//The optimized solution uses a set to achieve a linear time complexity of O(n).
//
//Insert all elements into a set: This allows for quick lookups of any integer in constant time.
//Find the start of a sequence: For each number, check if it's the start of a sequence by verifying if num - 1 does not exist in the set.
// If num is the start, count how long the sequence continues.
//Update the maximum length: Track the longest sequence encountered.
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int longest(int[] nums) {
        // Edge case: if the array is empty
        if (nums.length == 0) {
            return 0;
        }

        // Create a HashSet to store all numbers for O(1) lookups
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        int maxLength = 0; // Variable to track the maximum length of consecutive sequences

        // Iterate through each number in the HashSet
        for (int i : set) {
            // Check if this number is the start of a sequence
            if (!set.contains(i - 1)) {
                int currentNum = i; // Start with the current number
                int currentStreak = 1; // Initialize current streak count

                // Count the length of the current consecutive sequence
                while (set.contains(currentNum + 1)) {
                    currentNum += 1; // Move to the next number in the sequence
                    currentStreak += 1; // Increment the streak count
                }

                // Update maxLength if currentStreak is longer
                maxLength = Math.max(maxLength, currentStreak);
            }
        }

        return maxLength; // Return the maximum length of consecutive sequences found
    }

    public static void main(String[] args) {
        int[] ans = {100, 4, 200, 1, 3, 2}; // Input array
        int result = longest(ans); // Call the method
        System.out.println("Length of the longest consecutive sequence: " + result); // Output: 4
    }
}
