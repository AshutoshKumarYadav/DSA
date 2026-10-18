package Solid.LiskovSubstitutionPrincipleVoilation;
//voilates the priciple
public class Penguin extends Bird {
    public void fly(){
        throw new UnsupportedOperationException("Penguin cannot fly");
    }
}
