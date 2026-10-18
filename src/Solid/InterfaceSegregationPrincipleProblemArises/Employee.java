package Solid.InterfaceSegregationPrincipleProblemArises;

public interface Employee {
    void work();
    void eat();
    void sleep();

}
class Human implements Employee {
    public void work(){
        System.out.println("Human is working");
    }
    public void eat(){
        System.out.println("Human is eating");
    }
    public void sleep(){
        System.out.println("Human is sleep");
    }
}

class Robot implements Employee {
    public void work(){
        System.out.println("Robot is working");
    }
    public void eat(){
        //no code
        // this is the problem
    }
    public void sleep(){
        //no code
        // so this is the problem
    }
}
