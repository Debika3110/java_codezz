public class lowercaseTouppercase_usingRecursion {
    public static String upper(String str,int n){
        if(n==-1){
            return "";

        }
        char ch=str.charAt(n);
        char upch=(char)(ch-'a'+'A');
        return upper(str,n-1)+upch;
    }
    public static void main(String[] args) {
        String s="devika";
        System.out.println(upper(s,s.length()-1));
    }
}
