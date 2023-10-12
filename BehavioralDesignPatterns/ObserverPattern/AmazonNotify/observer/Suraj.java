package ObserverPattern.AmazonNotify.observer;

import ObserverPattern.AmazonNotify.observable.Observable;

public class Suraj implements User{
    Observable observable;

    public Suraj(Observable observable){
        this.observable = observable;
    }

    @Override
    public void update(){
        System.out.println("Ravi " + observable.getClass() + " is back in stock "+observable.getData());
    }
}
