//You are given an array where each element represents the price of a stock on that day.
// You need to find the maximum profit you can make by buying and selling one stock.
// You can only sell the stock after you buy it.
import java.util.Scanner;

public class BestTimeToBuyAndSellStock {

    public static int max_profit(int[]prices){
        if(prices==null||prices.length==0){
            return 0;
        }
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i:prices){
            if(i<minprice){
                minprice=i;
            }
            int profit=i-minprice;
            if(profit>maxprofit){
                maxprofit=profit;
            }
        }
        return maxprofit;
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array length");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=max_profit(arr);
        System.out.println("Maximum profit :"+ans);
    }
}
