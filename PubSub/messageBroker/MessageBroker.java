package PubSub.messageBroker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import PubSub.Topic;

public class MessageBroker {
    private Map<Topic, Queue<String> > topicToMsgs; 
    
    public MessageBroker() {
        this.topicToMsgs = new HashMap<>();
    }

    public void createTopic(Topic t){
        topicToMsgs.put(t, new LinkedList<>());
    }
    public synchronized void publish(String pubId, Topic t, String msg) {
        //Need to check if pub is authorized to publish to the topic
        if(topicToMsgs.containsKey(t) ){
            topicToMsgs.get(t).offer(msg);
            System.out.println("msg published in broker" + msg);
        } else{
            System.out.println("invalid topic");
        }
    }

    public synchronized String consume(String subId, Topic t, int offset) {
        //Check if subsriber is authorized to consume from the topic.
        if(topicToMsgs.containsKey(t)) {
            if(offset + 1 > topicToMsgs.get(t).size()){
                try {
                    System.out.println("sleeping for 5 secs");
                    Thread.sleep(5000);
                    return null;
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            try{
                String msg = topicToMsgs.get(t).poll();
                System.out.println("msg consumed");
                return msg;
            } catch(Exception e){
                throw e;
            }
            
        }
        return null;
    }

}
