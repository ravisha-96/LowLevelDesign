package BehavioralDesignPatterns.ObserverPattern.AmazonNotify.observable;

import java.util.ArrayList;
import java.util.List;

import BehavioralDesignPatterns.ObserverPattern.AmazonNotify.observer.User;

enum ItemType{
    COKE,
    PEPSI;
}

public class Iphone implements Observable{
    List<User> userList = new ArrayList<>();
    int stock = 0;
    @Override
    public void add(User user){
        userList.add(user);
    }

    @Override
    public void remove(User user){
        userList.remove(user);
    }

    @Override
    public void notifyUsers(){
        
        for(User user: userList){
            user.update();
        }
        
    }

    public void setData(int stock){
        if(this.stock==0){
            this.stock = stock;
            notifyUsers();
        }
        this.stock = stock;
    }

    public int getData(){
        return this.stock;
    }
}
