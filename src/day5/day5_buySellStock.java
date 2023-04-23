package day5;

public class day5_buySellStock {
    public static int maxProfit(int[] prices) {
        int profit=0;
        int day = 0;
        // find the length of the array
        int len = prices.length;



        // find minimum prices in the array
        int min = prices[0];
        int minIdx = 0;
        for(int i=0; i<len; i++){
            if(prices[i]<min){
                min = prices[i];
                minIdx = i;
            }
        }
        //find a maximum profit by traversing the array
        if (minIdx != len){
            for(int i = minIdx; i<len; i++){
                for(int j=minIdx+1; j<len; j++){
                    if(profit < prices[j] - min){
                        profit = prices[j] - min;
                        day = j+1;
                    }
                }
            }
        }

        return day;




    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        int profit = maxProfit(prices);

        System.out.println(profit);
    }
}
