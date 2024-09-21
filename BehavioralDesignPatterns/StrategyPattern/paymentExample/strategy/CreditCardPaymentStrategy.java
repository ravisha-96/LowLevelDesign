package BehavioralDesignPatterns.StrategyPattern.paymentExample.strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy{

    @Override
    public void processPayment(double amount) {
        System.out.println("payment made through credit card " + amount);
    }
    
}
