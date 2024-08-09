public class dice {
    // what all combinations in a dice can make up a sum of 4
    public static void main(String[] args) {
        combo("",4);
    }
    public static void combo(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<6 && i<=target;i++){
            combo(p+i,target-i);
        }
    }
}
