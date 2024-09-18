package BehavioralDesignPatterns.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator{
    private List<Colleague> bidderList = new ArrayList<>();

    public void addBidder(Colleague bidder){
        //Mediator registers the bidder
        bidderList.add(bidder);
    }

    @Override
    public void placeBid(Colleague bidder, double amount) {
        //Mediator notifies every bidder except the one who has places the bid
        for(Colleague colleague: bidderList){
            if( !colleague.getTeamName().equals(bidder.getTeamName())){
                colleague.recieveNotification(amount, bidder.getTeamName());
            }
        }
    }
}
