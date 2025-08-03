package recursion_problems;

import java.util.ArrayList;
import java.util.List;

/*
Here we have to generate a sub string of a given array of string str={a,b,c}
the sub string will be [], [c], [b], [b, c], [a], [a, c], [a, b], [a, b, c]
 */

public class subStringGenerate_usingRecursion {
    public static void subSequence(String[]str,int index,int len,List<List<String>>result,List<String>temp){

        if(index==len){
            result.add(new ArrayList<>(temp));
            return;
        }

            //not include
            subSequence(str,index+1,len,result,temp);
            temp.add(str[index]);
            subSequence(str,index+1,len,result,temp);
            temp.remove(temp.size()-1);



    }
    public static void main(String[]args){
       // Scanner sc=new Scanner(System.in);
        String []str ={"a", "b","c"};
        int n=str.length;
        List<List<String>> result=new ArrayList<>();
        List<String> temp=new ArrayList<>();
        subSequence(str,0,n,result,temp);
        System.out.println(result);

    }

}
