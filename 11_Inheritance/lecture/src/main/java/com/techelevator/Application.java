package com.techelevator;

public class Application {

    public static void main(String[] args) {

        // Create a new general auction
        System.out.println("Starting a general auction");
        System.out.println("-----------------");

        Auction generalAuction = new Auction("Tech Elevator t-shirt");

        generalAuction.placeBid(new Bid("Josh", 1));
        generalAuction.placeBid(new Bid("Fonz", 23));
        generalAuction.placeBid(new Bid("Rick Astley", 13));

        for(Bid bid : generalAuction.getAllBids()){
            System.out.println(bid.getBidder());
            System.out.println(bid.getBidAmount());
        }

        System.out.println("The winner of the auction is: " + generalAuction.getHighBid().getBidder());

        ReserveAuction reserveAuction = new ReserveAuction("Smelly old shoe", 80);
        reserveAuction.placeBid(new Bid("Kat", 75));
        reserveAuction.placeBid(new Bid("Mark", 81));
        reserveAuction.placeBid(new Bid("Nife", 10));
        System.out.println("The winner of the Reserve Auction is: " + reserveAuction.getHighBid().getBidder());

        BuyoutAuction buyoutAuction = new BuyoutAuction("Cap-tion generator", 20);
        buyoutAuction.placeBid(new Bid("Kat", 18));
        buyoutAuction.placeBid(new Bid("Rachelle", 10));
        buyoutAuction.placeBid(new Bid("James", 1000));
        System.out.println("The winner of the buyout auction is: " + buyoutAuction.getHighBid().getBidder() + " with a bid of: " + buyoutAuction.getHighBid().getBidAmount());


        //....
        //....
        // This might go on until the auction runs out of time or hits a max # of bids

    }
}
