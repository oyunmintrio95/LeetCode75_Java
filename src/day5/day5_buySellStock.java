package day5;

public class day5_buySellStock {
    public static int maxProfit(int[] prices) {
        int currentGap = 0, profit = 0;
        if (prices.length <= 1)
            return 0;

        for (int i=1; i < prices.length; i++) {
            currentGap += prices[i] - prices[i - 1];
            if (currentGap < 0)
                currentGap = 0;
            else if (currentGap > profit)
                profit = currentGap;
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        int profit = maxProfit(prices);

        System.out.println(profit);
    }
}
