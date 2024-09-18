package PubSub;

import PubSub.messageBroker.MessageBroker;
import PubSub.publisher.Publisher;
import PubSub.subscriber.Subscriber;

public class Main {
    public static void main(String[] args) {
        //Create a topic
        Topic topic = new Topic("1", "topic1");

        MessageBroker messageBroker = new MessageBroker();
        //Add topic to the messageBroker
        messageBroker.createTopic(topic);
        //Add publisher to the topic
        Publisher pub1 = new Publisher("pub1", messageBroker);
        topic.addPublisher(pub1);
        //Add consumer to the topic
        Subscriber sub1 = new Subscriber("sub1", 5, messageBroker, topic);
        topic.addSubscriber(sub1);
        //publish messages to the topic
        //We should not publish the message like this, rather write a loop to write to the queue
        Thread pubThread = new Thread(() -> {
            for(int i = 0; i < 10; i++){
                pub1.publishMessage(topic);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        //consume messages from the topic
        //we should not consume messages like this consumer should have a thread running 
        //which keeps the messageBroker polling if the message is not present
        Thread subThread = new Thread(() -> {
            for(int i = 0; i < 10; i++) {
                sub1.consume(topic);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        pubThread.start();
        subThread.start();
    }
}
