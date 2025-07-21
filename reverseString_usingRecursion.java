public class reverseString_usingRecursion {
    public String reverse(String str,int start,int end){

       if(start>end){
            return "";
        }

        return str.charAt(end)+reverse(str,start,end-1);


    }
}
class main{
    public static void main(String[]args){
        String str="Debika";
        int n=str.length()-1;
        reverseString_usingRecursion obj=new reverseString_usingRecursion();
        String rev=obj.reverse(str,0,n);
        System.out.println(rev);

    }
}
