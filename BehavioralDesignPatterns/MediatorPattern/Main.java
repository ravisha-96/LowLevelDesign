package BehavioralDesignPatterns.MediatorPattern;

public class Main {
    public static void main(String[] args) {
        AuctionMediator mediator = new Auction();
        Colleague csk = new Bidder("CSK", mediator);
        Colleague kkr = new Bidder("KKR", mediator);
        Colleague mi = new Bidder("MI", mediator);

        csk.placeBid(1000);
        System.out.println("------------------");
        mi.placeBid(1200);
        System.out.println("------------------");
        kkr.placeBid(1600);
    }
}
