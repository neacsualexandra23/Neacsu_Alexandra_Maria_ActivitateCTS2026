package ro.ase.cts.builder.exercitiu1.model;

public class Pacient implements IInternare{
    private final String nume;
    private final boolean patRabatabil;
    private final boolean micDejunInclus;
    private final boolean papuciCamera;
    private final boolean halatInterior;

    private Pacient(Builder builder) {
        this.nume = builder.nume.trim();
        this.patRabatabil = builder.patRabatabil;
        this.micDejunInclus = builder.micDejunInclus;
        this.papuciCamera = builder.papuciCamera;
        this.halatInterior = builder.halatInterior;
    }

    @Override
    public void print() {
        System.out.println("Nume: "+nume);
        System.out.println("PatRabatabil: "+patRabatabil);
        System.out.println("micDejunInclus: "+micDejunInclus);
        System.out.println("papuciCamera: "+papuciCamera);
        System.out.println("halatInterior: "+halatInterior);
    }

    // Builder Pattern
    public static class Builder {
        private final String nume;
        private boolean patRabatabil;
        private boolean micDejunInclus;
        private boolean papuciCamera;
        private boolean halatInterior;

        public Builder(String nume) {
            this.nume = nume;
        }

        public Builder cuPatRabatabil(boolean valoare) {
            this.patRabatabil = valoare;
            return this;
        }

        public Builder cuMicDejunInclus(boolean valoare) {
            this.micDejunInclus = valoare;
            return this;
        }

        public Builder cuPapuciCamera(boolean valoare) {
            this.papuciCamera = valoare;
            return this;
        }

        public Builder cuHalatInterior(boolean valoare) {
            this.halatInterior = valoare;
            return this;
        }

        public Pacient build() {
            return new Pacient(this);
        }
    }
}