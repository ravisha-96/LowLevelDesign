package BehavioralDesignPatterns.MediatorPattern;

public class Bidder implements Colleague{
    String teamName;
    AuctionMediator auctionMediator;

    Bidder(String teamName, AuctionMediator auctionMediator){
        this.teamName = teamName;
        this.auctionMediator = auctionMediator;
        auctionMediator.addBidder(this);
    }

    @Override
    public void placeBid(double amount) {
        System.out.println(teamName + " placed a bid for "+ amount);
        auctionMediator.placeBid(this, amount);
    }

    @Override
    public String getTeamName() {
        return teamName;
    }

    public void recieveNotification(double amount){
        System.out.println(teamName+ " Got a notification for the bid of amount "+ amount);
    }
}
