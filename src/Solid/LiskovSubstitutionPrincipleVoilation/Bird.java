package Solid.LiskovSubstitutionPrincipleVoilation;

public class Bird {
    public void eat(){
        System.out.println("Bird is eating");
    }
    public void fly(){
        System.out.println("Bird is flying");
    }
}


/*2. Where does LSP break?

Now suppose we create a Penguin.

class Penguin extends Bird {

    @Override
    public void fly() {
        throw new UnsupportedOperationException(
                "Penguin cannot fly"
        );
    }
}*/
