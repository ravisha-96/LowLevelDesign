package PubSub;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    private final String id;
    private final String name;
    private List<Message> messageList;
    private List<TopicSubscriber> subscriberList;

    public Topic(String id, String name){
        this.id = id;
        this.name = name;
        messageList = new ArrayList<>();
        subscriberList = new ArrayList<>();
    }


    //who is responsible for adding the message(?)
    public addMessage()
}
