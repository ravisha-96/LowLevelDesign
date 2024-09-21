package BehavioralDesignPatterns.StrategyPattern.paymentExample;

import BehavioralDesignPatterns.StrategyPattern.paymentExample.strategy.CODPaymentStrategy;
import BehavioralDesignPatterns.StrategyPattern.paymentExample.strategy.CreditCardPaymentStrategy;
import BehavioralDesignPatterns.StrategyPattern.paymentExample.strategy.UPIPaymentStrategy;

public class Main {
    public static void main(String[] args) {
        Booking booking = new Booking();

        //Credit card
        booking.setPaymentStrategy(new CreditCardPaymentStrategy());
        booking.processPayment(5000);

        //UPI
        booking.setPaymentStrategy(new UPIPaymentStrategy());
        booking.processPayment(10000);

        //COD
        booking.setPaymentStrategy(new CODPaymentStrategy());
        booking.processPayment(6000);
    }
}
