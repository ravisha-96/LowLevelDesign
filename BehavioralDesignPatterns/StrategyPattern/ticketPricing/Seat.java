package BehavioralDesignPatterns.StrategyPattern.ticketPricing;

import BehavioralDesignPatterns.StrategyPattern.ticketPricing.strategy.SeatTypeStrategy;

public class Seat {
   private SeatTypeStrategy seatTypeStrategy;

   public Seat(SeatTypeStrategy seatTypeStrategy) {
    this.seatTypeStrategy = seatTypeStrategy;
   }

   public double calculatePrice() {
    return seatTypeStrategy.calculatePrice();
   }

   public void setSeatTypeStrategy(SeatTypeStrategy seatTypeStrategy) {
    this.seatTypeStrategy = seatTypeStrategy;
   }
}
