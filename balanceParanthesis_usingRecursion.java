public class balanceParanthesis_usingRecursion {
    static boolean isBalanced(String str){
        return check(str, 0, 0);
    }
    static boolean check(String str,int index,int count){
        if(count<0) return false;
        if(index==str.length()) {
            return count==0;
        }
        char ch=str.charAt(index);
        if(ch=='('){
            return check(str,index+1,count+1);
        } else if (ch==')') {
            return check(str,index+1,count-1);

        }else{
            return check(str,index+1,count);
        }
    }
    public static void main(String[] args) {
        String input = "(()())";
        System.out.println("Balanced: " + isBalanced(input)); // true

        String input2 = "(()";
        System.out.println("Balanced: " + isBalanced(input2)); // false

        String input3 = "())(()";
        System.out.println("Balanced: " + isBalanced(input3)); // false
    }
}
