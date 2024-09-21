package BehavioralDesignPatterns.StrategyPattern.paymentExample.strategy;

public class UPIPaymentStrategy implements PaymentStrategy{

    @Override
    public void processPayment(double amount) {
        // TODO Auto-generated method stub
        System.out.println("payment made through UPI for " + amount);
    }
    
}
