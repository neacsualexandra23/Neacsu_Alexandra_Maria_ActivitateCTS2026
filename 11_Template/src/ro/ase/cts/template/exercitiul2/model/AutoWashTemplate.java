package ro.ase.cts.template.exercitiul2.model;

public abstract class AutoWashTemplate {

    public final void executeWashProgram() {
        enterTunnel();

        if (getOptions().isPrewashSelected()) {
            applyPrewash();
        }

        if (getOptions().isBrushWashingSelected()) {
            applyBrushWashing();
        }

        if (getOptions().isWaxAndPolishSelected()) {
            applyWaxAndPolish();
        }

        if (getOptions().isDryingSelected()) {
            applyDrying();
        }

        finishProgram();
    }

    protected void enterTunnel() {
        System.out.println("Masina intra in tunelul de spalare.");
    }

    protected void applyPrewash() {
        System.out.println("Se aplica faza de prespalare.");
    }

    protected void applyBrushWashing() {
        System.out.println("Se aplica faza de spalare cu perii.");
    }

    protected void applyWaxAndPolish() {
        System.out.println("Se aplica faza de ceruire si polish.");
    }

    protected void applyDrying() {
        System.out.println("Se aplica faza de uscare.");
    }

    protected void finishProgram() {
        System.out.println("Programul de spalare s-a incheiat.");
    }

    protected abstract AbstractAutoWashOptions getOptions();
}