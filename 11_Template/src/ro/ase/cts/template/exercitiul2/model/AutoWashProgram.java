package ro.ase.cts.template.exercitiul2.model;

public class AutoWashProgram extends AutoWashTemplate {

    private String programName;

    public AutoWashProgram(String programName, AbstractAutoWashOptions  options) {
        super(options);
        this.programName = programName;

    }



}