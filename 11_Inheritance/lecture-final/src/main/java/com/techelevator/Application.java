package com.techelevator;

public class Application {

    public static void main(String[] args) {

        // Create a new general auction
        System.out.println("Starting a general auction");
        System.out.println("-----------------");

        Auction testAuction = new Auction("This is a stupid string!");

        Auction generalAuction = new Auction("Tech Elevator t-shirt");

        generalAuction.placeBid(new Bid("Josh", 1));
        generalAuction.placeBid(new Bid("Fonz", 23));
        generalAuction.placeBid(new Bid("Rick Astley", 13));

        for(Bid bid : generalAuction.getAllBids()){
            System.out.println(bid.getBidder());
            System.out.println(bid.getBidAmount());
        }

        System.out.println("The winner of the auction is: " + generalAuction.getHighBid().getBidder());

        ReserveAuction reserveAuction = new ReserveAuction("smelly old shoe", 80);
        reserveAuction.placeBid(new Bid("Mark", 2));
        reserveAuction.placeBid(new Bid("Nife", 10));
        reserveAuction.placeBid(new Bid("Nate", 81));
        System.out.println("The winner of the reserve auction is: " + reserveAuction.getHighBid().getBidder());
    }
}
