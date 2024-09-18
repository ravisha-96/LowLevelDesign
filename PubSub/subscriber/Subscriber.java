package PubSub.subscriber;

import java.util.*;

import PubSub.Topic;
import PubSub.messageBroker.MessageBroker;

public class Subscriber {
    private String id;
    private int sleepInTimeMillis;
    private int offset;
    private MessageBroker msgBroker;
    private Topic topic;

    public Subscriber(String id, int t, MessageBroker msgBroker, Topic topic){
        this.id = id;
        this.sleepInTimeMillis = t;
        this.msgBroker = msgBroker;
        this.offset = 0;
        this.topic = topic;
    }

    public String getId() {
        return id;
    }
    public void consume(Topic t) {
        String msg = msgBroker.consume(id, t, offset++);
        // System.out.println("Subscriber: " + id + " started consuming: " + msg);
        try {
            Thread.sleep(this.sleepInTimeMillis);
            msgBroker.consume(this.id, t, offset);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            offset--;
            e.printStackTrace();
        }
        // System.out.println("Subscriber: " + id + " done consuming: " + msg);
    }
}
