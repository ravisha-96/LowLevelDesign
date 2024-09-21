package BehavioralDesignPatterns.StrategyPattern.ticketPricing.strategy;

public class SilverSeatStrategy implements SeatTypeStrategy{

    @Override
    public double calculatePrice() {
        // TODO Auto-generated method stub
        return 300;
    }
    
}
