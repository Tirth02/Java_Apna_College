package ArraysPart2;

public class bestTimetoBuySell {

    public static int buyAndSellStocks(int nums[])
    {
        int bp = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < nums.length;i++)
        {
            int sp = nums[i];
            if(bp < sp)
            {
                if(maxProfit < sp-bp)
                {
                    maxProfit = sp-bp;
                }  
            }
            else
            {
                bp = sp;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println("Maximum profit could be = "+buyAndSellStocks(prices));
    }
}
