package BehavioralDesignPatterns.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator{
    private List<Colleague> bidderList = new ArrayList<>();
    public void addBidder(Colleague bidder){
        bidderList.add(bidder);
    }

    @Override
    public void placeBid(Colleague bidder, double amount) {
        for(Colleague colleague: bidderList){
            if( !colleague.getTeamName().equals(bidder.getTeamName())){
                colleague.recieveNotification(amount);
            }
        }
    }
}
