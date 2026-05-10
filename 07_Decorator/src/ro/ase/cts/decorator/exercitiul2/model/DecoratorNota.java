package ro.ase.cts.decorator.exercitiul2.model;


public abstract class DecoratorNota implements INotaDePlata{
    private INotaDePlata notaDePlata;

    public DecoratorNota(INotaDePlata notaDePlata){
        this.notaDePlata=notaDePlata;
    }

    @Override
    public void printeaza() {
        notaDePlata.printeaza();
    }
}
