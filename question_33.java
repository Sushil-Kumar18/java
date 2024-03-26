public class question_33 {
    // This is the code to check buy and sell stocks
    public static int Stock(int price[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i <price.length; i++){
            if(buyPrice < price[i]){
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4};
        System.out.println(Stock(arr));;

    }
    
}
