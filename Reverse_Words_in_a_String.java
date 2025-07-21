/*
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.



Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
 */

public class Reverse_Words_in_a_String {
    public static String reverse(String s){
        StringBuilder rev=new StringBuilder();
        int i=s.length()-1;
        while(i>=0){
            if(s.charAt(i)==' ') i--;
            if(i<0) break;
            int end =i;
            while(i>=0 && s.charAt(i)!=' '){
                i--;
            }
            if(rev.length()!=0){
                rev.append(' ');
            }
            rev.append(s.substring(i+1,end+1));
        }
        return rev.toString();
    }

    public static void main(String[] args) {
        String s="  blue is the sky  ";
        System.out.println(reverse(s));
    }

}
