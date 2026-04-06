package ro.ase.cts.template.exercitiul2.model;

public class AutoWashOptions implements AbstractAutoWashOptions {
    private boolean prewashSelected;
    private boolean brushWashingSelected;
    private boolean waxAndPolishSelected;
    private boolean dryingSelected;

    public AutoWashOptions(boolean prewashSelected,
                           boolean brushWashingSelected,
                           boolean waxAndPolishSelected,
                           boolean dryingSelected) {
        this.prewashSelected = prewashSelected;
        this.brushWashingSelected = brushWashingSelected;
        this.waxAndPolishSelected = waxAndPolishSelected;
        this.dryingSelected = dryingSelected;
    }

    @Override
    public boolean isPrewashSelected() {
        return prewashSelected;
    }

    @Override
    public boolean isBrushWashingSelected() {
        return brushWashingSelected;
    }

    @Override
    public boolean isWaxAndPolishSelected() {
        return waxAndPolishSelected;
    }

    @Override
    public boolean isDryingSelected() {
        return dryingSelected;
    }
}