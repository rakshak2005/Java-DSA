public class MAXPROFIT{
	
	
	public static int maxprofit(int[] prices) {
		
		int MinPrice = 1000000000;
		int MaxProfit = 0;
		
		for (int price: prices) {
			MinPrice = Math.min(MinPrice,price);
			int profit = price - MinPrice;
			MaxProfit = Math.max(MaxProfit, profit);
			
		}
		
		return MaxProfit;
	}
	
	
	
	public static void main(String[] args) {
		
		int[] prices = {7,1,5,3,6,4 };
		
		int ans = maxprofit(prices);
		System.out.println(ans);
		
		
	}
	
	
	
	
	
}
