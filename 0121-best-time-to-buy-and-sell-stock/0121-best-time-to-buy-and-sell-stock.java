class Solution{
    public int maxProfit(int [] prices){

        int min = Integer.MAX_VALUE;
        int maxprofit =0;

        for(int i=0;i<prices.length;i++){
            if(prices[i] < min){
                min = prices[i];
            }

            int profit = prices[i] - min;

            if(profit > maxprofit){
                maxprofit = profit;
            }
        }
        return maxprofit;
    }
}

class Main{
    public static void main(String[] args) {
        int[] prices1 ={ 7,1,5,3,6,4};
        int[] prices2 ={7,6,4,3,1};

        Solution s = new Solution();
        System.out.println(s.maxProfit(prices1));
        System.out.println(s.maxProfit(prices2));

    }
}