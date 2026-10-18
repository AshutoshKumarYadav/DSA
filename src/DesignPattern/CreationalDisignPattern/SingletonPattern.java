package DesignPattern.CreationalDisignPattern;


//Creational Design Patterns
//Creational Design Patterns deal with object creation in a flexible and efficient manner.
// They help you control how and when objects are instantiated.
//Examples of Creational Design Patterns include Singleton are: Logger, configuration.
public class SingletonPattern {
    public static void main(String[] args) {
        SingletonPattern s1 = SingletonPattern.getInstance();
        SingletonPattern s2 = SingletonPattern.getInstance();

        System.out.println(s1 == s2);
    }

    private static volatile SingletonPattern instance;
    private SingletonPattern(){

    }
    public static SingletonPattern getInstance(){
        if(instance==null){
           synchronized(SingletonPattern.class){
               if(instance==null){
                   instance = new SingletonPattern();
               }
           }
        }
        return instance;
    }
}









