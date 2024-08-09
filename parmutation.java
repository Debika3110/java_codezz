public class parmutation {
    public static void main(String[] args) {

        parmutate("","abc");
        System.out.println(count("","abc"));
    }
    static void parmutate(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            parmutate(f + ch + s,up.substring(1));
        }
    }
    //////////////////////////////////////counting number of answers///////////////////////////////////////////////
    static int count(String p,String up){
        if(up.isEmpty()){

            return 1;
        }
        int c=0;
        char ch= up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            c=c+count(f + ch + s,up.substring(1));
        }
        return c;
    }
}
