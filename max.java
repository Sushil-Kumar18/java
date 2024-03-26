public class max {
    public static int Maxpej(int price[]) {
        int buyprice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<price.length;i++){
            if(buyprice<price[i]){
                int profit=price[i]-buyprice;
                maxProfit=Math.max(maxProfit,profit);
            }
            else{ 
                buyprice=price[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int price[]={100,2,1,3,5,7,9,78};
        System.out.println(Maxpej(price));
    }
}
