package problems;

public class Best_Time_to_Buy_and_Sell_Stock {
	
    public int maxProfit(int[] prices) {
    	
		/*
		 *Calculate maximum profit from multiple stock transactions.
		 *Buy and sell whenever there's a price increase from one day to the next.
		 *Args: 
		 *	prices: List of stock prices where prices[i] is the price on day i
		 *Returns:
		 *  Maximum profit achievable from multiple buy-sell transactions
		 */
    	
    	/*
    	 *  a is the price on day i and b is the price on day i+1.
    	 * If b - a > 0: The price increased, so we make a profit by buying at price a and selling at price b
    	 * If b - a ≤ 0: The price decreased or stayed the same, so we don't trade (profit = 0)
    	 */
    	
    	int total_profit = 0;
    	int dailyProfit;
    	
    	for(int day = 1; day<prices.length; day++)
    	{
    		dailyProfit = prices[day] - prices[day - 1];
    		
            // Only add positive profits (equivalent to buying before price increases)
            // If profit is negative, we simply don't trade (add 0)
    		total_profit+=Math.max(0, dailyProfit);
    	}
        
    	return total_profit;
    } 

	public static void main(String[] args) {
/*
 * You are given prices where prices[i] = the price of a given stock on the ith day.
 * On each day, you may decide to buy and/or sell the stock. 
 * You can only hold at most one share of the stock at any time. 
 * However, you can sell and buy the stock multiple times on the same day,
 * ensuring you never hold more than one share of the stock.
 * Find and return the maximum profit you can achieve.
 */
		


	}

}
