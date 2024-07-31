public class leetcodeprblm {
    public static void main(String[] args) {
        System.out.println(steps(14));
    }
    public static int steps(int n){
        return helper( n,0);
    }

    public static int helper(int n,int step) {
        // using recursion
       /* if(n==0){
            return step;
        }
        if(n%2==0){
            return helper(n/2,step+1);
        }
        return helper(n-1,step+1);*/

        // using loop
        while (n>0){
            if(n%2==0){
                n=n/2;
                //step=step+1;
            }
            else {
                n=n-1;
            }
            step+=1;
        }
        return step;
    }
}
