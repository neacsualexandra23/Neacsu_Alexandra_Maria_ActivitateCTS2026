package ro.ase.cts.template.exercitiul2.model;

public class AutoWashProgram extends AutoWashTemplate {
    private AbstractAutoWashOptions options;
    private String programName;

    public AutoWashProgram(String programName, AbstractAutoWashOptions options) {
        this.programName = programName;
        this.options = options;
    }

    @Override
    protected AbstractAutoWashOptions getOptions() {
        return options;
    }


}