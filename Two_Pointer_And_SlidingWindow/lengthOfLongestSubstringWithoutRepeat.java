/*
Given a String, find the length of longest substring without any repeating character.

Examples:

Example 1:

Input: s = ”abcabcbb”

Output: 3

Explanation: The answer is abc with length of 3.
 */


package Two_Pointer_And_SlidingWindow;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class lengthOfLongestSubstringWithoutRepeat {
    public static int maxLength(String str){
        int n=str.length();
        int l=0;
        int max=Integer.MIN_VALUE;
        Map<Character,Integer> map=new HashMap<>();

        for(int r=0;r<n;r++){
            if(map.containsKey(str.charAt(r)) && l<=map.get(str.charAt(r)) ){
                l=map.get(str.charAt(r))+1;
            }
            max=Math.max(max,r-l+1);
            map.put(str.charAt(r),r);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        int res=maxLength(str);
        System.out.print("The maximun subString with no repeating character is :  "+res);

    }
}
