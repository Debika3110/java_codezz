public class numOfzeros {
    public static void main(String[] args) {
        System.out.println(rev(800110));
    }
    public static int rev(int n){
       // int digits=(int)(Math.log10(n))+1;
        int c=0;
        return helper(n,c);
    }

    public static int helper(int n,int c){
        if(n==0) {
            return c;
        }
        if(n%10==0) {
            return helper(n/10,c+1);
        }
            return helper(n/10,c);
    }

}


