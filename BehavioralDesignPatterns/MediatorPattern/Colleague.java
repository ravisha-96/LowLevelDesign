package BehavioralDesignPatterns.MediatorPattern;

public interface Colleague {
    void recieveNotification(double amount, String bidderTeam);
    void placeBid(double amount);
    String getTeamName();
}
