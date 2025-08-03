// In here i have printed all the substing with same max length

package Two_Pointer_And_SlidingWindow;

import java.util.*;

public class subString_without_repeat {
    public static void subString(String str){
        int n =str.length();
        int l=0;
        int r=0;
        int max=0;

        Set<Character> set=new HashSet<>();
        List<String> res=new ArrayList<>();

        while(r<n){
            while(set.contains(str.charAt(r))){
                set.remove(str.charAt(l));
                l++;
            }
            set.add(str.charAt(r));
            int len=r-l+1;
            if(max<len){
                max=len;

                res.clear();
                res.add(str.substring(l,r+1));
            } else if (len==max) {
                res.add(str.substring(l,r+1));
            }

            r++;

        }
        System.out.println("Maximum substring without repearting : "+max);
        System.out.println("The subString is : "+res);

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        subString(str);
    }
}
