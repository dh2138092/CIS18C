/** Records the purchase and sale of stocks, and provides the capital
gain or loss. */
public class StockLedger
{
	StockPurchase share;
	
    public StockLedger ()
    {
    } // end default constructor


    /** Records a stock purchase in this ledger.
    @param sharesBought the number of shares purchased
    @param pricePerShare the price per share */
 
    public void buy (int sharesBought, double pricePerShare)
    {
        for (; sharesBought > 0 ; sharesBought--)
        {
            StockPurchase purchase = new StockPurchase (pricePerShare);
        } // end for
    } // end buy


    /** Removes from this ledger any shares that were sold
    and computes the capital gain or loss.
    @param sharesSold the number of shares sold
    @param pricePerShare the price per share
    @return the capital gain (loss) */
    
    public double sell (int sharesSold, double pricePerShare)
    {
        double saleAmount = sharesSold * pricePerShare;
        double totalCost = 0;
        while (sharesSold > 0)
        {
            double shareCost = share.getCostPerShare ();
            totalCost = totalCost + shareCost;
            sharesSold--;
        } // end while
        return saleAmount - totalCost; // gain or loss
    } // end sell
    
} // end StockLedger