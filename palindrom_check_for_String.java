/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.



Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
 */


public class palindrom_check_for_String {
    public static boolean ispalindrom(String s){
        int start=0;
        int end=s.length()-1;
        if(s==null)  return true;
        while(start<=end){
            char charFirst=s.charAt(start);
            char charLast=s.charAt(end);
            if(!Character.isLetterOrDigit(charFirst)){
                start++;
            }
            else if(!Character.isLetterOrDigit(charLast)){
                end--;
            }
            else{
                if(Character.toLowerCase(charFirst)!=Character.toLowerCase(charLast)){
                    return false;
                }
                start++;
                end--;
            }


        }
        return true;
    }

    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(ispalindrom(s));
    }
}
