package Solid.InterfaceSegregationPrincipleProblemSolve;

public class Main {
    public static void main(){
        System.out.println("Printing ");

        Human human = new Human();
        human.work();
        human.eat();
        human.sleep();

        Robot robot = new Robot();
        robot.work();
    }
}
