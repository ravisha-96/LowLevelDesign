package BehavioralDesignPatterns.ObserverPattern;

import BehavioralDesignPatterns.ObserverPattern.AmazonNotify.observable.Iphone;
import BehavioralDesignPatterns.ObserverPattern.AmazonNotify.observable.Observable;
import BehavioralDesignPatterns.ObserverPattern.AmazonNotify.observable.Samsung;
import BehavioralDesignPatterns.ObserverPattern.AmazonNotify.observer.Ravi;
import BehavioralDesignPatterns.ObserverPattern.AmazonNotify.observer.Suraj;

public class Main{
    public static void main(String[] args){
        System.out.println("testing notifier for Iphone");

        Observable observable1 = new Iphone();
        observable1.add(new Ravi(observable1));
        observable1.add(new Suraj(observable1));
        System.out.println("Suraj and Ravi has subscribed for notify when Iphone comes back into stock");
        observable1.setData(10);
        
        System.out.println();
        System.out.println("testing notifier for samsung");
        System.out.println();
        Observable observable2 = new Samsung();
        observable2.add(new Ravi(observable2));
        observable2.add(new Suraj(observable2));

        System.out.println("Suraj and Ravi has subscribed for notify when Samsung comes back into stock");
        observable2.setData(100);
        observable2.setData(200);
    }
}