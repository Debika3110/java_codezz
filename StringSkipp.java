public class StringSkipp {
    public static void main(String[] args) {
        skip(" ","baccbh");
        String str=skipApple("bbachdappleghd");
        System.out.println(str);
    }
    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if( ch=='a'){
            skip(p,up.substring(1));
        }
        else{
            skip(p+ch,up.substring(1));
        }
    }



    static String skipApple(String up){
        if(up.isEmpty()){

            return " ";
        }

        if( up.startsWith("apple")){
            return skipApple(up.substring(5));
        }
        else{
            return up.charAt(0)+skipApple(up.substring(1));
        }
    }

}
