package langauge.basics;

public class Assignment11BuySellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int prices[] = {7,1,5,3,6,4};
		
		int minPrice = prices[0];
		
		int maxProfit = 0;
		
		for(int i=0;i<=prices.length-1;i++) {
			
			if(prices[i]<minPrice) {
				
				minPrice=prices[i];
				
			}
			
			int profit = prices[i]-minPrice;
			if(profit>maxProfit) {
				
				maxProfit=profit;
				
			}
			
			
		}
		
		System.out.println("MaximumProfit: " + maxProfit);
		
		
	}

}
