package PubSub.subscriber;

import java.util.*;

public class SleepingSubscriber implements ISubscriber{
    private String id;
    private int sleepInTimeMillis;
    public String getId() {
        return id;
    }
    public void consume(Message message) {
        System.out.println("Subscriber: " + id + " started consuming: " + message.getMsg());
        Thread.sleep(sleepTimeInMillis);
        System.out.println("Subscriber: " + id + " done consuming: " + message.getMsg();
    }
}
