package BehavioralDesignPatterns.MediatorPattern;

public interface Colleague {
    void recieveNotification(double amount);
    void placeBid(double amount);
    String getTeamName();
}
