package BehavioralDesignPatterns.StrategyPattern.paymentExample;

import BehavioralDesignPatterns.StrategyPattern.paymentExample.strategy.PaymentStrategy;

public class Booking {
    private PaymentStrategy paymentStrategy;


    public void processPayment(double amount) {
        paymentStrategy.processPayment(amount);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
