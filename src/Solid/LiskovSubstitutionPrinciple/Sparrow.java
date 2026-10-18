package Solid.LiskovSubstitutionPrinciple;

public class Sparrow extends Bird implements Flyable {
    public void fly(){
        System.out.println("Sparrow is flying");
    }
}
class Penguin extends Bird{
    public void eat(){
        System.out.println("Penguin eat");
    }

    public static void main(String[] args){
        Bird bird1= new Sparrow();
        Bird bird2 = new Penguin();
        bird1.eat();
        bird2.eat();

        Flyable flyable = new Sparrow();
        flyable.fly();

    }
}