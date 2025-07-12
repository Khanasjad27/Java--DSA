import java.util.*;;

public class BuyNSellStock {
    public static int sellStock ( int price[]){

        int n = price.length;
        int p = 0;
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(buyPrice<price[i]){
                p = price[i] - buyPrice;   // today's profit
                maxProfit = Math.max(maxProfit, p);
            }else{
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int Stock[] = {7,1,5,3,6,4};
        System.out.println("Max Profit: "+sellStock(Stock));

    }
}
