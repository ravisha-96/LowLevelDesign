package BehavioralDesignPatterns.MediatorPattern;

public class Bidder implements Colleague{
    String teamName;
    AuctionMediator auctionMediator;

    Bidder(String teamName, AuctionMediator auctionMediator){
        this.teamName = teamName;
        this.auctionMediator = auctionMediator;
        //Bidder registers itself with the mediator
        auctionMediator.addBidder(this);
    }

    @Override
    public void placeBid(double amount) {
        System.out.println(teamName + " placed a bid for "+ amount);
        //Bidder notifies about his bidding
        auctionMediator.placeBid(this, amount);
    }

    @Override
    public String getTeamName() {
        return teamName;
    }

    public void recieveNotification(double amount){
        //Bidder get the notification from the mediator about the new bidding
        System.out.println(teamName+ " Got a notification for the bid of amount "+ amount);
    }
}
