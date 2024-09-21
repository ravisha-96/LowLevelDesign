package BehavioralDesignPatterns.StrategyPattern.paymentExample.strategy;

public class CODPaymentStrategy implements PaymentStrategy{

    @Override
    public void processPayment(double amount) {
        // TODO Auto-generated method stub
        System.out.println("please make the payment when you recieve you product at the doorstep for " + amount);
    }
    
}
