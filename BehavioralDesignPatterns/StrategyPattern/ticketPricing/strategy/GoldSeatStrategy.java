package BehavioralDesignPatterns.StrategyPattern.ticketPricing.strategy;

public class GoldSeatStrategy implements SeatTypeStrategy{

    @Override
    public double calculatePrice() {
        // TODO Auto-generated method stub
        return 400;
    }
    
}
