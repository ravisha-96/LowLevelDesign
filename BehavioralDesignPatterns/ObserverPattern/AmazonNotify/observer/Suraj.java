package BehavioralDesignPatterns.ObserverPattern.AmazonNotify.observer;

import BehavioralDesignPatterns.ObserverPattern.AmazonNotify.observable.Observable;

public class Suraj implements User{
    Observable observable;

    public Suraj(Observable observable){
        this.observable = observable;
    }

    @Override
    public void update(){
        System.out.println("Suraj " + observable.getClass() + " is back in stock "+observable.getData());
    }
}
