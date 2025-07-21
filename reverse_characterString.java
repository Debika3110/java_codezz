/*
Input: A character array s
Output: The character array s is reversed in-place

Steps:

Initialize Two Pointers:

  i = 0 (points to the start of the array)

  j = s.length - 1 (points to the end of the array)

Loop until i < j:

  Store s[i] in a temporary variable ch

  Assign s[j] to s[i]

  Assign ch (original s[i]) to s[j]

  Increment i (move forward)

  Decrement j (move backward)

End the loop when i >= j

  At this point, the array has been reversed in-place.
 */

public class reverse_characterString {
    public static void main(String[]args){
       char[] str={'h','e','l','l','o'};
        /* for(int i=str.length-1;i>=0;i--){
            System.out.println(str[i]);
        }*/
        int low=0;
        int high=str.length-1;

        while(low<=high){
            char temp=str[low];
            str[low]=str[high];
            str[high]=temp;
            low++;
            high--;
        }
        System.out.print(str);
    }
}
