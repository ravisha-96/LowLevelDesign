package BehavioralDesignPatterns.StrategyPattern.ticketPricing;

import BehavioralDesignPatterns.StrategyPattern.ticketPricing.strategy.GoldSeatStrategy;
import BehavioralDesignPatterns.StrategyPattern.ticketPricing.strategy.PlatinumSeatStrategy;
import BehavioralDesignPatterns.StrategyPattern.ticketPricing.strategy.SilverSeatStrategy;

public class Main {
    public static void main(String[] args) {
        Seat seat = new Seat(new SilverSeatStrategy());
        System.out.println("Silver " + seat.calculatePrice());
        seat.setSeatTypeStrategy(new GoldSeatStrategy());
        System.out.println("GOld " + seat.calculatePrice());
        seat.setSeatTypeStrategy(new PlatinumSeatStrategy());
        System.out.println("Platinum " + seat.calculatePrice());
    }
}
