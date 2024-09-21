package BehavioralDesignPatterns.StrategyPattern.ticketPricing.strategy;

public class PlatinumSeatStrategy implements SeatTypeStrategy{

    @Override
    public double calculatePrice() {
        // TODO Auto-generated method stub
        return 500;
    }
    
}
