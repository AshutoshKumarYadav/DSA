package DesignPattern.BehavioralDesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel {
    private List<Observer> subscribers = new ArrayList<>();

    public void subscribe(Observer observer){
    subscribers.add(observer);
    }

    public void unsubscribe(Observer observer){
        subscribers.remove(observer);
    }

    public void notifySubscriber(String message){
        for(Observer observer : subscribers){
            observer.update(message);
        }
    }

    public void uploadVideo(String videoName){
        System.out.println("New video uploaded"+videoName);
        notifySubscriber(videoName);
    }
}
