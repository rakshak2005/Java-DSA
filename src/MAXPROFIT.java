
public class MAXPROFIT {
	
	public static int maxprofit(int[] prices) {
		int minProfit = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for (int price: prices){
			minProfit = Math.min(minProfit,price);
			
			int profit = price - minProfit;
			maxProfit = Math.max(maxProfit,profit);
		}
		
		return maxProfit;
	}
	
	
    public static void main (String[] args) {
    	int[] prices = {7,6,4,3,1};
    	int ans = maxprofit(prices);
    	System.out.println(ans);
    }
}
