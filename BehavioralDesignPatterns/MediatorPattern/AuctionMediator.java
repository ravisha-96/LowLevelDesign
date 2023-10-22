package BehavioralDesignPatterns.MediatorPattern;

public interface AuctionMediator {
    void addBidder(Colleague colleague);
    void placeBid(Colleague colleague, double amount);
}
