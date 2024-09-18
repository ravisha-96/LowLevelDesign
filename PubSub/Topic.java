package PubSub;

import java.util.ArrayList;
import java.util.List;

import PubSub.publisher.Publisher;
import PubSub.subscriber.Subscriber;

public class Topic {
    private final String id;
    private final String name;
    private List<Subscriber> subscriberList;
    private List<Publisher> publishersList;

    public Topic(String id, String name){
        this.id = id;
        this.name = name;
        subscriberList = new ArrayList<>();
        publishersList = new ArrayList<>();
    }

    public void addPublisher(Publisher pub) {
        this.publishersList.add(pub);
    }

    public void addSubscriber(Subscriber sub){
        this.subscriberList.add(sub);
    }

}

// Publisher -  uniqueId, messageBroker - publishMessage()
// Consumer -   uniqueId, (topic -> offset) - consumeMessage()
// MessageBroker -  Topics-> Messages     - createTopic()
// Topic - topicName, List<Consumer>, List<Publisher> - addConsumer(), addPublisher()

// --> Let's do now for a single topci and a single publisher and subcriber
// -> Let's have multiple subscriber using multithreading.