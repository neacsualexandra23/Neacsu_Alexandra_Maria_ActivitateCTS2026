package ro.ase.cts.template.exercitiul2.model;

public abstract class AutoWashTemplate {
    private final AbstractAutoWashOptions options;

    public AutoWashTemplate(AbstractAutoWashOptions options) {
        this.options = options;
    }

    public final void executeWashProgram() {


        if (options.isPrewashSelected()) {
            System.out.println("Se aplica faza de prespalare.");
        }

        if (options.isBrushWashingSelected()) {
            System.out.println("Se aplica faza de spalare cu perii.");
        }

        if (options.isWaxAndPolishSelected()) {
            System.out.println("Se aplica faza de ceruire si polish.");
        }

        if (options.isDryingSelected()) {
            System.out.println("Se aplica faza de uscare.");
        }


    }

}