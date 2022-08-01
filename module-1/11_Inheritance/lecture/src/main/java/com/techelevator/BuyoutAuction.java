package com.techelevator;

public class BuyoutAuction extends Auction{

    private int buyoutPrice;
    private boolean isBuyoutPriceMet;

    public BuyoutAuction(String itemForSale, int buyoutPrice){
        super(itemForSale);
        this.buyoutPrice = buyoutPrice;
    }

    /*
    This class overrides the default placedBid behavior of the parent class.
    If the offeredBid meets or exceeds the buyoutPrice, the offeredBid is
    set to the buyoutPrice and all future bids are ignored.
     */

    @Override
    public boolean placeBid(Bid offeredBid){
        boolean isCurrentWinningBid = false;
        if(isBuyoutPriceMet == true){
            return isCurrentWinningBid;
        }
        if(offeredBid.getBidAmount() >= buyoutPrice){
         String bidder = offeredBid.getBidder();
            offeredBid = new Bid(bidder, buyoutPrice);
            //ignore all future bids
            isBuyoutPriceMet = true;
        }
        isCurrentWinningBid = super.placeBid(offeredBid);

        return isCurrentWinningBid;
    }
}
