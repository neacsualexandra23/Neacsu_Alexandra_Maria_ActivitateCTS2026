package ro.ase.cts.builder.exercitiu2.model;

public class Eticheta implements IEticheta {

    private final String dataExpirare;
    private final String importator;
    private final String ingrediente;
    private final String gramaj;

    // constructor privat → doar Builder poate crea
    private Eticheta(Builder builder) {
        this.dataExpirare = builder.dataExpirare;
        this.importator = builder.importator;
        this.ingrediente = builder.ingrediente;
        this.gramaj = builder.gramaj;
    }

    @Override
    public void print() {
        System.out.println("Eticheta:");
        System.out.println("Data expirare: " + dataExpirare);
        System.out.println("Importator: " + importator);
        System.out.println("Ingrediente: " + ingrediente);
        System.out.println("Gramaj: " + gramaj);
    }

    // ===== Builder =====
    public static class Builder {

        // valori implicite ""
        private String dataExpirare = "";
        private String importator = "";
        private String ingrediente = "";
        private String gramaj = "";

        public Builder setDataExpirare(String dataExpirare) {
            this.dataExpirare = dataExpirare;
            return this;
        }

        public Builder setImportator(String importator) {
            this.importator = importator;
            return this;
        }

        public Builder setIngrediente(String ingrediente) {
            this.ingrediente = ingrediente;
            return this;
        }

        public Builder setGramaj(String gramaj) {
            this.gramaj = gramaj;
            return this;
        }

        public Eticheta build() {
            return new Eticheta(this);
        }
    }
}