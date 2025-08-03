/*public class minimunCoins_to_make_a_amount {
    static int minCoins(int[]coins,int n){
        if(n==1) return 0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<coins.length;i++){
            if(n-coins[n]>0){
               return minCoins(coins,n-coins[i]);
            }
        }
    }

    public static void main(String[] args) {
        int coins[]={7,5,1};
        int amount=18;
        int res=minCoins(coins,amount);
    }
}*/
