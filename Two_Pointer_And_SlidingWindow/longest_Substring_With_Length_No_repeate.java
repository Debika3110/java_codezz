// In here we need to print the substring too alongg with the length

package Two_Pointer_And_SlidingWindow;

import java.util.*;

public class longest_Substring_With_Length_No_repeate {
    public static void subString(String str){
        int n =str.length();
        int l=0;
        int r=0;
        int max=0;
        int s=0;
        Set<Character> set=new HashSet<>();


        while(r<n){
            while(set.contains(str.charAt(r))){
                set.remove(str.charAt(l));
                l++;
            }
            set.add(str.charAt(r));

            if(max<(r-l+1)){
                max=r-l+1;
                s=l;

            }

            r++;

        }
        System.out.println("Maximum substring without repearting : "+max);
        System.out.println("The subString is : "+str.substring(s,max+s));

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        subString(str);
    }
}
