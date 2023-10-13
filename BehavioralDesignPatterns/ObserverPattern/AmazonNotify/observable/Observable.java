package BehavioralDesignPatterns.ObserverPattern.AmazonNotify.observable;
import java.util.List;

import BehavioralDesignPatterns.ObserverPattern.AmazonNotify.observer.User;

public interface Observable {
    List<User> userList=null;
    public void add(User user);
    public void remove(User user);
    public void notifyUsers();
    public int getData();
    public void setData(int data);
}
