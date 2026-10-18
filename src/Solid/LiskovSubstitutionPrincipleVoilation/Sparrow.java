package Solid.LiskovSubstitutionPrincipleVoilation;

public class Sparrow extends Bird{
    public void fly(){
        System.out.println("Sparrow is flying");
    }

    public static void main(String[] args){
    Bird bird = new Sparrow();

    bird.eat();
    bird.fly();
    Bird birdP = new Penguin();
    birdP.eat();
    birdP.fly();
    }
}


