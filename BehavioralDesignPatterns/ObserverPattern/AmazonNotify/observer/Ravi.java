package BehavioralDesignPatterns.ObserverPattern.AmazonNotify.observer;

import BehavioralDesignPatterns.ObserverPattern.AmazonNotify.observable.Observable;

public class Ravi implements User{
    Observable observable;
    public Ravi(Observable observable){
        this.observable = observable;
    }

    @Override
    public void update(){
        System.out.println(observable.getClass() + " is back in stock" +observable.getData());
    }
}
