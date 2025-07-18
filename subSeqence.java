import java.util.ArrayList;

public class subSeqence {
    public static void main(String[] args) {
        seq(" ","abc");
        ArrayList<String> s=seqArr(" ","dev");
        System.out.println(s);
    }
    static void seq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        seq(p,up.substring(1));
        seq(p+ch,up.substring(1));

    }
    // -----------------------------------using arraylist--------------------------------------------------//
    static ArrayList<String> seqArr(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=seqArr(p,up.substring(1));
        ArrayList<String> right=seqArr(p+ch,up.substring(1));
        left.addAll(right);
        return left;
    }
}

