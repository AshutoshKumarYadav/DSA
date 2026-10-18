package DesignPattern.BehavioralDesignPatterns.Observer;

public class Main {
    public static void main(String[] args){
        YoutubeChannel channel = new YoutubeChannel();
        User user1 = new User("Ashutosh Kumar");
        User user2 = new User("Ankita");
        User user3 = new User("Atharv");

        channel.subscribe(user1);
        channel.subscribe(user2);
        channel.subscribe(user3);

        channel.unsubscribe(user2);

        channel.uploadVideo(" Observer Pattern in java");
    }
}
