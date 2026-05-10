package ro.ase.cts.decorator.exercitiul2.model;

public class LMA extends DecoratorNota{
    public LMA(INotaDePlata notaDePlata){
        super(notaDePlata);
    }

    @Override
    public void printeaza() {
        super.printeaza();
        System.out.println("LA multi ani");
    }
}
