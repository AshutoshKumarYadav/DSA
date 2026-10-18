package Solid.InterfaceSegregationPrincipleProblemSolve;

public class Human implements Employee,Employee1,Employee3{
    public void work(){
        System.out.println("Human can work");
    }
    public void eat(){
        System.out.println("Human is eating");
    }
    public void sleep(){
        System.out.println("Human is sleeping");
    }
}

class Robot implements Employee{
    public void work(){
        System.out.println("Robot will work");
    }
}


