public class Three{
    
    public static int stocks(int num[]){
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i = 0 ; i<num.length ; i++){
            if(buyPrice < num[i]){
                int sellingPrice = num[i];
                int profit = sellingPrice - buyPrice;
                maxProfit = Math.max(maxProfit , profit);
            }else{
                buyPrice = num[i];
            }
            
           
        }
         return maxProfit;
    }
    
    public static void main(String[] args) {
        int num[]={7, 6, 4, 5, 3, 1};
        System.out.println(stocks(num));

    }
}