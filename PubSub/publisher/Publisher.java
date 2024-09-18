package PubSub.publisher;

import PubSub.Topic;
import PubSub.messageBroker.MessageBroker;

public class Publisher {
    private String id;
    private MessageBroker messageBroker;
    private static int messageCount;
    public Publisher(String id, MessageBroker messageBroker){
        this.id = id;
        this.messageBroker = messageBroker;
        this.messageCount = 0;
    }

    public void publishMessage(Topic t){
        String id = "msg" + String.valueOf(messageCount++);
        String randomMsg = "this is msg" + String.valueOf(messageCount);
        // System.out.println("publishing message" + id);
        messageBroker.publish(id, t, randomMsg);
        // System.out.println(id + "published");
    }
}
